package com.kubi.core.biz.banner;

import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.core.biz.banner.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotBannerDataOperator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerDataOperator;", "", "bannerList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "<init>", "(Ljava/util/List;)V", "mBannerList", "displayBannerList", "Ljava/util/ArrayList;", "Lcom/kubi/core/biz/banner/SpotDisplayBanner;", "getDisplayList", "closeBanner", "", "data", "removeBanner", "jumpToBannerDetail", "content", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotBannerDataOperator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotBannerDataOperator.kt\ncom/kubi/core/biz/banner/SpotBannerDataOperator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n774#2:71\n865#2,2:72\n1563#2:74\n1634#2,3:75\n*S KotlinDebug\n*F\n+ 1 SpotBannerDataOperator.kt\ncom/kubi/core/biz/banner/SpotBannerDataOperator\n*L\n28#1:71\n28#1:72,2\n29#1:74\n29#1:75,3\n*E\n"})
public final class SpotBannerDataOperator {

    /* JADX INFO: renamed from: a */
    @Nullable
    public List<SpotBannerItemEntity> f20155a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public ArrayList<SpotDisplayBanner> f20156b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m21298a(@Nullable SpotDisplayBanner spotDisplayBanner) {
        String bannerId;
        if (spotDisplayBanner instanceof SpotDisplayBanner.Common) {
            bannerId = ((SpotDisplayBanner.Common) spotDisplayBanner).getBannerId();
        } else {
            if (spotDisplayBanner != null) {
                throw new NoWhenBranchMatchedException();
            }
            bannerId = null;
        }
        if (bannerId != null) {
            C11711r.m21305a(bannerId);
        }
        m21301d(spotDisplayBanner);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<SpotDisplayBanner> m21299b() {
        this.f20156b.clear();
        List<SpotBannerItemEntity> list = this.f20155a;
        if (list != null) {
            ArrayList<SpotBannerItemEntity> arrayList = new ArrayList();
            for (Object obj : list) {
                String id2 = ((SpotBannerItemEntity) obj).getId();
                if (id2 != null && C11711r.m21307c(id2)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (SpotBannerItemEntity spotBannerItemEntity : arrayList) {
                arrayList2.add(new SpotDisplayBanner.Common(spotBannerItemEntity.getId(), new SpotDisplayBanner.ContentItem(spotBannerItemEntity.getNotice(), spotBannerItemEntity.getAppLink())));
            }
            this.f20156b.addAll(arrayList2);
        }
        return CollectionsKt.toList(this.f20156b);
    }

    /* JADX INFO: renamed from: c */
    public final void m21300c(@Nullable MarqueeTextView.InterfaceC22932e interfaceC22932e) {
        if (interfaceC22932e instanceof SpotDisplayBanner.ContentItem) {
            Router.f46192a.m56184f(C27041f.m66668h(((SpotDisplayBanner.ContentItem) interfaceC22932e).getAppUrl())).m4048k();
        } else {
            C44128b.m97260d("spot banner url exception");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21301d(SpotDisplayBanner spotDisplayBanner) {
        TypeIntrinsics.asMutableCollection(this.f20156b).remove(spotDisplayBanner);
    }

    public SpotBannerDataOperator(@Nullable List<SpotBannerItemEntity> list) {
        this.f20155a = list;
    }
}
