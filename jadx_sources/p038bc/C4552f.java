package p038bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.tradebase.R$drawable;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n30.C42738n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: bc.f */
/* JADX INFO: compiled from: ToggleCardSelectorAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\t0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardSelectorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder;", "<init>", "()V", "selectedMode", "Lcom/kubi/component/dialog/ToggleCardSelectedMode;", "data", "", "Lcom/kubi/component/dialog/ToggleCardModeData;", "setData", "", ExifInterface.GPS_DIRECTION_TRUE, "newData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4552f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public InterfaceC4549c f4010i = InterfaceC4549c.a.f4002a;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<ToggleCardModeData<?>> f4011j = new ArrayList();

    /* JADX INFO: renamed from: bc.f$a */
    /* JADX INFO: compiled from: ToggleCardSelectorAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nJ\u001c\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kubi/tradebase/databinding/KcLayoutToggleCardItemSelectorBinding;", "<init>", "(Lcom/kubi/component/dialog/ToggleCardSelectorAdapter;Lcom/kubi/tradebase/databinding/KcLayoutToggleCardItemSelectorBinding;)V", "bindItem", "", ExifInterface.GPS_DIRECTION_TRUE, "model", "Lcom/kubi/component/dialog/ToggleCardModeData;", "updateUIBySelectedMode", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nToggleCardSelectorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleCardSelectorAdapter.kt\ncom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n360#2,7:104\n*S KotlinDebug\n*F\n+ 1 ToggleCardSelectorAdapter.kt\ncom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder\n*L\n66#1:104,7\n*E\n"})
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final C42738n f4012g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C4552f f4013h;

        /* JADX INFO: renamed from: e */
        public static final Unit m4441e(C4552f c4552f, a aVar, ToggleCardModeData toggleCardModeData, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Iterator it2 = c4552f.f4011j.iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (((ToggleCardModeData) it2.next()).getIsSelected()) {
                    break;
                }
                i11++;
            }
            if (i11 != -1 && i11 != aVar.getBindingAdapterPosition()) {
                ((ToggleCardModeData) c4552f.f4011j.get(i11)).m4433f(false);
                c4552f.notifyItemChanged(i11);
            }
            boolean z11 = !toggleCardModeData.getIsSelected();
            toggleCardModeData.m4433f(z11);
            c4552f.notifyItemChanged(aVar.getBindingAdapterPosition());
            toggleCardModeData.m4430c().invoke(toggleCardModeData.m4428a(), Boolean.valueOf(z11));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C4552f c4552f, C42738n binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f4013h = c4552f;
            this.f4012g = binding;
        }

        /* JADX INFO: renamed from: c */
        public final <T> void m4443c(@NotNull ToggleCardModeData<T> model) {
            Intrinsics.checkNotNullParameter(model, "model");
            C42738n c42738n = this.f4012g;
            c42738n.f94655e.setText(model.getTitle());
            c42738n.f94654d.setText(model.getDesc());
            c42738n.f94653c.setChecked(model.getIsSelected());
            c42738n.f94652b.setSelected(model.getIsSelected());
            m4444d(model);
        }

        /* JADX INFO: renamed from: d */
        public final <T> void m4444d(final ToggleCardModeData<T> toggleCardModeData) {
            C42738n c42738n = this.f4012g;
            final C4552f c4552f = this.f4013h;
            InterfaceC4549c interfaceC4549c = c4552f.f4010i;
            if (Intrinsics.areEqual(interfaceC4549c, InterfaceC4549c.a.f4002a)) {
                c42738n.f94652b.setClickable(true);
                c42738n.f94652b.setBackgroundResource(toggleCardModeData.getIsSelected() ? R$drawable.shape_border_emphasis_8r : R$drawable.shape_border_emphasis16_8r);
                KcSwitchButton switchCompat = c42738n.f94653c;
                Intrinsics.checkNotNullExpressionValue(switchCompat, "switchCompat");
                ViewExtKt.m66577h(switchCompat);
                ConstraintLayout layoutItem = c42738n.f94652b;
                Intrinsics.checkNotNullExpressionValue(layoutItem, "layoutItem");
                ViewExtKt.m66575f(layoutItem, new Function1() { // from class: bc.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4552f.a.m4441e(c4552f, this, toggleCardModeData, (View) obj);
                    }
                });
                return;
            }
            if (!Intrinsics.areEqual(interfaceC4549c, InterfaceC4549c.b.f4003a)) {
                throw new NoWhenBranchMatchedException();
            }
            c42738n.f94652b.setClickable(false);
            KcSwitchButton switchCompat2 = c42738n.f94653c;
            Intrinsics.checkNotNullExpressionValue(switchCompat2, "switchCompat");
            ViewExtKt.m66594y(switchCompat2);
            c42738n.f94653c.setOnCheckedChangeListener(null);
            c42738n.f94653c.setChecked(toggleCardModeData.getIsSelected());
            c42738n.f94653c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bc.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    C4552f.a.m4442f(toggleCardModeData, c4552f, this, compoundButton, z11);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public static final void m4442f(ToggleCardModeData toggleCardModeData, C4552f c4552f, a aVar, CompoundButton compoundButton, boolean z11) {
            if (toggleCardModeData.getIsSelected() != z11) {
                toggleCardModeData.m4433f(z11);
                c4552f.notifyItemChanged(aVar.getBindingAdapterPosition());
                toggleCardModeData.m4430c().invoke(toggleCardModeData.m4428a(), Boolean.valueOf(z11));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4011j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m4443c(this.f4011j.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C42738n c42738nM93650c = C42738n.m93650c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c42738nM93650c, "inflate(...)");
        return new a(this, c42738nM93650c);
    }

    /* JADX INFO: renamed from: k */
    public final <T> void m4438k(@NotNull List<ToggleCardModeData<T>> newData, @NotNull InterfaceC4549c selectedMode) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(selectedMode, "selectedMode");
        this.f4010i = selectedMode;
        this.f4011j.clear();
        this.f4011j.addAll(newData);
    }
}
