package com.tencent.rmonitor.common.lifecycle;

import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.InterfaceC33562b9;
import com.tencent.bugly.proguard.InterfaceC33896r8;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.common.logger.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u001e\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J.\u0010\f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\nH\u0002J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m90084d2 = {"Lcom/tencent/rmonitor/common/lifecycle/OperationLog;", "Lcom/tencent/bugly/proguard/r8;", "Lcom/tencent/bugly/proguard/b9;", "", "log", "", "appendOperationLog", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "operationString", "getOperationLogString", "pageName", "hash", TUIConstants.TIMPush.NOTIFICATION.ACTION, "onLifecycleChanged", "reset", "getOperationLog", "", "customScene", "onEnterScene", "onExitScene", "", "fragment", "onFragmentPreAttached", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onFragmentViewDestroyed", "onFragmentResumed", "onFragmentDestroyed", "com/tencent/rmonitor/common/lifecycle/OperationLog$formatter$1", "formatter", "Lcom/tencent/rmonitor/common/lifecycle/OperationLog$formatter$1;", "", "msgArray", "[Ljava/lang/String;", "", "operationLogCount", "I", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class OperationLog implements InterfaceC33896r8, InterfaceC33562b9 {

    @NotNull
    private final OperationLog$formatter$1 formatter = new ThreadLocal<SimpleDateFormat>() { // from class: com.tencent.rmonitor.common.lifecycle.OperationLog$formatter$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    @NotNull
    private final String[] msgArray;
    private int operationLogCount;

    @NotNull
    public final List<String> getOperationLogString() {
        ArrayList<String> arrayList = new ArrayList<>();
        getOperationLogString(null, arrayList);
        return arrayList;
    }

    public final void reset() {
        this.operationLogCount = 0;
    }

    private final void appendOperationLog(String log) {
        int i11 = this.operationLogCount;
        int i12 = i11 % 30;
        if (i12 >= 0 && i12 < 30) {
            this.msgArray[i12] = log;
        }
        int i13 = i11 + 1;
        this.operationLogCount = i13;
        if (i13 < 0) {
            this.operationLogCount = 0;
        }
    }

    @NotNull
    public final JSONArray getOperationLog() {
        JSONArray jSONArray = new JSONArray();
        getOperationLogString(jSONArray, null);
        return jSONArray;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33896r8
    public void onEnterScene(@Nullable String customScene) {
        if (customScene != null) {
            onLifecycleChanged(customScene, "", "enter");
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33896r8
    public void onExitScene(@Nullable String customScene) {
        if (customScene != null) {
            onLifecycleChanged(customScene, "", "exit");
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentDestroyed(@Nullable Object fragment) {
        if (fragment != null) {
            String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "fragment.javaClass.name");
            onLifecycleChanged(name, String.valueOf(fragment.hashCode()), "destroyed");
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentResumed(@Nullable Object fragment) {
        if (fragment != null) {
            String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "fragment.javaClass.name");
            onLifecycleChanged(name, String.valueOf(fragment.hashCode()), "resumed");
        }
    }

    public final void onLifecycleChanged(@NotNull String pageName, @NotNull String hash, @NotNull String action) {
        String strM75464a;
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(action, "action");
        SimpleDateFormat simpleDateFormat = get();
        String str = simpleDateFormat != null ? simpleDateFormat.format(new Date()) : null;
        if (TextUtils.isEmpty(pageName)) {
            strM75464a = str + " app switch to " + action;
        } else if (TextUtils.isEmpty(hash)) {
            strM75464a = str + ' ' + pageName + ' ' + action;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(' ');
            sb2.append(pageName);
            sb2.append('{');
            sb2.append(hash);
            strM75464a = C34025xh.m75464a(sb2, "} ", action);
        }
        appendOperationLog(strM75464a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.rmonitor.common.lifecycle.OperationLog$formatter$1] */
    public OperationLog() {
        String[] strArr = new String[30];
        for (int i11 = 0; i11 < 30; i11++) {
            strArr[i11] = "";
        }
        this.msgArray = strArr;
    }

    private final void getOperationLogString(JSONArray jsonArray, ArrayList<String> operationString) {
        try {
            int i11 = this.operationLogCount;
            int i12 = i11 > 30 ? i11 - 30 : 0;
            int i13 = i11 - 1;
            if (i12 > i13) {
                return;
            }
            while (true) {
                int i14 = i13 % 30;
                if (i14 >= 0 && i14 < 30) {
                    String str = this.msgArray[i14];
                    if (operationString != null) {
                        operationString.add(str);
                    }
                    if (operationString != null) {
                        operationString.add(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    if (jsonArray != null) {
                        jsonArray.put(str);
                    }
                }
                if (i13 == i12) {
                    return;
                } else {
                    i13--;
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("OperationLog", th2);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentPreAttached(@Nullable Object fragment) {
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentViewDestroyed(@Nullable Object view) {
    }
}
