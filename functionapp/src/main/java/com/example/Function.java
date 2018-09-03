package com.example;

import java.util.*;
import com.microsoft.azure.functions.*;

public class Function {
    public HttpResponseMessage negotiate(
            HttpRequestMessage<Optional<String>> request,
            SignalRConnectionInfo connectionInfo,
            final ExecutionContext context) {

        return request
            .createResponseBuilder(HttpStatus.OK)
            .body(connectionInfo)
            .header("Content-type", "application/json")
            .build();
    }

    public HttpResponseMessage messages(
            HttpRequestMessage<String> request,
            // HttpRequestMessage<ChatMessage> request, // <- doesn't work
            OutputBinding<List<SignalRMessage>> signalRMessages, // <- doesn't work
            final ExecutionContext context) {

        // ChatMessage message = request.getBody();
        // List<Object> messageList = new ArrayList<Object>();
        // messageList.add(message);
        // signalRMessages.setValue(messageList);

        return request
            .createResponseBuilder(HttpStatus.OK)
            .header("Content-type", "application/json")
            .build();
    }
}
