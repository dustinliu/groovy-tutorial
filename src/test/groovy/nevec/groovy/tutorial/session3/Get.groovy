package nevec.groovy.tutorial.session3
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import groovyx.net.http.ContentType

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/an id (.+)$/) { String i ->
    id = i
}

When(~/call the get method with this id/) { ->
    try {
        r = tutorialClient.get(path: "/m.json", query:[id: id])
    } catch (ex) {
        r = ex.response
    }
}

Then(~/the http status code should be (\d+)/) { int status ->
    assert r.status == status
}

And(~/the mid in response should be (.+)$/) { String mid ->
    assert r.data.response_data[0].detail_response_data.merchandise_data.mid == mid
//    def a = [a: 'a', b: 'b', c: 'c', d:[1 ,2 ,4]]
//    def b = [a: 'a', d: [1,2,4],c: 'c', b: 'b']
//    assert a == b
}

When(~/post a new merchandise/) { ->
    r = tutorialClient.post(path: '/post.php', requestContentType: ContentType.JSON , body : [a:'a', b:[t:'t'],
                                                                                              c:[1, 2,3]])
}
