package com.kubi.redpackage.hybrid;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4763j;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeRedPackCoverData;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCHybridBridgeRedPack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/redpackage/hybrid/KCHybridBridgeRedPack;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeRedPackCall;", "<init>", "()V", "openRedpacketAlert", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "code", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "selectCover", "coverData", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeRedPackCoverData;", "Companion", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgeRedPack implements InterfaceC4763j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f43142a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeRedPack.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/redpackage/hybrid/KCHybridBridgeRedPack$Companion;", "", "<init>", "()V", "TAG", "", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4763j
    /* JADX INFO: renamed from: a */
    public void mo4813a(@NotNull Context ctx, @Nullable Object obj, @NotNull KCHybridBridgeRedPackCoverData coverData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(coverData, "coverData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeRedPack$selectCover$1(baseActivity, coverData, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // c00.InterfaceC4763j
    /* JADX INFO: renamed from: b */
    public void mo4814b(@NotNull Context ctx, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) throws JSONException {
        String code = str;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
            return;
        }
        if (!StringsKt.contains$default((CharSequence) code, (CharSequence) "【", false, 2, (Object) null)) {
            code = (char) 12304 + code + (char) 12305;
        }
        if (C27041f.m66664d(code)) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeRedPack$openRedpacketAlert$1(code, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException("code invalid", null, null, false, 14, null));
            C46928a.m103398d(RedPkgCategory.RECEIVE_CODE_CHECK, false, null, null, 7, null);
        }
    }
}
