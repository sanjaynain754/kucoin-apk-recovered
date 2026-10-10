package com.kubi.redpackage.p109ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.host.HostManager;
import com.kubi.redpackage.R$anim;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$drawable;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$mipmap;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.redpackage.entity.RedpacketDetailEntity;
import com.kubi.redpackage.entity.RedpacketItemEntity;
import com.kubi.redpackage.view.RedpacketHeaderView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27100x0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37767s;
import gf.C37885i;
import i10.Menu;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPacketReceiveFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010%\u001a\u00020&H\u0014J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010-\u001a\u00020\u0012H\u0016JT\u0010.\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0007*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010000 \u0007*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0007*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010000\u0018\u00010/0/2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&H\u0014J\u0012\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u00020)2\u0006\u00107\u001a\u0002082\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00109\u001a\u00020)H\u0002J\u0012\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010\rH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001a\u0010\u000fR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedPacketReceiveFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/redpackage/entity/RedpacketItemEntity;", "<init>", "()V", "mApi", "Lcom/kubi/redpackage/RedPackageApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/redpackage/RedPackageApi;", "mApi$delegate", "Lkotlin/Lazy;", "mId", "", "getMId", "()Ljava/lang/String;", "mId$delegate", "mFromHis", "", "getMFromHis", "()Ljava/lang/Boolean;", "mFromHis$delegate", "mIsSend", "getMIsSend", "mIsSend$delegate", JPushConstants.PlatformNode.KEY_M_CODE, "getMCode", "mCode$delegate", "mHeader", "Lcom/kubi/redpackage/view/RedpacketHeaderView;", "mRandom", "Ljava/util/Random;", "getMRandom", "()Ljava/util/Random;", "mRandom$delegate", "mRedDetail", "Lcom/kubi/redpackage/entity/RedpacketDetailEntity;", "getItemLayout", "", "RED_AVATAR_URL", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "isV2Page", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "v2PageIndex", "pageSize", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "getHeaderData", "showRedPackageDialog", "keyWords", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RedPacketReceiveFragment extends BasePagingFragment<RedpacketItemEntity> {

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ int f43165i0 = 0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public RedpacketHeaderView f43171e0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public RedpacketDetailEntity f43173g0;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f43166Z = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53820m4();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f43167a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53823p4(this.f43338b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f43168b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53822o4(this.f43344b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f43169c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53824q4(this.f43349b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f43170d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53821n4(this.f43356b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f43172f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketReceiveFragment.m53825r4();
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public String f43174h0 = HostManager.a.c() + "/welfare/";

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.RedPacketReceiveFragment$a */
    /* JADX INFO: compiled from: RedPacketReceiveFragment.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/redpackage/ui/RedPacketReceiveFragment$getHeaderData$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22733a extends C24223c1 {
        public C22733a() {
            super(RedPacketReceiveFragment.this);
        }

        /* JADX INFO: renamed from: f */
        public static final void m53844f(RedPacketReceiveFragment redPacketReceiveFragment, View view) {
            redPacketReceiveFragment.m53835b4();
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            RedpacketHeaderView redpacketHeaderView = RedPacketReceiveFragment.this.f43171e0;
            if (redpacketHeaderView != null) {
                final RedPacketReceiveFragment redPacketReceiveFragment = RedPacketReceiveFragment.this;
                redpacketHeaderView.showRetry(new View.OnClickListener() { // from class: com.kubi.redpackage.ui.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RedPacketReceiveFragment.C22733a.m53844f(redPacketReceiveFragment, view);
                    }
                });
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: z3 */
    public boolean mo53842z3() {
        return true;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m53817d4(final RedPacketReceiveFragment redPacketReceiveFragment, RedpacketDetailEntity redpacketDetailEntity) {
        redPacketReceiveFragment.f43173g0 = redpacketDetailEntity;
        RedpacketHeaderView redpacketHeaderView = redPacketReceiveFragment.f43171e0;
        if (redpacketHeaderView != null) {
            Intrinsics.checkNotNull(redpacketDetailEntity);
            redpacketHeaderView.setData(redpacketDetailEntity);
        }
        if (!C27025c.m66566d(redPacketReceiveFragment.m53838i4())) {
            redPacketReceiveFragment.getTitleBar().setMenu(new Menu(R$id.redpacketMenuHistory, null, null, 0, Integer.valueOf(R$string.redpacket_record), R$color.c_white, 0, new View.OnClickListener() { // from class: com.kubi.redpackage.ui.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RedPacketReceiveFragment.m53819f4(view);
                }
            }, 0, 334, null));
        } else if (C27025c.m66566d(redPacketReceiveFragment.m53840k4())) {
            redPacketReceiveFragment.getTitleBar().setMenu(new Menu(R$id.redpacketMenuShare, null, null, 0, Integer.valueOf(R$string.share), R$color.c_white, 0, new View.OnClickListener() { // from class: com.kubi.redpackage.ui.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RedPacketReceiveFragment.m53818e4(this.f43206b, view);
                }
            }, 0, 334, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m53819f4(View view) {
        InterfaceC37767s.a.m85192a(C37304a.f82764a, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: r4 */
    public static final Random m53825r4() {
        return new Random();
    }

    /* JADX INFO: renamed from: s4 */
    private final void m53826s4(final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C27057k.m66746b(str);
        ToastCompat.m66441G(getString(R$string.pwd_copied_clipboard), new Object[0]);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bredpackage_dialog_redpacket_copy, 2, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketReceiveFragment.m53827t4(this.f43291b, str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "showRedPackage");
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m53827t4(final RedPacketReceiveFragment redPacketReceiveFragment, final String str, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RedpacketDetailEntity redpacketDetailEntity = redPacketReceiveFragment.f43173g0;
        boolean zM66566d = C27025c.m66566d(redpacketDetailEntity != null ? redpacketDetailEntity.isNewBee() : null);
        viewHolder.setText(R$id.tv_title, zM66566d ? R$string.newcomer_only_redpackage : R$string.red_package);
        int i11 = R$id.tv_copy;
        viewHolder.setGone(i11, !zM66566d);
        viewHolder.setText(R$id.tv_dialog_redpacket_content, str);
        View view = viewHolder.getView(R$id.iv_dialog_redpacket_copy_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.redpackage.ui.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53828u4(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.fl_share_media);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.redpackage.ui.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53829v4(str);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.fl_share_sms);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.redpackage.ui.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53830w4(this.f43313b, str);
            }
        }, 1, null);
        View view4 = viewHolder.getView(R$id.fl_share_email);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.redpackage.ui.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53832y4(this.f43319b, str);
            }
        }, 1, null);
        View view5 = viewHolder.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.redpackage.ui.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53833z4(str, redPacketReceiveFragment);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m53829v4(String str) {
        IShareService iShareService = IShareService.f49268a.get();
        TextShareParam textShareParam = new TextShareParam("red_Share", null, null, null, 14, null);
        textShareParam.setContent(str);
        IShareService.m59640c(iShareService, textShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m53830w4(final RedPacketReceiveFragment redPacketReceiveFragment, final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketReceiveFragment.m53831x4(this.f43333b, str);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @Nullable RedpacketItemEntity redpacketItemEntity) {
        String string;
        BigDecimal receiveAmount;
        BigDecimal receiveAmount2;
        BigDecimal receiveAmount3;
        BigDecimal receiveAmount4;
        Intrinsics.checkNotNullParameter(helper, "helper");
        String str = this.f43174h0 + (m53841l4().nextInt(50) + 1) + ".png";
        ImageView imageView = (ImageView) helper.getView(R$id.iv_avatar);
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(this.mContext).mo6634v(str);
        int i11 = R$mipmap.bredpackage_ic_avatar_holder;
        c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(imageView);
        double dM66646f = C27039d.m66646f((redpacketItemEntity == null || (receiveAmount4 = redpacketItemEntity.getReceiveAmount()) == null) ? null : Double.valueOf(receiveAmount4.doubleValue()));
        double dM66646f2 = C27039d.m66646f((redpacketItemEntity == null || (receiveAmount3 = redpacketItemEntity.getReceiveAmount()) == null) ? null : Double.valueOf(C41014a.m89940n(receiveAmount3, redpacketItemEntity.getCurrency())));
        String strM85570i = (redpacketItemEntity == null || (receiveAmount2 = redpacketItemEntity.getReceiveAmount()) == null) ? null : C37885i.m85570i(receiveAmount2, redpacketItemEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null);
        String strM89948v = (redpacketItemEntity == null || (receiveAmount = redpacketItemEntity.getReceiveAmount()) == null) ? null : C41014a.m89948v(C41014a.m89940n(receiveAmount, redpacketItemEntity.getCurrency()), null, null, 0, false, true, false, 47, null);
        if (dM66646f > dM66646f2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM85570i);
            sb2.append(' ');
            sb2.append(C27041f.m66668h(redpacketItemEntity != null ? redpacketItemEntity.getCurrencyName() : null));
            string = sb2.toString();
        } else {
            string = strM89948v;
        }
        if (dM66646f <= dM66646f2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strM85570i);
            sb3.append(' ');
            sb3.append(C27041f.m66668h(redpacketItemEntity != null ? redpacketItemEntity.getCurrencyName() : null));
            strM89948v = sb3.toString();
        }
        helper.setText(R$id.tv_name, C27041f.m66668h(redpacketItemEntity != null ? redpacketItemEntity.getNickName() : null)).setText(R$id.tv_time, TimeUtils.m66422i(C27039d.m66652l(redpacketItemEntity != null ? redpacketItemEntity.getReceiveAt() : null))).setText(R$id.tv_large, string).setText(R$id.tv_small, strM89948v).setGone(R$id.tv_lucky, C27025c.m66566d(redpacketItemEntity != null ? redpacketItemEntity.isLucky() : null));
    }

    /* JADX INFO: renamed from: g4 */
    public final RedPackageApi m53836g4() {
        return (RedPackageApi) this.f43166Z.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m53837h4() {
        return (String) this.f43170d0.getValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final Boolean m53838i4() {
        return (Boolean) this.f43168b0.getValue();
    }

    /* JADX INFO: renamed from: j4 */
    public final String m53839j4() {
        return (String) this.f43167a0.getValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final Boolean m53840k4() {
        return (Boolean) this.f43169c0.getValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final Random m53841l4() {
        return (Random) this.f43172f0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int color = Color.parseColor("#F05649");
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
        edgeToEdgeCompat.m58267e(activity, color);
        getTitleBar().setBackgroundColor(color);
        getTitleBar().setTitle("");
        TitleBar titleBar = getTitleBar();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$drawable.ic2_arrow_left2_20;
        int i12 = R$color.c_white;
        titleBar.setNavigation(c27017c.m66514c(i11, Integer.valueOf(i12)));
        C27046k.m66701p(getTitleBar().getLeftIcon(), getColorRes(i12));
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) view.findViewById(R$id.m_swipe_recycler_view);
        swipeRefreshRecyclerView.setEnabled(false);
        swipeRefreshRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(this.mContext));
        swipeRefreshRecyclerView.getRecyclerView().setOverScrollMode(2);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        RedpacketHeaderView redpacketHeaderView = new RedpacketHeaderView(mContext);
        this.f43171e0 = redpacketHeaderView;
        this.f46495W.addHeaderView(redpacketHeaderView);
        m53835b4();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bredpackage_item_redpacket_detail;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m53816c4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m53818e4(RedPacketReceiveFragment redPacketReceiveFragment, View view) {
        redPacketReceiveFragment.m53826s4(redPacketReceiveFragment.m53837h4());
    }

    /* JADX INFO: renamed from: m4 */
    public static final RedPackageApi m53820m4() {
        return (RedPackageApi) C42597a.m93386b().create(RedPackageApi.class);
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m53821n4(RedPacketReceiveFragment redPacketReceiveFragment) {
        Bundle arguments = redPacketReceiveFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "code");
        }
        return null;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Boolean m53822o4(RedPacketReceiveFragment redPacketReceiveFragment) {
        Bundle arguments = redPacketReceiveFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56221L(arguments, "fromHistory");
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public static final String m53823p4(RedPacketReceiveFragment redPacketReceiveFragment) {
        Bundle arguments = redPacketReceiveFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "id");
        }
        return null;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Boolean m53824q4(RedPacketReceiveFragment redPacketReceiveFragment) {
        Bundle arguments = redPacketReceiveFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56221L(arguments, "isSend");
        }
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m53828u4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m53831x4(RedPacketReceiveFragment redPacketReceiveFragment, String str) {
        redPacketReceiveFragment.startActivity(RedPackageHelperKt.m53722k(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m53832y4(RedPacketReceiveFragment redPacketReceiveFragment, String str) {
        try {
            redPacketReceiveFragment.startActivity(RedPackageHelperKt.m53714c(str));
        } catch (Exception unused) {
            ToastCompat.m66437C(R$string.redpacket_email_unavaiable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m53833z4(String str, RedPacketReceiveFragment redPacketReceiveFragment) {
        C27057k.m66746b(str);
        ToastCompat.m66441G(redPacketReceiveFragment.getString(R$string.pwd_copied_clipboard), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m53835b4() {
        Observable<R> observableCompose = m53836g4().m53736k(C27041f.m66668h(m53839j4())).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketReceiveFragment.m53817d4(this.f43368b, (RedpacketDetailEntity) obj);
            }
        };
        addSubscription(observableCompose.subscribe(new Consumer() { // from class: com.kubi.redpackage.ui.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketReceiveFragment.m53816c4(function1, obj);
            }
        }, new C22733a()));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(R$anim.anim_redpacket_enter, 0);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<RedpacketItemEntity>> mo16440r3(int i11, int i12) {
        Integer numValueOf;
        RedPackageApi redPackageApiM53836g4 = m53836g4();
        if (i11 == 1) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(i11);
        }
        return redPackageApiM53836g4.m53737l(numValueOf, i12, C27041f.m66668h(m53839j4())).compose(C24217a1.m58389m());
    }
}
