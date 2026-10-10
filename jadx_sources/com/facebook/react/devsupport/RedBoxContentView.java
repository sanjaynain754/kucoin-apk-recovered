package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.react.C5771R;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class RedBoxContentView extends LinearLayout implements AdapterView.OnItemClickListener {
    private boolean isReporting;
    private DevSupportManager mDevSupportManager;
    private Button mDismissButton;

    @Nullable
    private View mLineSeparator;

    @Nullable
    private ProgressBar mLoadingIndicator;

    @Nullable
    private RedBoxHandler mRedBoxHandler;
    private Button mReloadJsButton;

    @Nullable
    private Button mReportButton;
    private View.OnClickListener mReportButtonOnClickListener;
    private RedBoxHandler.ReportCompletedListener mReportCompletedListener;

    @Nullable
    private TextView mReportTextView;
    private ListView mStackView;

    public static class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {
        private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        private final DevSupportManager mDevSupportManager;

        private OpenStackFrameTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        private static JSONObject stackFrameToJson(StackFrame stackFrame) {
            return new JSONObject(MapBuilder.m10225of("file", stackFrame.getFile(), "methodName", stackFrame.getMethod(), "lineNumber", Integer.valueOf(stackFrame.getLine()), "column", Integer.valueOf(stackFrame.getColumn())));
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(StackFrame... stackFrameArr) {
            try {
                String string = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (StackFrame stackFrame : stackFrameArr) {
                    FirebasePerfOkHttpClient.execute(okHttpClient.newCall(new Request.Builder().url(string).post(RequestBody.create(JSON, stackFrameToJson(stackFrame).toString())).build()));
                }
            } catch (Exception e11) {
                C45999a.m101508n(ReactConstants.TAG, "Could not open stack frame", e11);
            }
            return null;
        }
    }

    public static class StackAdapter extends BaseAdapter {
        private static final int VIEW_TYPE_COUNT = 2;
        private static final int VIEW_TYPE_STACKFRAME = 1;
        private static final int VIEW_TYPE_TITLE = 0;
        private final StackFrame[] mStack;
        private final String mTitle;

        public static class FrameViewHolder {
            private final TextView mFileView;
            private final TextView mMethodView;

            private FrameViewHolder(View view) {
                this.mMethodView = (TextView) view.findViewById(C5771R.id.rn_frame_method);
                this.mFileView = (TextView) view.findViewById(C5771R.id.rn_frame_file);
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (i11 == 0) {
                TextView textView = view != null ? (TextView) view : (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5771R.layout.redbox_item_title, viewGroup, false);
                String str = this.mTitle;
                if (str == null) {
                    str = "<unknown title>";
                }
                textView.setText(str.replaceAll("\\x1b\\[[0-9;]*m", ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C5771R.layout.redbox_item_frame, viewGroup, false);
                view.setTag(new FrameViewHolder(view));
            }
            StackFrame stackFrame = this.mStack[i11 - 1];
            FrameViewHolder frameViewHolder = (FrameViewHolder) view.getTag();
            frameViewHolder.mMethodView.setText(stackFrame.getMethod());
            frameViewHolder.mFileView.setText(StackTraceHelper.formatFrameSource(stackFrame));
            frameViewHolder.mMethodView.setTextColor(stackFrame.isCollapsed() ? -5592406 : -1);
            frameViewHolder.mFileView.setTextColor(stackFrame.isCollapsed() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.mStack.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            return i11 == 0 ? this.mTitle : this.mStack[i11 - 1];
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i11) {
            return i11 == 0 ? 0 : 1;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i11) {
            return i11 > 0;
        }

        public StackAdapter(String str, StackFrame[] stackFrameArr) {
            this.mTitle = str;
            this.mStack = stackFrameArr;
            C38115a.m86047c(str);
            C38115a.m86047c(stackFrameArr);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        new OpenStackFrameTask((DevSupportManager) C38115a.m86047c(this.mDevSupportManager)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (StackFrame) this.mStackView.getAdapter().getItem(i11));
    }

    public void refreshContentView() {
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        StackFrame[] lastErrorStack = this.mDevSupportManager.getLastErrorStack();
        ErrorType lastErrorType = this.mDevSupportManager.getLastErrorType();
        Pair<String, StackFrame[]> pairProcessErrorCustomizers = this.mDevSupportManager.processErrorCustomizers(Pair.create(lastErrorTitle, lastErrorStack));
        setExceptionDetails((String) pairProcessErrorCustomizers.first, (StackFrame[]) pairProcessErrorCustomizers.second);
        RedBoxHandler redBoxHandler = this.mDevSupportManager.getRedBoxHandler();
        if (redBoxHandler != null) {
            redBoxHandler.handleRedbox(lastErrorTitle, lastErrorStack, lastErrorType);
            resetReporting();
        }
    }

    public void resetReporting() {
        RedBoxHandler redBoxHandler = this.mRedBoxHandler;
        if (redBoxHandler == null || !redBoxHandler.isReportEnabled()) {
            return;
        }
        this.isReporting = false;
        ((TextView) C38115a.m86047c(this.mReportTextView)).setVisibility(8);
        ((ProgressBar) C38115a.m86047c(this.mLoadingIndicator)).setVisibility(8);
        ((View) C38115a.m86047c(this.mLineSeparator)).setVisibility(8);
        ((Button) C38115a.m86047c(this.mReportButton)).setVisibility(0);
        ((Button) C38115a.m86047c(this.mReportButton)).setEnabled(true);
    }

    public RedBoxContentView setDevSupportManager(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
        return this;
    }

    public void setExceptionDetails(String str, StackFrame[] stackFrameArr) {
        this.mStackView.setAdapter((ListAdapter) new StackAdapter(str, stackFrameArr));
    }

    public RedBoxContentView setRedBoxHandler(@Nullable RedBoxHandler redBoxHandler) {
        this.mRedBoxHandler = redBoxHandler;
        return this;
    }

    public RedBoxContentView(Context context) {
        super(context);
        this.isReporting = false;
        this.mReportCompletedListener = new RedBoxHandler.ReportCompletedListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.1
            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportError(SpannedString spannedString) {
                RedBoxContentView.this.isReporting = false;
                ((Button) C38115a.m86047c(RedBoxContentView.this.mReportButton)).setEnabled(true);
                ((ProgressBar) C38115a.m86047c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(8);
                ((TextView) C38115a.m86047c(RedBoxContentView.this.mReportTextView)).setText(spannedString);
            }

            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportSuccess(SpannedString spannedString) {
                RedBoxContentView.this.isReporting = false;
                ((Button) C38115a.m86047c(RedBoxContentView.this.mReportButton)).setEnabled(true);
                ((ProgressBar) C38115a.m86047c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(8);
                ((TextView) C38115a.m86047c(RedBoxContentView.this.mReportTextView)).setText(spannedString);
            }
        };
        this.mReportButtonOnClickListener = new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (RedBoxContentView.this.mRedBoxHandler == null || !RedBoxContentView.this.mRedBoxHandler.isReportEnabled() || RedBoxContentView.this.isReporting) {
                    return;
                }
                RedBoxContentView.this.isReporting = true;
                ((TextView) C38115a.m86047c(RedBoxContentView.this.mReportTextView)).setText("Reporting...");
                ((TextView) C38115a.m86047c(RedBoxContentView.this.mReportTextView)).setVisibility(0);
                ((ProgressBar) C38115a.m86047c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(0);
                ((View) C38115a.m86047c(RedBoxContentView.this.mLineSeparator)).setVisibility(0);
                ((Button) C38115a.m86047c(RedBoxContentView.this.mReportButton)).setEnabled(false);
                RedBoxContentView.this.mRedBoxHandler.reportRedbox(view.getContext(), (String) C38115a.m86047c(RedBoxContentView.this.mDevSupportManager.getLastErrorTitle()), (StackFrame[]) C38115a.m86047c(RedBoxContentView.this.mDevSupportManager.getLastErrorStack()), RedBoxContentView.this.mDevSupportManager.getSourceUrl(), (RedBoxHandler.ReportCompletedListener) C38115a.m86047c(RedBoxContentView.this.mReportCompletedListener));
            }
        };
    }

    public void init() {
        LayoutInflater.from(getContext()).inflate(C5771R.layout.redbox_view, this);
        ListView listView = (ListView) findViewById(C5771R.id.rn_redbox_stack);
        this.mStackView = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(C5771R.id.rn_redbox_reload_button);
        this.mReloadJsButton = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((DevSupportManager) C38115a.m86047c(RedBoxContentView.this.mDevSupportManager)).handleReloadJS();
            }
        });
        Button button2 = (Button) findViewById(C5771R.id.rn_redbox_dismiss_button);
        this.mDismissButton = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((DevSupportManager) C38115a.m86047c(RedBoxContentView.this.mDevSupportManager)).hideRedboxDialog();
            }
        });
        RedBoxHandler redBoxHandler = this.mRedBoxHandler;
        if (redBoxHandler != null && redBoxHandler.isReportEnabled()) {
            this.mLoadingIndicator = (ProgressBar) findViewById(C5771R.id.rn_redbox_loading_indicator);
            this.mLineSeparator = findViewById(C5771R.id.rn_redbox_line_separator);
            TextView textView = (TextView) findViewById(C5771R.id.rn_redbox_report_label);
            this.mReportTextView = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mReportTextView.setHighlightColor(0);
            Button button3 = (Button) findViewById(C5771R.id.rn_redbox_report_button);
            this.mReportButton = button3;
            button3.setOnClickListener(this.mReportButtonOnClickListener);
        }
    }
}
