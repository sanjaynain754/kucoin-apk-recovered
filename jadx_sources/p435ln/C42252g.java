package p435ln;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p011a9.C0204d;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.g */
/* JADX INFO: compiled from: CheckCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/multitype/CheckCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/multitype/CheckCell;", "Lcom/kubi/kyc/multitype/CheckCellViewBinder$ViewHolder;", "<init>", "()V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", C33954u6.f72238i, "item", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42252g extends AbstractC46843b<C42242b, a> {

    /* JADX INFO: renamed from: ln.g$a */
    /* JADX INFO: compiled from: CheckCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/multitype/CheckCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final CheckBox f93708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.check_box);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f93708g = (CheckBox) viewFindViewById;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckBox getF93708g() {
            return this.f93708g;
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull a holder, @NotNull final C42242b item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getF93708g().setChecked(item.m92683c());
        holder.getF93708g().setText(item.m92682b());
        holder.getF93708g().setMovementMethod(LinkMovementMethod.getInstance());
        Object tag = holder.getF93708g().getTag(holder.getF93708g().getId());
        if (tag instanceof Disposable) {
            ((Disposable) tag).dispose();
        }
        AbstractC46099a<Boolean> abstractC46099aM779a = C0204d.m779a(holder.getF93708g());
        final Function1 function1 = new Function1() { // from class: ln.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42252g.m92692n(item, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: ln.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42252g.m92693o(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ln.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42252g.m92694p((Throwable) obj);
            }
        };
        holder.getF93708g().setTag(holder.getF93708g().getId(), abstractC46099aM779a.subscribe(consumer, new Consumer() { // from class: ln.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42252g.m92695q(function2, obj);
            }
        }));
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_item_cell_check, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m92692n(C42242b c42242b, Boolean bool) throws Exception {
        Intrinsics.checkNotNull(bool);
        c42242b.m92685e(bool.booleanValue());
        Consumer<Boolean> consumerM92681a = c42242b.m92681a();
        if (consumerM92681a != null) {
            consumerM92681a.accept(bool);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m92693o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m92694p(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m92695q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
