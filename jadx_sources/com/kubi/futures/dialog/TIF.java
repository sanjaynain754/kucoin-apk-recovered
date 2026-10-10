package com.kubi.futures.dialog;

import android.content.Context;
import com.kubi.kumex.R$string;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitDialogHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\b\u0002\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR,\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/dialog/TIF;", "", "titleGetter", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "", "descGetter", "tifForBackendRequest", "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getTitleGetter", "()Lkotlin/jvm/functions/Function1;", "getDescGetter", "getTifForBackendRequest", "()Ljava/lang/String;", "setTifForBackendRequest", "(Ljava/lang/String;)V", "PostOnly", AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TIF {
    PostOnly(new Function1() { // from class: com.kubi.futures.dialog.z1
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25270h((Context) obj);
        }
    }, new Function1() { // from class: com.kubi.futures.dialog.a2
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25271i((Context) obj);
        }
    }, "GTC"),
    FOK(new Function1() { // from class: com.kubi.futures.dialog.b2
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25272j((Context) obj);
        }
    }, new Function1() { // from class: com.kubi.futures.dialog.c2
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25273k((Context) obj);
        }
    }, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK),
    IOC(new Function1() { // from class: com.kubi.futures.dialog.d2
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25274l((Context) obj);
        }
    }, new Function1() { // from class: com.kubi.futures.dialog.e2
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TIF.m25275m((Context) obj);
        }
    }, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f22816c = EnumEntriesKt.enumEntries(m25269g());

    @NotNull
    private final Function1<Context, String> descGetter;

    @NotNull
    private String tifForBackendRequest;

    @NotNull
    private final Function1<Context, String> titleGetter;

    @NotNull
    public static EnumEntries<TIF> getEntries() {
        return f22816c;
    }

    /* JADX INFO: renamed from: h */
    public static final String m25270h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_post_only_subheading);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static final String m25271i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_post_only_desc);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static final String m25272j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_fok_subheading);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static final String m25273k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_fok_desc);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static final String m25274l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_ioc_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: m */
    public static final String m25275m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_ioc_desc);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final Function1<Context, String> getDescGetter() {
        return this.descGetter;
    }

    @NotNull
    public final String getTifForBackendRequest() {
        return this.tifForBackendRequest;
    }

    @NotNull
    public final Function1<Context, String> getTitleGetter() {
        return this.titleGetter;
    }

    public final void setTifForBackendRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tifForBackendRequest = str;
    }

    TIF(Function1 function1, Function1 function2, String str) {
        this.titleGetter = function1;
        this.descGetter = function2;
        this.tifForBackendRequest = str;
    }
}
