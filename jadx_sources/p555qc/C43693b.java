package p555qc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingOptionShareInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37012d;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p445m2.AbstractC42397h;
import p460n2.InterfaceC42704b;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qc.b */
/* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J.\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J>\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002¨\u0006'"}, m90084d2 = {"Lcom/kubi/copytrading/rn/KCBridgeCopyTradingCallImp;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCall;", "<init>", "()V", "requestFutureMarketClosePosition", "", "ctx", "Landroid/content/Context;", "subUid", "", "positionJson", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestFuturePositionTpSl", "requestRefreshCopyTradingAccountInfo", "shareCopyTraderFollowOneTraderPnl", "copyTraderFollowOneTraderPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;", "footerInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;", "shareCopyTraderTotalPnl", "copyTraderTotalPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;", "shareCopyTradingPosition", "copyTradingData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "shareLeadTraderTotalPnl", "leadTraderTotalPnlData", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;", "shareLeadUserInfo", "leadTradingUserInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "shareOptionPosition", "optionShareInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingOptionShareInfo;", "getCurrentFragment", "Lcom/kubi/sdk/BaseFragment;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBridgeCopyTradingCallImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBridgeCopyTradingCallImp.kt\ncom/kubi/copytrading/rn/KCBridgeCopyTradingCallImp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
public final class C43693b implements InterfaceC37012d {

    /* JADX INFO: renamed from: qc.b$a */
    /* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/copytrading/rn/KCBridgeCopyTradingCallImp$shareCopyTraderFollowOneTraderPnl$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseFragment f96554e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f96555f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity f96556g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ KCBridgeCopyTradingShareFooterInfo f96557h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f96558i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(BaseFragment baseFragment, Context context, KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f96554e = baseFragment;
            this.f96555f = context;
            this.f96556g = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
            this.f96557h = kCBridgeCopyTradingShareFooterInfo;
            this.f96558i = function2;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            BaseFragment.hideLoadingDialog$default(this.f96554e, false, 1, null);
            C43707p.f96618a.m96248J(this.f96555f, resource, this.f96556g, this.f96557h, this.f96558i);
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            BaseFragment.hideLoadingDialog$default(this.f96554e, false, 1, null);
            C43707p.f96618a.m96248J(this.f96555f, null, this.f96556g, this.f96557h, this.f96558i);
        }
    }

    /* JADX INFO: renamed from: qc.b$b */
    /* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/copytrading/rn/KCBridgeCopyTradingCallImp$shareCopyTraderTotalPnl$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseFragment f96559e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f96560f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ KCBridgeCopyTradingCopyTraderTotalPnlEntity f96561g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ KCBridgeCopyTradingShareFooterInfo f96562h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f96563i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(BaseFragment baseFragment, Context context, KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f96559e = baseFragment;
            this.f96560f = context;
            this.f96561g = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
            this.f96562h = kCBridgeCopyTradingShareFooterInfo;
            this.f96563i = function2;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            BaseFragment.hideLoadingDialog$default(this.f96559e, false, 1, null);
            C43707p.f96618a.m96250N(this.f96560f, resource, this.f96561g, this.f96562h, this.f96563i);
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            BaseFragment.hideLoadingDialog$default(this.f96559e, false, 1, null);
            C43707p.f96618a.m96250N(this.f96560f, null, this.f96561g, this.f96562h, this.f96563i);
        }
    }

    /* JADX INFO: renamed from: qc.b$c */
    /* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/copytrading/rn/KCBridgeCopyTradingCallImp$shareCopyTradingPosition$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseFragment f96564e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ KCBridgeCopyTradingCopyTradingEntity f96565f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f96566g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ KCBridgeCopyTradingShareFooterInfo f96567h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f96568i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(BaseFragment baseFragment, KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, Context context, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f96564e = baseFragment;
            this.f96565f = kCBridgeCopyTradingCopyTradingEntity;
            this.f96566g = context;
            this.f96567h = kCBridgeCopyTradingShareFooterInfo;
            this.f96568i = function2;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            BaseFragment.hideLoadingDialog$default(this.f96564e, false, 1, null);
            String userDesc = this.f96565f.getUserDesc();
            if (userDesc == null || userDesc.length() == 0) {
                C43707p.f96618a.m96253T(this.f96566g, resource, this.f96565f, this.f96567h, this.f96568i);
            } else {
                C43707p.f96618a.m96249L(this.f96566g, resource, this.f96565f, this.f96567h, this.f96568i);
            }
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            BaseFragment.hideLoadingDialog$default(this.f96564e, false, 1, null);
            String userDesc = this.f96565f.getUserDesc();
            if (userDesc == null || userDesc.length() == 0) {
                C43707p.f96618a.m96253T(this.f96566g, null, this.f96565f, this.f96567h, this.f96568i);
            } else {
                C43707p.f96618a.m96249L(this.f96566g, null, this.f96565f, this.f96567h, this.f96568i);
            }
        }
    }

    /* JADX INFO: renamed from: qc.b$d */
    /* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/copytrading/rn/KCBridgeCopyTradingCallImp$shareLeadTraderTotalPnl$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseFragment f96569e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f96570f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ KCBridgeCopyTradingLeadTraderTotalPnlEntity f96571g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ KCBridgeCopyTradingShareFooterInfo f96572h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f96573i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(BaseFragment baseFragment, Context context, KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f96569e = baseFragment;
            this.f96570f = context;
            this.f96571g = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
            this.f96572h = kCBridgeCopyTradingShareFooterInfo;
            this.f96573i = function2;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            BaseFragment.hideLoadingDialog$default(this.f96569e, false, 1, null);
            C43707p.f96618a.m96251P(this.f96570f, resource, this.f96571g, this.f96572h, this.f96573i);
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            BaseFragment.hideLoadingDialog$default(this.f96569e, false, 1, null);
            C43707p.f96618a.m96251P(this.f96570f, null, this.f96571g, this.f96572h, this.f96573i);
        }
    }

    /* JADX INFO: renamed from: qc.b$e */
    /* JADX INFO: compiled from: KCBridgeCopyTradingCallImp.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/copytrading/rn/KCBridgeCopyTradingCallImp$shareLeadUserInfo$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseFragment f96574e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f96575f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ KCBridgeCopyTradingLeadTradingEntity f96576g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ KCBridgeCopyTradingShareFooterInfo f96577h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function2<Boolean, ProtocolException, Unit> f96578i;

        /* JADX WARN: Multi-variable type inference failed */
        public e(BaseFragment baseFragment, Context context, KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
            this.f96574e = baseFragment;
            this.f96575f = context;
            this.f96576g = kCBridgeCopyTradingLeadTradingEntity;
            this.f96577h = kCBridgeCopyTradingShareFooterInfo;
            this.f96578i = function2;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            BaseFragment.hideLoadingDialog$default(this.f96574e, false, 1, null);
            C43707p.f96618a.m96252R(this.f96575f, resource, this.f96576g, this.f96577h, this.f96578i);
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            BaseFragment.hideLoadingDialog$default(this.f96574e, false, 1, null);
            C43707p.f96618a.m96252R(this.f96575f, null, this.f96576g, this.f96577h, this.f96578i);
        }
    }

    /* JADX INFO: renamed from: k */
    public final BaseFragment m96208k() {
        Object objM103844constructorimpl;
        Fragment fragment;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Object next;
        try {
            Result.Companion companion = Result.INSTANCE;
            Activity activityM6125h = C5258a.m6125h();
            FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
                fragment = null;
            } else {
                Iterator<T> it = fragments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Fragment fragment2 = (Fragment) next;
                    if ((fragment2 instanceof BaseFragment) && ((BaseFragment) fragment2).isShowing()) {
                        break;
                    }
                }
                fragment = (Fragment) next;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(fragment);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (BaseFragment) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: a */
    public void mo82837a(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTraderTotalPnlEntity copyTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTraderTotalPnlData, "copyTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k != null) {
            baseFragmentM96208k.showLoadingDialog();
        }
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((b) C46338a.m102151a(context).mo6621d().mo6601L0(copyTraderTotalPnlData.getUserAvatarUrl()).m6591B0(new b(baseFragmentM96208k, context, copyTraderTotalPnlData, footerInfo, callback)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            BaseFragment.hideLoadingDialog$default(baseFragmentM96208k, false, 1, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: b */
    public void mo82838b(@NotNull Context ctx, @NotNull KCBridgeCopyTradingLeadTraderTotalPnlEntity leadTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(leadTraderTotalPnlData, "leadTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k != null) {
            baseFragmentM96208k.showLoadingDialog();
        }
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((d) C46338a.m102151a(context).mo6621d().mo6601L0(leadTraderTotalPnlData.getUserAvatarUrl()).m6591B0(new d(baseFragmentM96208k, context, leadTraderTotalPnlData, footerInfo, callback)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            BaseFragment.hideLoadingDialog$default(baseFragmentM96208k, false, 1, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: c */
    public void mo82839c(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity copyTraderFollowOneTraderPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTraderFollowOneTraderPnlData, "copyTraderFollowOneTraderPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k != null) {
            baseFragmentM96208k.showLoadingDialog();
        }
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((a) C46338a.m102151a(context).mo6621d().mo6601L0(copyTraderFollowOneTraderPnlData.getCopyTraderAvatarUrl()).m6591B0(new a(baseFragmentM96208k, context, copyTraderFollowOneTraderPnlData, footerInfo, callback)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            BaseFragment.hideLoadingDialog$default(baseFragmentM96208k, false, 1, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: d */
    public void mo82840d(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IKuMexService.f28731a.get().mo33276d(ctx, subUid, positionJson, callback);
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: e */
    public void mo82841e(@NotNull Context ctx, @NotNull KCBridgeCopyTradingLeadTradingEntity leadTradingUserInfo, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(leadTradingUserInfo, "leadTradingUserInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k != null) {
            baseFragmentM96208k.showLoadingDialog();
        }
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((e) C46338a.m102151a(context).mo6621d().mo6601L0(leadTradingUserInfo.getUserAvatarUrl()).m6591B0(new e(baseFragmentM96208k, context, leadTradingUserInfo, footerInfo, callback)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            BaseFragment.hideLoadingDialog$default(baseFragmentM96208k, false, 1, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: f */
    public void mo82842f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CopyTradingConfig.f19710a.m20597n();
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: g */
    public void mo82843g(@NotNull Context ctx, @NotNull KCBridgeCopyTradingOptionShareInfo optionShareInfo, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(optionShareInfo, "optionShareInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam("op_p_share", null, false, null, false, null, null, null, null, null, 1022, null);
            imageShareParam.setNeedQrCode(false);
            imageShareParam.setBitmap(C43707p.f96618a.m96257o(context, optionShareInfo, footerInfo));
            iShareService.mo40f(imageShareParam, new Function1() { // from class: qc.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43693b.m96207l(callback, ((Boolean) obj).booleanValue());
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: h */
    public void mo82844h(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTradingEntity copyTradingData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Context context;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseFragment baseFragmentM96208k = m96208k();
        if (baseFragmentM96208k != null) {
            baseFragmentM96208k.showLoadingDialog();
        }
        if (baseFragmentM96208k == null || (context = baseFragmentM96208k.getContext()) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((c) C46338a.m102151a(context).mo6621d().mo6601L0(copyTradingData.getUserAvatarUrl()).m6591B0(new c(baseFragmentM96208k, copyTradingData, context, footerInfo, callback)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            BaseFragment.hideLoadingDialog$default(baseFragmentM96208k, false, 1, null);
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37012d
    /* JADX INFO: renamed from: j */
    public void mo82845j(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IKuMexService.f28731a.get().mo33282j(ctx, subUid, positionJson, callback);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m96207l(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }
}
