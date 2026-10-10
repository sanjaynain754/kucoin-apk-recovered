package com.kubi.core.biz.kline;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.NFTDialog;
import com.kubi.core.spot.entity.NFTEntity;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p429lf.C42180b;
import p756xc.NTFInfo;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45373b0;
import v30.C45400p;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.w */
/* JADX INFO: compiled from: NftContentUIExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, m90084d2 = {"getNftTitleText", "", "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "refreshNftUI", "", "nftInfo", "Lcom/kubi/core/base/arch/api/data/NTFInfo;", "expandNftInfoContent", "hideNftInfoContent", "isSupportNFT", "", "fillNftData", "nft", "Lcom/kubi/core/spot/entity/NFTEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNftContentUIExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NftContentUIExt.kt\ncom/kubi/core/biz/kline/NftContentUIExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1#2:107\n827#3:108\n855#3,2:109\n*S KotlinDebug\n*F\n+ 1 NftContentUIExt.kt\ncom/kubi/core/biz/kline/NftContentUIExtKt\n*L\n97#1:108\n97#1:109,2\n*E\n"})
public final class C11919w {
    /* JADX INFO: renamed from: d */
    public static final void m21806d(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45400p c45400p;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q3 == null || (c45400p = c45373b0M21751Q3.f102026d) == null || (root = c45400p.getRoot()) == null) {
            return;
        }
        C27046k.m66684G(root, true);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m21809g() {
        Router.f46192a.m56184f(HostManager.a.m() + "/nft-token/intro").m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m21810h(NFTEntity nFTEntity, KLineNtfFragmentBase kLineNtfFragmentBase) {
        NFTDialog nFTDialogNewInstance = NFTDialog.f21002b0.newInstance(nFTEntity);
        FragmentManager childFragmentManager = kLineNtfFragmentBase.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        nFTDialogNewInstance.show(childFragmentManager, "nft_dialog");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m21811i(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        return C27017c.f54310a.m66516f(R$string.nft_about, kLineNtfFragmentBase.m21755U3().getNftInfo().getBaseCurrencyName());
    }

    /* JADX INFO: renamed from: j */
    public static final void m21812j(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45400p c45400p;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q3 == null || (c45400p = c45373b0M21751Q3.f102026d) == null || (root = c45400p.getRoot()) == null) {
            return;
        }
        ViewExtKt.m66577h(root);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m21813k(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        return kLineNtfFragmentBase.m21755U3().getNftInfo().getIsNft() && !kLineNtfFragmentBase.m21753S3().isInCallAuctionTrade();
    }

    /* JADX INFO: renamed from: l */
    public static final void m21814l(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase, @NotNull NTFInfo nftInfo) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        Intrinsics.checkNotNullParameter(nftInfo, "nftInfo");
        if (!m21813k(kLineNtfFragmentBase)) {
            m21812j(kLineNtfFragmentBase);
            return;
        }
        NFTEntity entity = nftInfo.getEntity();
        if (entity != null) {
            m21807e(kLineNtfFragmentBase, nftInfo, entity);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m21815m(KLineNtfFragmentBase kLineNtfFragmentBase, NTFInfo nTFInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nTFInfo = kLineNtfFragmentBase.m21755U3().getNftInfo();
        }
        m21814l(kLineNtfFragmentBase, nTFInfo);
    }

    /* JADX INFO: renamed from: e */
    public static final void m21807e(final KLineNtfFragmentBase kLineNtfFragmentBase, NTFInfo nTFInfo, final NFTEntity nFTEntity) {
        C45400p c45400p;
        BaseTextView baseTextView;
        C45400p c45400p2;
        FrameLayout frameLayout;
        C45400p c45400p3;
        FrameLayout frameLayout2;
        C45400p c45400p4;
        FrameLayout frameLayout3;
        C45400p c45400p5;
        BaseTextView baseTextView2;
        C45400p c45400p6;
        BaseTextView baseTextView3;
        C45400p c45400p7;
        BaseTextView baseTextView4;
        C45400p c45400p8;
        BaseTextView baseTextView5;
        C45400p c45400p9;
        BaseTextView baseTextView6;
        C45400p c45400p10;
        BaseTextView baseTextView7;
        C45400p c45400p11;
        BaseTextView baseTextView8;
        String strM92640e;
        C45400p c45400p12;
        BaseTextView baseTextView9;
        String strM92640e2;
        BaseTextView baseTextView10;
        C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q3 != null && (baseTextView10 = c45373b0M21751Q3.f102028f) != null) {
            baseTextView10.setText(C27017c.f54310a.m66516f(R$string.nft_about, nTFInfo.getBaseCurrencyName()));
        }
        C45373b0 c45373b0M21751Q4 = kLineNtfFragmentBase.m21751Q3();
        ArrayList arrayList = null;
        if (c45373b0M21751Q4 != null && (c45400p12 = c45373b0M21751Q4.f102026d) != null && (baseTextView9 = c45400p12.f102278j) != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(nFTEntity.getCurrentTotalCirculation());
            if (bigDecimalM66536f != null) {
                strM92640e2 = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, true, 0, null, 111, null);
            } else {
                strM92640e2 = null;
            }
            baseTextView9.setText(C27041f.m66669i(strM92640e2, "--"));
        }
        C45373b0 c45373b0M21751Q5 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q5 != null && (c45400p11 = c45373b0M21751Q5.f102026d) != null && (baseTextView8 = c45400p11.f102274f) != null) {
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(nFTEntity.getInitialDistributeIssuance());
            if (bigDecimalM66536f2 != null) {
                strM92640e = C42180b.m92640e(bigDecimalM66536f2, null, 0, false, false, true, 0, null, 111, null);
            } else {
                strM92640e = null;
            }
            baseTextView8.setText(C27041f.m66669i(strM92640e, "--"));
        }
        C45373b0 c45373b0M21751Q6 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q6 != null && (c45400p10 = c45373b0M21751Q6.f102026d) != null && (baseTextView7 = c45400p10.f102280l) != null) {
            baseTextView7.setText(C42179a.m92629b(C27039d.m66652l(nFTEntity.getDistributeTime()), null, false, null, false, 15, null));
        }
        C45373b0 c45373b0M21751Q7 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q7 != null && (c45400p9 = c45373b0M21751Q7.f102026d) != null && (baseTextView6 = c45400p9.f102271c) != null) {
            baseTextView6.setText(C27041f.m66669i(nFTEntity.getPositionDisplayLink(), "--"));
        }
        C45373b0 c45373b0M21751Q8 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q8 != null && (c45400p8 = c45373b0M21751Q8.f102026d) != null && (baseTextView5 = c45400p8.f102271c) != null) {
            C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.core.biz.kline.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11919w.m21808f(nFTEntity);
                }
            }, 1, null);
        }
        String descText = nFTEntity.getDescText();
        if (descText != null && descText.length() != 0) {
            C45373b0 c45373b0M21751Q9 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q9 != null && (c45400p7 = c45373b0M21751Q9.f102026d) != null && (baseTextView4 = c45400p7.f102273e) != null) {
                ViewExtKt.m66594y(baseTextView4);
            }
            C45373b0 c45373b0M21751Q10 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q10 != null && (c45400p6 = c45373b0M21751Q10.f102026d) != null && (baseTextView3 = c45400p6.f102273e) != null) {
                baseTextView3.setText(nFTEntity.getDescText());
            }
        } else {
            C45373b0 c45373b0M21751Q11 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q11 != null && (c45400p = c45373b0M21751Q11.f102026d) != null && (baseTextView = c45400p.f102273e) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        }
        C45373b0 c45373b0M21751Q12 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q12 != null && (c45400p5 = c45373b0M21751Q12.f102026d) != null && (baseTextView2 = c45400p5.f102276h) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.core.biz.kline.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11919w.m21809g();
                }
            }, 1, null);
        }
        List<String> mediaUrls = nFTEntity.getMediaUrls();
        if (mediaUrls != null) {
            arrayList = new ArrayList();
            for (Object obj : mediaUrls) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C45373b0 c45373b0M21751Q13 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q13 != null && (c45400p4 = c45373b0M21751Q13.f102026d) != null && (frameLayout3 = c45400p4.f102270b) != null) {
                ViewExtKt.m66594y(frameLayout3);
            }
            C45373b0 c45373b0M21751Q14 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q14 != null && (c45400p3 = c45373b0M21751Q14.f102026d) != null && (frameLayout2 = c45400p3.f102270b) != null) {
                C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.core.biz.kline.v
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C11919w.m21810h(nFTEntity, kLineNtfFragmentBase);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        C45373b0 c45373b0M21751Q15 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q15 != null && (c45400p2 = c45373b0M21751Q15.f102026d) != null && (frameLayout = c45400p2.f102270b) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m21808f(NFTEntity nFTEntity) {
        String positionJumpLink = nFTEntity.getPositionJumpLink();
        if (positionJumpLink != null) {
            Router.f46192a.m56184f(positionJumpLink).m4048k();
        }
        return Unit.INSTANCE;
    }
}
