package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.markers.KMutableIterator;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a0\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\b\u001aE\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006-"}, m90084d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "forEach", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "updateMarginsRelative", "start", "end", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1 */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C17971 implements Iterator<View>, KMutableIterator {
        final /* synthetic */ ViewGroup $this_iterator;
        private int index;

        public C17971(ViewGroup viewGroup) {
            this.$this_iterator = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getChildCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public View next() {
            ViewGroup viewGroup = this.$this_iterator;
            int i11 = this.index;
            this.index = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.$this_iterator;
            int i11 = this.index - 1;
            this.index = i11;
            viewGroup.removeViewAt(i11);
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull ViewGroup viewGroup) {
        return RangesKt.until(0, viewGroup.getChildCount());
    }

    @NotNull
    public static final Sequence<View> getChildren(@NotNull final ViewGroup viewGroup) {
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // p852kotlin.sequences.Sequence
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    @NotNull
    public static final Sequence<View> getDescendants(@NotNull final ViewGroup viewGroup) {
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // p852kotlin.sequences.Sequence
            @NotNull
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new Function1<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Iterator<View> invoke(View view) {
                        Sequence<View> children;
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 == null || (children = ViewGroupKt.getChildren(viewGroup2)) == null) {
                            return null;
                        }
                        return children.iterator();
                    }
                });
            }
        };
    }

    @NotNull
    public static final Iterator<View> iterator(@NotNull ViewGroup viewGroup) {
        return new C17971(viewGroup);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = marginLayoutParams.leftMargin;
        }
        if ((i15 & 2) != 0) {
            i12 = marginLayoutParams.topMargin;
        }
        if ((i15 & 4) != 0) {
            i13 = marginLayoutParams.rightMargin;
        }
        if ((i15 & 8) != 0) {
            i14 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = marginLayoutParams.getMarginStart();
        }
        if ((i15 & 2) != 0) {
            i12 = marginLayoutParams.topMargin;
        }
        if ((i15 & 4) != 0) {
            i13 = marginLayoutParams.getMarginEnd();
        }
        if ((i15 & 8) != 0) {
            i14 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(i13);
        marginLayoutParams.bottomMargin = i14;
    }

    public static final boolean contains(@NotNull ViewGroup viewGroup, @NotNull View view) {
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    public static final void forEach(@NotNull ViewGroup viewGroup, @NotNull Function1<? super View, Unit> function1) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            function1.invoke(viewGroup.getChildAt(i11));
        }
    }

    public static final void forEachIndexed(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super View, Unit> function2) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            function2.invoke(Integer.valueOf(i11), viewGroup.getChildAt(i11));
        }
    }

    @NotNull
    public static final View get(@NotNull ViewGroup viewGroup, int i11) {
        View childAt = viewGroup.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + viewGroup.getChildCount());
    }

    public static final int getSize(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(@NotNull ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(@NotNull ViewGroup viewGroup) {
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    public static final void minusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11) {
        marginLayoutParams.setMargins(i11, i11, i11, i11);
    }

    public static final void updateMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        marginLayoutParams.setMargins(i11, i12, i13, i14);
    }

    public static final void updateMarginsRelative(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(i13);
        marginLayoutParams.bottomMargin = i14;
    }
}
