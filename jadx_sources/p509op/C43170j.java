package p509op;

import com.kubi.margin.entity.IsolatedIncomeBanner;
import com.kubi.margin.entity.IsolatedIncomeBannerResp;
import com.kubi.margin.entity.MarginBanner;
import com.kubi.margin.entity.MarginBannerV2;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: op.j */
/* JADX INFO: compiled from: MarginBannerDataOperator.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/MarginBannerDataOperator;", "", "sourceData", "Lcom/kubi/margin/entity/MarginBannerV2;", "<init>", "(Lcom/kubi/margin/entity/MarginBannerV2;)V", "displayBannerList", "Ljava/util/ArrayList;", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "Lkotlin/collections/ArrayList;", "getDisplayList", "", "closeBanner", "", "data", "removeBanner", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginBannerDataOperator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginBannerDataOperator.kt\ncom/kubi/margin/trade/banner/MarginBannerDataOperator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1563#2:71\n1634#2,3:72\n774#2:75\n865#2,2:76\n1563#2:78\n1634#2,3:79\n*S KotlinDebug\n*F\n+ 1 MarginBannerDataOperator.kt\ncom/kubi/margin/trade/banner/MarginBannerDataOperator\n*L\n19#1:71\n19#1:72,3\n38#1:75\n38#1:76,2\n40#1:78\n40#1:79,3\n*E\n"})
public final class C43170j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public ArrayList<InterfaceC43161a> f95332a;

    public C43170j(@NotNull MarginBannerV2 sourceData) {
        Intrinsics.checkNotNullParameter(sourceData, "sourceData");
        this.f95332a = new ArrayList<>();
        IsolatedIncomeBannerResp isolatedIncomeBannerResp = sourceData.getIsolatedIncomeBannerResp();
        if (isolatedIncomeBannerResp != null) {
            String bannerId = isolatedIncomeBannerResp.getBannerId();
            ArrayList arrayList = null;
            isolatedIncomeBannerResp = (bannerId == null || !C43162b.m94763c(bannerId, isolatedIncomeBannerResp.getCloseKeepDay())) ? null : isolatedIncomeBannerResp;
            if (isolatedIncomeBannerResp != null) {
                List<IsolatedIncomeBanner> itemList = isolatedIncomeBannerResp.getItemList();
                if (itemList != null) {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemList, 10));
                    for (IsolatedIncomeBanner isolatedIncomeBanner : itemList) {
                        arrayList.add(new InterfaceC43161a.ContentItem(isolatedIncomeBanner.getContent(), isolatedIncomeBanner.getWebUrl()));
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f95332a.add(new InterfaceC43161a.Income(isolatedIncomeBannerResp.getBannerId(), arrayList, isolatedIncomeBannerResp.getCloseKeepDay()));
                }
            }
        }
        List<MarginBanner> bannerList = sourceData.getBannerList();
        if (bannerList != null) {
            ArrayList<MarginBanner> arrayList2 = new ArrayList();
            for (Object obj : bannerList) {
                MarginBanner marginBanner = (MarginBanner) obj;
                String bannerId2 = marginBanner.getBannerId();
                if (bannerId2 != null && C43162b.m94763c(bannerId2, marginBanner.getCloseKeepDay())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (MarginBanner marginBanner2 : arrayList2) {
                arrayList3.add(new InterfaceC43161a.Common(marginBanner2.getBannerId(), new InterfaceC43161a.ContentItem(marginBanner2.getContent(), marginBanner2.getWebUrl()), marginBanner2.getCloseKeepDay()));
            }
            this.f95332a.addAll(arrayList3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m94782a(@Nullable InterfaceC43161a interfaceC43161a) {
        if (interfaceC43161a != null) {
            C43162b.m94761a(interfaceC43161a);
        }
        m94784c(interfaceC43161a);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC43161a> m94783b() {
        return CollectionsKt.toList(this.f95332a);
    }

    /* JADX INFO: renamed from: c */
    public final void m94784c(InterfaceC43161a interfaceC43161a) {
        TypeIntrinsics.asMutableCollection(this.f95332a).remove(interfaceC43161a);
    }
}
