package p275fy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.BaseMultiItemAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fy.e */
/* JADX INFO: compiled from: MultiItemAdapterEx.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u001aÈ\u0001\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u000b*\u00020\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u00020\t2K\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\u000b0\u000f2Q\u0010\u0016\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u000b0\u0017¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u000f\u001a¶\u0002\u0010\u001a\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u000b*\u00020\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u00020\t2K\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\u000b0\u000f2Q\u0010\u0016\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u000b0\u0017¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u000f2l\u0010\u001b\u001ah\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u000b0\u0017¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001c¨\u0006 "}, m90084d2 = {"registerItemType", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/BaseMultiItemAdapter;", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "registerBinder", "VB", "Landroidx/viewbinding/ViewBinding;", "itemType", "viewBinder", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "inflate", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "onBind", "Lcom/kubi/sdk/adapter/BaseQuickVH;", C33954u6.f72238i, ViewProps.POSITION, "registerBinderWithPayload", "onBindPayload", "Lkotlin/Function4;", "", "", "payloads", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37732e {

    /* JADX INFO: Add missing generic type declarations: [T, VB] */
    /* JADX INFO: renamed from: fy.e$a */
    /* JADX INFO: compiled from: MultiItemAdapterEx.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0001J-\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/sdk/adapter/MultiItemAdapterExKt$registerBinder$1", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItemAdapterListener;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "onBind", "", C33954u6.f72238i, ViewProps.POSITION, "", "item", "(Lcom/kubi/sdk/adapter/BaseQuickVH;ILjava/lang/Object;)V", "onCreate", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a<T, VB> implements BaseMultiItemAdapter.OnMultiItemAdapterListener<T, C37728a<VB>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function3<C37728a<VB>, Integer, T, Unit> f85010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, VB> f85011b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super C37728a<VB>, ? super Integer, ? super T, Unit> function3, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> function4) {
            this.f85010a = function3;
            this.f85011b = function4;
        }

        @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnMultiItemAdapterListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBind(C37728a<VB> holder, int i11, T t11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (t11 == null) {
                return;
            }
            this.f85010a.invoke(holder, Integer.valueOf(i11), t11);
        }

        @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnMultiItemAdapterListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37728a<VB> onCreate(Context context, ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Function3<LayoutInflater, ViewGroup, Boolean, VB> function3 = this.f85011b;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
            return new C37728a<>((ViewBinding) function3.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, VB] */
    /* JADX INFO: renamed from: fy.e$b */
    /* JADX INFO: compiled from: MultiItemAdapterEx.kt */
    @Metadata(m90083d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0001J;\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ-\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, m90084d2 = {"com/kubi/sdk/adapter/MultiItemAdapterExKt$registerBinderWithPayload$1", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItemAdapterListener;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "onBind", "", C33954u6.f72238i, ViewProps.POSITION, "", "item", "payloads", "", "", "(Lcom/kubi/sdk/adapter/BaseQuickVH;ILjava/lang/Object;Ljava/util/List;)V", "(Lcom/kubi/sdk/adapter/BaseQuickVH;ILjava/lang/Object;)V", "onCreate", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b<T, VB> implements BaseMultiItemAdapter.OnMultiItemAdapterListener<T, C37728a<VB>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function4<C37728a<VB>, Integer, T, List<? extends Object>, Unit> f85012a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3<C37728a<VB>, Integer, T, Unit> f85013b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, VB> f85014c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function4<? super C37728a<VB>, ? super Integer, ? super T, ? super List<? extends Object>, Unit> function4, Function3<? super C37728a<VB>, ? super Integer, ? super T, Unit> function3, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> function5) {
            this.f85012a = function4;
            this.f85013b = function3;
            this.f85014c = function5;
        }

        @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnMultiItemAdapterListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBind(C37728a<VB> holder, int i11, T t11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (t11 == null) {
                return;
            }
            this.f85013b.invoke(holder, Integer.valueOf(i11), t11);
        }

        @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnMultiItemAdapterListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBind(C37728a<VB> holder, int i11, T t11, List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (t11 == null) {
                return;
            }
            this.f85012a.invoke(holder, Integer.valueOf(i11), t11, payloads);
        }

        @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnMultiItemAdapterListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C37728a<VB> onCreate(Context context, ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Function3<LayoutInflater, ViewGroup, Boolean, VB> function3 = this.f85014c;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
            return new C37728a<>((ViewBinding) function3.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final <T, VB extends ViewBinding> void m85034b(@NotNull BaseMultiItemAdapter<T> baseMultiItemAdapter, int i11, @NotNull Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> viewBinder, @NotNull Function3<? super C37728a<VB>, ? super Integer, ? super T, Unit> onBind) {
        Intrinsics.checkNotNullParameter(baseMultiItemAdapter, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        baseMultiItemAdapter.addItemType(i11, new a(onBind, viewBinder));
    }

    /* JADX INFO: renamed from: c */
    public static final <T, VB extends ViewBinding> void m85035c(@NotNull BaseMultiItemAdapter<T> baseMultiItemAdapter, int i11, @NotNull Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> viewBinder, @NotNull Function3<? super C37728a<VB>, ? super Integer, ? super T, Unit> onBind, @NotNull Function4<? super C37728a<VB>, ? super Integer, ? super T, ? super List<? extends Object>, Unit> onBindPayload) {
        Intrinsics.checkNotNullParameter(baseMultiItemAdapter, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        Intrinsics.checkNotNullParameter(onBindPayload, "onBindPayload");
        baseMultiItemAdapter.addItemType(i11, new b(onBindPayload, onBind, viewBinder));
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m85036d(@NotNull BaseMultiItemAdapter<T> baseMultiItemAdapter, @NotNull final Function1<? super T, Integer> block) {
        Intrinsics.checkNotNullParameter(baseMultiItemAdapter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        baseMultiItemAdapter.onItemViewType(new BaseMultiItemAdapter.OnItemViewTypeListener() { // from class: fy.d
            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.OnItemViewTypeListener
            public final int onItemViewType(int i11, List list) {
                return C37732e.m85037e(block, i11, list);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final int m85037e(Function1 function1, int i11, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Object obj = list.get(i11);
        return obj == null ? BaseQuickAdapter.EMPTY_VIEW : ((Number) function1.invoke(obj)).intValue();
    }
}
