package acdlab.lt.dataSortApp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DataSortAppServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
