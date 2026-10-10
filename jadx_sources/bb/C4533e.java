package bb;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import d00.InterfaceC36562b;
import f00.C37304a;
import g00.InterfaceC37749a;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: bb.e */
/* JADX INFO: compiled from: KCJSApiAssetsModuleImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016Jj\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016Jr\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JZ\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JH\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000e2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/jsapi/KCJSApiAssetsModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiAssetsModule;", "<init>", "()V", "jumpHoldEarnDialog", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "jumpMultiAccountUseDialog", "sceneCode", FirebaseAnalytics.Param.CURRENCY, "fiatMoney", "defaultAccountAmount", "toAccountTag", "jumpMultiAddFundsDialog", "defaultAccount", "jumpMultiAccountSelectDialog", "getHideAssetsEyeStatus", "setHideAssetsEyeStatus", "isHide", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiAssetsModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiAssetsModuleImpl.kt\ncom/kubi/assets/jsapi/KCJSApiAssetsModuleImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,141:1\n135#2,2:142\n126#2,2:144\n*S KotlinDebug\n*F\n+ 1 KCJSApiAssetsModuleImpl.kt\ncom/kubi/assets/jsapi/KCJSApiAssetsModuleImpl\n*L\n117#1:142,2\n133#1:144,2\n*E\n"})
public final class C4533e implements InterfaceC36562b {
    /* JADX INFO: renamed from: q */
    public static final void m4409q(Function2 function2, int i11, Intent intent) {
        if (i11 == 0) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m4410r(Function2 function2, int i11, Intent intent) {
        if (i11 == 0) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m4411s(Function2 function2, int i11, Intent intent) {
        if (i11 == 0) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m4412t(Function2 function2, int i11, Intent intent) {
        if (i11 == 0) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: a */
    public void mo4413a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C37304a.f82764a.mo83585E0("", null, new InterfaceC36555b() { // from class: bb.c
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                C4533e.m4409q(callback, i11, intent);
            }
        });
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: e */
    public void mo4417e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(Boolean.valueOf(C46392a.m102322d(C42153h.f93593a.m92500D(), false)), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to get hide assets eye status", e11, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: f */
    public void mo4418f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @Nullable String str, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37749a.a.m85106a(C37304a.f82764a, sceneCode, currency, str == null ? "" : str, null, null, new InterfaceC36555b() { // from class: bb.a
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                C4533e.m4410r(callback, i11, intent);
            }
        }, 24, null);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: h */
    public void mo4420h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccount, @NotNull String defaultAccountAmount, @Nullable String str, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccount, "defaultAccount");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37749a.a.m85116k(C37304a.f82764a, sceneCode, currency, fiatMoney, defaultAccount, defaultAccountAmount, str == null ? "" : str, null, null, new InterfaceC36555b() { // from class: bb.d
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                C4533e.m4412t(callback, i11, intent);
            }
        }, 192, null);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: i */
    public void mo4421i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C46392a.m102328k(C42153h.f93593a.m92500D(), z11);
            AssetsProfitLossAnalysisManager.f40608a.m49943e(z11);
            callback.invoke(Boolean.valueOf(z11), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to set hide assets eye status", e11, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: l */
    public void mo4424l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccountAmount, @Nullable String str, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37749a.a.m85115j(C37304a.f82764a, sceneCode, currency, fiatMoney, defaultAccountAmount, str == null ? "" : str, null, null, new InterfaceC36555b() { // from class: bb.b
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                C4533e.m4411s(callback, i11, intent);
            }
        }, 96, null);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: b */
    public void mo4414b(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81834c(this, context, obj, str, function2);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: c */
    public void mo4415c(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super String, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81833b(this, context, obj, str, function2);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: d */
    public void mo4416d(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81835d(this, context, obj, str, str2, function2);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: g */
    public void mo4419g(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81836e(this, context, obj, str, str2, function2);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: j */
    public void mo4422j(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81832a(this, context, obj, str, function2);
    }

    @Override // d00.InterfaceC36562b
    /* JADX INFO: renamed from: k */
    public void mo4423k(@NotNull Context context, @Nullable Object obj, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36562b.a.m81837f(this, context, obj, str, str2, str3, function2);
    }
}
