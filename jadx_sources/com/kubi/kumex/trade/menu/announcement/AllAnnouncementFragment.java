package com.kubi.kumex.trade.menu.announcement;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.trade.menu.p092vm.AnnouncementType;
import com.kubi.kumex.trade.menu.p092vm.AnnouncementViewModel;
import com.kubi.kumex.trade.menu.p092vm.C16943a;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: AllAnnouncementFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AllAnnouncementFragment;", "Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;", "getViewModel", "()Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "refresh", "bindData", "data", "", "Lcom/kubi/kumex/data/platform/model/Article;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AllAnnouncementFragment extends BaseAnnouncementTypeFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f30581Y;

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.announcement.AllAnnouncementFragment$a */
    /* JADX INFO: compiled from: AllAnnouncementFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16913a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f30582b;

        public C16913a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30582b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f30582b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30582b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public AllAnnouncementFragment() {
        super(AnnouncementType.ALL);
        this.f30581Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.menu.announcement.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AllAnnouncementFragment.m36339C3(this.f30602b);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public final AnnouncementViewModel m36343A3() {
        return (AnnouncementViewModel) this.f30581Y.getValue();
    }

    @Override // com.kubi.kumex.trade.menu.announcement.BaseAnnouncementTypeFragment
    /* JADX INFO: renamed from: o3 */
    public void mo36345o3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m36343A3().m36381n().observe(getViewLifecycleOwner(), new C16913a(new Function1() { // from class: com.kubi.kumex.trade.menu.announcement.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AllAnnouncementFragment.m36338B3(this.f30603b, (Pair) obj);
            }
        }));
        mo36344B0();
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m36338B3(AllAnnouncementFragment allAnnouncementFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            allAnnouncementFragment.m36365w3();
        } else {
            List<Article> list = (List) pair.getSecond();
            if (list == null) {
                allAnnouncementFragment.m36364u3();
            } else {
                C44128b.m97258b("bieber.." + list);
                allAnnouncementFragment.showContent();
                allAnnouncementFragment.m36342z3(list);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final AnnouncementViewModel m36339C3(AllAnnouncementFragment allAnnouncementFragment) {
        return C16943a.m36402a(allAnnouncementFragment);
    }

    /* JADX INFO: renamed from: z3 */
    private final void m36342z3(List<Article> list) {
        RecyclerView.Adapter adapter;
        if (list.isEmpty()) {
            C44128b.m97258b("bieber..show empty");
            m36363t3();
            return;
        }
        RecyclerView recyclerViewM36362s3 = m36362s3();
        if (recyclerViewM36362s3 != null) {
            adapter = recyclerViewM36362s3.getAdapter();
        } else {
            adapter = null;
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.trade.menu.announcement.AnnouncementTypeAdapter");
        ((AnnouncementTypeAdapter) adapter).m36350i(list);
    }

    @Override // com.kubi.kumex.trade.menu.announcement.BaseAnnouncementTypeFragment
    /* JADX INFO: renamed from: B0 */
    public void mo36344B0() {
        m36343A3().m36380d(MultiLanguageManager.f46811g.getLocalString(), AnnouncementType.ALL);
    }
}
