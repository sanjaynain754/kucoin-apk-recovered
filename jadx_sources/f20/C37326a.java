package f20;

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

/* JADX INFO: renamed from: f20.a */
/* JADX INFO: compiled from: SpotBannerDataOperator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/spot/business/banner/SpotBannerDataOperator;", "", "bannerList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "<init>", "(Ljava/util/List;)V", "mBannerList", "displayBannerList", "Ljava/util/ArrayList;", "Lcom/kubi/spot/business/banner/SpotDisplayBanner;", "Lkotlin/collections/ArrayList;", "getDisplayList", "closeBanner", "", "data", "removeBanner", "jumpToBannerDetail", "content", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotBannerDataOperator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotBannerDataOperator.kt\ncom/kubi/spot/business/banner/SpotBannerDataOperator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n774#2:65\n865#2,2:66\n1563#2:68\n1634#2,3:69\n*S KotlinDebug\n*F\n+ 1 SpotBannerDataOperator.kt\ncom/kubi/spot/business/banner/SpotBannerDataOperator\n*L\n22#1:65\n22#1:66,2\n23#1:68\n23#1:69,3\n*E\n"})
public final class C37326a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public List<SpotBannerItemEntity> f82840a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public ArrayList<InterfaceC37327b> f82841b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m83897a(@Nullable InterfaceC37327b interfaceC37327b) {
        String bannerId;
        if (interfaceC37327b instanceof InterfaceC37327b.Common) {
            bannerId = ((InterfaceC37327b.Common) interfaceC37327b).getBannerId();
        } else {
            if (interfaceC37327b != null) {
                throw new NoWhenBranchMatchedException();
            }
            bannerId = null;
        }
        if (bannerId != null) {
            C37328c.m83904a(bannerId);
        }
        m83900d(interfaceC37327b);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC37327b> m83898b() {
        this.f82841b.clear();
        List<SpotBannerItemEntity> list = this.f82840a;
        if (list != null) {
            ArrayList<SpotBannerItemEntity> arrayList = new ArrayList();
            for (Object obj : list) {
                String id2 = ((SpotBannerItemEntity) obj).getId();
                if (id2 != null && C37328c.m83906c(id2)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (SpotBannerItemEntity spotBannerItemEntity : arrayList) {
                arrayList2.add(new InterfaceC37327b.Common(spotBannerItemEntity.getId(), new InterfaceC37327b.ContentItem(spotBannerItemEntity.getNotice(), spotBannerItemEntity.getAppLink())));
            }
            this.f82841b.addAll(arrayList2);
        }
        return CollectionsKt.toList(this.f82841b);
    }

    /* JADX INFO: renamed from: c */
    public final void m83899c(@Nullable MarqueeTextView.InterfaceC22932e interfaceC22932e) {
        if (interfaceC22932e instanceof InterfaceC37327b.ContentItem) {
            Router.f46192a.m56184f(C27041f.m66668h(((InterfaceC37327b.ContentItem) interfaceC22932e).getAppUrl())).m4048k();
        } else {
            C44128b.m97260d("spot banner url exception");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m83900d(InterfaceC37327b interfaceC37327b) {
        TypeIntrinsics.asMutableCollection(this.f82841b).remove(interfaceC37327b);
    }

    public C37326a(@Nullable List<SpotBannerItemEntity> list) {
        this.f82840a = list;
    }
}
