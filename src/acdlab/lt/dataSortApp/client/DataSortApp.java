package acdlab.lt.dataSortApp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class DataSortApp implements EntryPoint {

    private Button button = new Button("Sort");
    private Label label = new Label();
    private TextArea textArea = new TextArea();
    private VerticalPanel panel = new VerticalPanel();
    private FlexTable flexTable = new FlexTable();

    private List<List<String>> data = new ArrayList<>();

    public void onModuleLoad() {

        textArea.setCharacterWidth(100);
        textArea.setVisibleLines(10);
        textArea.setReadOnly(true);

        panel.setSpacing(10);
        panel.add(textArea);

        flexTable.setBorderWidth(1);
        flexTable.getFlexCellFormatter().setColSpan(textArea.getOffsetHeight(), textArea.getOffsetWidth(), 4);

        RootPanel.get("textArea").add(panel);
        RootPanel.get("button").add(button);
        RootPanel.get("table").add(flexTable);
        RootPanel.get().add(label);

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {

                String[] line = textArea.getText().split("\\n");
                Arrays.sort(line);

            }
        });

    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }
}
