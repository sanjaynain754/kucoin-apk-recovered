package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::dashboard")
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final String TAG = "DashboardManager";
    private final Context mAppContext;
    private final C34777g mDashboardManagerView;
    private boolean mIsInit;
    private final C34777g.a mSelectedDashboardChangeListener;
    private String mSelectedDashboardId;
    private final Handler mUIHandler;
    private final ArrayList<String> mDashboards = new ArrayList<>();
    private final Map<String, String> mDashboardStatus = new HashMap();
    private final Map<String, StringBuilder> mDashboardLogs = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            return;
        }
        this.mDashboards.add(str);
        C34777g c34777g = this.mDashboardManagerView;
        c34777g.f73644e.add(str);
        if (c34777g.f73651l == null) {
            c34777g.f73651l = c34777g.f73644e.getItem(0);
            c34777g.f73654o.mo76165a(0);
        }
        c34777g.m76173a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendLogInternal(String str, String str2) {
        C34777g c34777g;
        TextView textView;
        if (this.mDashboards.contains(str)) {
            StringBuilder sb2 = this.mDashboardLogs.get(str);
            if (sb2 == null) {
                sb2 = new StringBuilder();
                this.mDashboardLogs.put(str, sb2);
            }
            sb2.append(str2);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            if (sb2.length() > 15000) {
                sb2.delete(0, sb2.length() / 2);
            }
            if (!str.equals(this.mSelectedDashboardId) || (textView = (c34777g = this.mDashboardManagerView).f73648i) == null) {
                return;
            }
            textView.append(str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            ScrollView scrollView = c34777g.f73650k;
            if (scrollView == null || scrollView.getScrollY() + c34777g.f73650k.getHeight() + c34777g.m76172a(100) < c34777g.f73648i.getMeasuredHeight()) {
                return;
            }
            c34777g.f73643d.post(RunnableC34779i.m76179a(c34777g));
        }
    }

    private boolean init() {
        if (this.mIsInit) {
            return true;
        }
        C34777g c34777g = this.mDashboardManagerView;
        Context context = c34777g.f73642c;
        if (context == null) {
            Log.m76033e("DashboardManagerView", "dashBoardManagerView context is null", new Object[0]);
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
            c34777g.f73645f = windowManager;
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(c34777g.f73640a);
                c34777g.f73653n = c34777g.f73640a.heightPixels - c34777g.m76172a(50);
                C34777g c34777g2 = this.mDashboardManagerView;
                if (Build.VERSION.SDK_INT >= 26) {
                    c34777g2.f73641b.type = 2038;
                } else {
                    c34777g2.f73641b.type = 2002;
                }
                WindowManager.LayoutParams layoutParams = c34777g2.f73641b;
                layoutParams.format = 1;
                layoutParams.gravity = 8388659;
                layoutParams.width = c34777g2.f73640a.widthPixels;
                layoutParams.height = c34777g2.f73653n;
                layoutParams.x = 0;
                layoutParams.y = 0;
                layoutParams.flags = 32;
                LinearLayout linearLayout = new LinearLayout(c34777g2.f73642c);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.setOrientation(1);
                linearLayout.setOnTouchListener(new C34777g.b(c34777g2, (byte) 0));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(c34777g2.m76172a(70), c34777g2.m76172a(40));
                Button button = new Button(c34777g2.f73642c);
                button.setText("Resize");
                button.setLayoutParams(layoutParams2);
                button.setOnClickListener(ViewOnClickListenerC34780j.m76180a(c34777g2, button));
                Button button2 = new Button(c34777g2.f73642c);
                button2.setText("close");
                layoutParams2.leftMargin = c34777g2.m76172a(10);
                button2.setLayoutParams(layoutParams2);
                button2.setOnClickListener(ViewOnClickListenerC34781k.m76181a(c34777g2));
                LinearLayout linearLayout2 = new LinearLayout(c34777g2.f73642c);
                linearLayout2.addView(button);
                linearLayout2.addView(button2);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout2.setOrientation(0);
                linearLayout2.setBackgroundColor(-7829368);
                linearLayout2.setAlpha(0.5f);
                linearLayout.addView(linearLayout2);
                Spinner spinner = new Spinner(c34777g2.f73642c);
                c34777g2.f73649j = spinner;
                spinner.setAdapter((SpinnerAdapter) c34777g2.f73644e);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, c34777g2.m76172a(30));
                layoutParams3.topMargin = c34777g2.m76172a(2);
                c34777g2.f73649j.setLayoutParams(layoutParams3);
                c34777g2.f73649j.setOnItemSelectedListener(new C34777g.c(c34777g2, (byte) 0));
                c34777g2.f73649j.setBackgroundColor(-7829368);
                c34777g2.f73649j.setAlpha(0.5f);
                linearLayout.addView(c34777g2.f73649j);
                c34777g2.f73647h = new TextView(c34777g2.f73642c);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, c34777g2.m76172a(160));
                layoutParams4.topMargin = c34777g2.m76172a(10);
                layoutParams4.leftMargin = c34777g2.m76172a(10);
                layoutParams4.rightMargin = c34777g2.m76172a(3);
                c34777g2.f73647h.setLayoutParams(layoutParams4);
                c34777g2.f73647h.setTextColor(SupportMenu.CATEGORY_MASK);
                linearLayout.addView(c34777g2.f73647h);
                c34777g2.f73650k = new ScrollView(c34777g2.f73642c);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, c34777g2.m76176b());
                layoutParams5.leftMargin = c34777g2.m76172a(10);
                layoutParams5.rightMargin = c34777g2.m76172a(3);
                c34777g2.f73650k.setLayoutParams(layoutParams5);
                c34777g2.f73650k.setVerticalScrollBarEnabled(true);
                c34777g2.f73648i = new TextView(c34777g2.f73642c);
                c34777g2.f73648i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                c34777g2.f73648i.setTextColor(SupportMenu.CATEGORY_MASK);
                c34777g2.f73650k.addView(c34777g2.f73648i);
                c34777g2.f73650k.fullScroll(130);
                linearLayout.addView(c34777g2.f73650k);
                c34777g2.f73646g = linearLayout;
                c34777g2.f73654o.mo76165a(0);
                this.mIsInit = true;
                return true;
            }
            Log.m76033e("DashboardManagerView", "get windowManager is fail", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllDashboardInternal() {
        this.mDashboards.clear();
        this.mDashboardStatus.clear();
        this.mDashboardLogs.clear();
        C34777g c34777g = this.mDashboardManagerView;
        c34777g.f73644e.clear();
        c34777g.f73651l = null;
        TextView textView = c34777g.f73647h;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = c34777g.f73648i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            this.mDashboards.remove(str);
            this.mDashboardStatus.remove(str);
            this.mDashboardLogs.remove(str);
            C34777g c34777g = this.mDashboardManagerView;
            if (str.equals(c34777g.f73651l)) {
                int position = c34777g.f73644e.getPosition(c34777g.f73651l);
                if (position != c34777g.f73644e.getCount() - 1) {
                    int i11 = position + 1;
                    c34777g.f73651l = c34777g.f73644e.getItem(i11);
                    c34777g.f73654o.mo76165a(position);
                    Spinner spinner = c34777g.f73649j;
                    if (spinner != null) {
                        spinner.setSelection(i11);
                    }
                } else if (position > 0) {
                    int i12 = position - 1;
                    c34777g.f73651l = c34777g.f73644e.getItem(i12);
                    c34777g.f73654o.mo76165a(i12);
                    Spinner spinner2 = c34777g.f73649j;
                    if (spinner2 != null) {
                        spinner2.setSelection(i12);
                    }
                }
            }
            c34777g.f73644e.remove(str);
            if (c34777g.f73644e.getCount() == 0) {
                c34777g.f73651l = null;
            }
            c34777g.m76173a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusInternal(String str, String str2) {
        if (this.mDashboards.contains(str)) {
            this.mDashboardStatus.put(str, str2);
            if (str.equals(this.mSelectedDashboardId)) {
                this.mDashboardManagerView.m76177b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDashboardInternal(boolean z11) {
        if (!z11 || (checkPermission() && init())) {
            this.mDashboardManagerView.m76175a(z11);
        } else {
            LiteavLog.m76087i(TAG, "init or check permission is fail");
        }
    }

    public int appendLog(String str, String str2) {
        this.mUIHandler.post(RunnableC34776f.m76171a(this, str, str2));
        return 0;
    }

    public int removeAllDashboard() {
        LiteavLog.m76087i(TAG, "removeAllDashboard ");
        this.mUIHandler.post(RunnableC34774d.m76169a(this));
        return 0;
    }

    public int setStatus(String str, String str2) {
        this.mUIHandler.post(RunnableC34775e.m76170a(this, str, str2));
        return 0;
    }

    public DashboardManager() {
        C34777g.a aVar = new C34777g.a() { // from class: com.tencent.liteav.sdkcommon.DashboardManager.1
            @Override // com.tencent.liteav.sdkcommon.C34777g.a
            /* JADX INFO: renamed from: a */
            public final void mo76165a(int i11) {
                if (DashboardManager.this.mDashboards.size() <= i11) {
                    return;
                }
                DashboardManager dashboardManager = DashboardManager.this;
                dashboardManager.mSelectedDashboardId = (String) dashboardManager.mDashboards.get(i11);
                if (DashboardManager.this.mDashboards.contains(DashboardManager.this.mSelectedDashboardId)) {
                    DashboardManager.this.mDashboardManagerView.m76177b((String) DashboardManager.this.mDashboardStatus.get(DashboardManager.this.mSelectedDashboardId));
                    StringBuilder sb2 = (StringBuilder) DashboardManager.this.mDashboardLogs.get(DashboardManager.this.mSelectedDashboardId);
                    if (sb2 != null) {
                        DashboardManager.this.mDashboardManagerView.m76174a(sb2.toString());
                    } else {
                        DashboardManager.this.mDashboardManagerView.m76174a("");
                    }
                }
            }
        };
        this.mSelectedDashboardChangeListener = aVar;
        LiteavLog.m76087i(TAG, "java DashBoardManager Construct");
        this.mIsInit = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mDashboardManagerView = new C34777g(applicationContext, aVar);
        this.mUIHandler = new Handler(Looper.getMainLooper());
    }

    private boolean checkPermission() {
        if (LiteavSystemInfo.getSystemOSVersionInt() > 23 && !Settings.canDrawOverlays(this.mAppContext)) {
            Toast.makeText(this.mAppContext, "no system alert window permission, please authorize", 0).show();
            return false;
        }
        return true;
    }

    public int addDashboard(String str) {
        LiteavLog.m76087i(TAG, "addDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(RunnableC34772b.m76167a(this, str));
        return 0;
    }

    public int removeDashboard(String str) {
        LiteavLog.m76087i(TAG, "removeDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(RunnableC34773c.m76168a(this, str));
        return 0;
    }

    public int showDashboard(boolean z11) {
        LiteavLog.m76087i(TAG, "showDashBoard isShow = ".concat(String.valueOf(z11)));
        this.mUIHandler.post(RunnableC34771a.m76166a(this, z11));
        return 0;
    }
}
