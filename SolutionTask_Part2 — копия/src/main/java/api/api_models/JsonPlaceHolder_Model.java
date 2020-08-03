package api.api_models;

import io.restassured.http.Method;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import utills.NetworkCore;

import java.util.HashMap;


import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_GET;
import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_PUT;
import static constans.JsonPlaceHolder_Constans.Servers.JsonPlaceHolder_URL;

public class JsonPlaceHolder_Model extends NetworkCore {
    @Setter
    @Getter
    @Builder
    public static class RequestModel{
        private int userId;
        private int postId;
    }

    public JsonPlaceHolder_Model searchByUserId(RequestModel model, Method method, int statusCode){
        HashMap requestParams = new HashMap();
        requestParams.put("postId",model.getPostId());
        requestSpecBuilder.setBaseUri(JsonPlaceHolder_URL + JsonPlaceHolder_GET)
                .addQueryParams(requestParams);
        sendRequestAndGetResponse(method,statusCode);
        return this;
    }

    public JsonPlaceHolder_Model updateByUserId(RequestModel model,Method method,int statusCode){
        HashMap requestParams = new HashMap();
        requestParams.put("userId",model.getUserId());
        requestSpecBuilder.setBaseUri(JsonPlaceHolder_URL + JsonPlaceHolder_PUT)
                .addQueryParams(requestParams);
        sendRequestAndGetResponse(method,statusCode);
        return this;
    }
}
