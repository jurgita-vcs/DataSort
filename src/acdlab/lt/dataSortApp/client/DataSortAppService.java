package acdlab.lt.dataSortApp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("DataSortAppService")
public interface DataSortAppService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use DataSortAppService.App.getInstance() to access static instance of DataSortAppServiceAsync
     */
    public static class App {
        private static DataSortAppServiceAsync ourInstance = GWT.create(DataSortAppService.class);

        public static synchronized DataSortAppServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
