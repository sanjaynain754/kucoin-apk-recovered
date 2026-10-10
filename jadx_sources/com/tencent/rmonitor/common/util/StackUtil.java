package com.tencent.rmonitor.common.util;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/StackUtil;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public class StackUtil {

    @NotNull
    private static final String TAG = "RMonitor_common_util_FakeUtil";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<String> WHITE_PACKAGE = CollectionsKt.arrayListOf("libcore.io", "com.tencent.rmonitor.io", "java.io", "dalvik.system", "android.os");

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001d\u0010\f\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/StackUtil$Companion;", "", "()V", "TAG", "", "WHITE_PACKAGE", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCurrentThreadName", "getThrowableStack", "throwable", "", "stackTraceToString", "arr", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getThrowableStack() {
            try {
                return getThrowableStack(new Throwable());
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(StackUtil.TAG, "getThrowableStack ex ", th2);
                return "";
            }
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final String stackTraceToString(@Nullable StackTraceElement[] arr) {
            String str;
            if (arr == null || arr.length == 0) {
                return "";
            }
            ArrayList arrayList = new ArrayList(arr.length);
            int length = arr.length;
            for (int i11 = 0; i11 < length; i11++) {
                String className = arr[i11].getClassName();
                ArrayList arrayList2 = StackUtil.WHITE_PACKAGE;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    arrayList.add(arr[i11]);
                    break;
                    break;
                }
                Iterator it = arrayList2.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(arr[i11]);
                        break;
                    }
                    str = (String) it.next();
                    Intrinsics.checkNotNullExpressionValue(className, "className");
                } while (!StringsKt.contains$default((CharSequence) className, (CharSequence) str, false, 2, (Object) null));
            }
            StringBuffer stringBuffer = new StringBuffer(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                stringBuffer.append((StackTraceElement) it2.next());
                stringBuffer.append('\n');
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        @JvmStatic
        @NotNull
        public final String getCurrentThreadName() {
            String name = Thread.currentThread().getName();
            Intrinsics.checkNotNullExpressionValue(name, "currentThread().name");
            return name;
        }

        @JvmStatic
        @NotNull
        public final String getThrowableStack(@Nullable Throwable throwable) {
            return throwable == null ? "" : stackTraceToString(throwable.getStackTrace());
        }
    }

    @JvmStatic
    @NotNull
    public static final String getThrowableStack() {
        return INSTANCE.getThrowableStack();
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentThreadName() {
        return INSTANCE.getCurrentThreadName();
    }

    @JvmStatic
    @NotNull
    public static final String getThrowableStack(@Nullable Throwable th2) {
        return INSTANCE.getThrowableStack(th2);
    }

    @JvmStatic
    @NotNull
    public static final String stackTraceToString(@Nullable StackTraceElement[] stackTraceElementArr) {
        return INSTANCE.stackTraceToString(stackTraceElementArr);
    }
}
