package com.kubi.home.shortcut.edit;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.home.shortcut.IMenuItem;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import dj.C36716a;
import fj.C37525j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: EditHomeMenuActivity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "homeLayoutFastToggleBinding", "Lcom/kubi/home/databinding/HomeLayoutFastToggleBinding;", "getHomeLayoutFastToggleBinding", "()Lcom/kubi/home/databinding/HomeLayoutFastToggleBinding;", "homeLayoutFastToggleBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "editHomeMenuHelper", "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "adapterCreateHelper", "Lcom/kubi/home/shortcut/edit/AdapterCreateHelper;", "newAddFunctionList", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initNavigation", "initEditBtn", "handleRightClick", "enableEditMode", "initSaveBtn", "saveMenu", "onResume", "mapNewAddFunctionStr", "", "onBackPressed", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditHomeMenuActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditHomeMenuActivity.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n49#2,15:232\n1869#3,2:247\n1878#3,3:249\n*S KotlinDebug\n*F\n+ 1 EditHomeMenuActivity.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuActivity\n*L\n34#1:232,15\n117#1:247,2\n200#1:249,3\n*E\n"})
public final class EditHomeMenuActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ KProperty<Object>[] f26254z = {Reflection.property1(new PropertyReference1Impl(EditHomeMenuActivity.class, "homeLayoutFastToggleBinding", "getHomeLayoutFastToggleBinding()Lcom/kubi/home/databinding/HomeLayoutFastToggleBinding;", 0))};

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f26255v = C45678b.m100788b(this, new Function1<C37525j, Unit>() { // from class: com.kubi.home.shortcut.edit.EditHomeMenuActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C37525j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37525j c37525j) {
            invoke(c37525j);
            return Unit.INSTANCE;
        }
    }, new Function1<EditHomeMenuActivity, C37525j>() { // from class: com.kubi.home.shortcut.edit.EditHomeMenuActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37525j invoke(@NotNull EditHomeMenuActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s149561943(...)");
            return C37525j.m84511a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public EditHomeMenuHelper f26256w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public AdapterCreateHelper f26257x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public List<FunctionEntity> f26258y;

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        m56590g0(true);
        super.onCreate(savedInstanceState);
        setPageId(HomeCardViewHolderProxy.PAGE_ID);
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        int i11 = R$color.c_background;
        edgeToEdgeCompat.m58267e(this, ContextCompat.getColor(this, i11));
        C37525j c37525jM30328r0 = m30328r0();
        if (c37525jM30328r0 != null && (recyclerView2 = c37525jM30328r0.f83342b) != null) {
            recyclerView2.setBackgroundResource(i11);
            recyclerView2.setAdapter(this.f26257x.m30338b());
        }
        C37525j c37525jM30328r1 = m30328r0();
        if (c37525jM30328r1 != null && (recyclerView = c37525jM30328r1.f83342b) != null) {
            recyclerView.setItemViewCacheSize(15);
        }
        m30331v0();
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m30322u0(EditHomeMenuActivity editHomeMenuActivity, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        editHomeMenuActivity.m30329s0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m30323x0(EditHomeMenuActivity editHomeMenuActivity, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        editHomeMenuActivity.m30329s0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m30324z0(final EditHomeMenuActivity editHomeMenuActivity, BaseViewHolder viewHolder, final DialogFragmentHelper fragment) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        View view = viewHolder.getView(R$id.cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.shortcut.edit.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditHomeMenuActivity.m30314A0(fragment);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.sure);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.home.shortcut.edit.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditHomeMenuActivity.m30315B0(this.f26282b);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.home_layout_fast_toggle;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f26256w.getF26292g()) {
            super.onBackPressed();
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.home_menu_save_notice, 3, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.home.shortcut.edit.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EditHomeMenuActivity.m30324z0(this.f26279b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "home_menu_save_notice");
    }

    /* JADX INFO: renamed from: r0 */
    public final C37525j m30328r0() {
        return (C37525j) this.f26255v.getValue(this, f26254z[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m30329s0() throws JSONException {
        RecyclerView recyclerViewM30344h;
        EditHomeMenuHelper editHomeMenuHelper = this.f26256w;
        editHomeMenuHelper.m30370s(!editHomeMenuHelper.getF26292g());
        this.f26256w.m30365l().m30390v(this.f26256w.getF26292g());
        HeaderAdapter headerAdapterM30363j = this.f26256w.getF26289d();
        if (headerAdapterM30363j != null) {
            headerAdapterM30363j.notifyDataSetChanged();
        }
        Set<Map.Entry<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>>> setEntrySet = this.f26256w.m30359f().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            ((BaseQuickAdapter) ((Map.Entry) it.next()).getValue()).notifyDataSetChanged();
        }
        if (this.f26256w.getF26292g()) {
            m30327q0();
            return;
        }
        m30325C0();
        View viewM30346j = this.f26257x.getF26270h();
        if (viewM30346j != null) {
            ViewExtKt.m66577h(viewM30346j);
        }
        RecyclerView.ItemDecoration itemDecorationM30345i = this.f26257x.getF26266d();
        if (itemDecorationM30345i == null || (recyclerViewM30344h = this.f26257x.getF26265c()) == null) {
            return;
        }
        recyclerViewM30344h.removeItemDecoration(itemDecorationM30345i);
    }

    /* JADX INFO: renamed from: y0 */
    public final String m30333y0() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (Object obj : this.f26258y) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb2.append(((FunctionEntity) obj).getUri());
            if (i11 != this.f26258y.size() - 1) {
                sb2.append(",");
            }
            i11 = i12;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public EditHomeMenuActivity() {
        EditHomeMenuHelper editHomeMenuHelper = new EditHomeMenuHelper(this);
        this.f26256w = editHomeMenuHelper;
        this.f26257x = new AdapterCreateHelper(editHomeMenuHelper, this);
        this.f26258y = new ArrayList();
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m30314A0(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m30315B0(EditHomeMenuActivity editHomeMenuActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m30325C0() throws JSONException {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        C37525j c37525jM30328r0 = m30328r0();
        List<? extends IMenuItem> data = null;
        if (c37525jM30328r0 != null && (recyclerView = c37525jM30328r0.f83342b) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.home.shortcut.edit.EditHomeContentAdapter");
        ((TextView) ((EditHomeContentAdapter) adapter).getHeaderLayout().findViewById(R$id.tv_tips)).setText(C27017c.f54310a.m66516f(R$string.home_page_ten_entry_tips, 19));
        this.f26257x.m30349m();
        EditHomeMenuViewModel editHomeMenuViewModelM30365l = this.f26256w.m30365l();
        HeaderAdapter headerAdapterM30363j = this.f26256w.getF26289d();
        if (headerAdapterM30363j != null) {
            data = headerAdapterM30363j.getData();
        }
        editHomeMenuViewModelM30365l.m30389u(data);
        m30330t0();
        String strM30333y0 = m30333y0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", strM30333y0);
        Unit unit = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "save", "1", jSONObject);
        this.f26258y.clear();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f26256w.m30366m();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m30327q0() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        RecyclerView recyclerViewM30344h;
        m30332w0();
        this.f26257x.m30341e();
        View viewM30346j = this.f26257x.getF26270h();
        if (viewM30346j != null) {
            ViewExtKt.m66594y(viewM30346j);
        }
        RecyclerView.ItemDecoration itemDecorationM30345i = this.f26257x.getF26266d();
        if (itemDecorationM30345i != null && (recyclerViewM30344h = this.f26257x.getF26265c()) != null) {
            recyclerViewM30344h.addItemDecoration(itemDecorationM30345i);
        }
        C37525j c37525jM30328r0 = m30328r0();
        if (c37525jM30328r0 != null && (recyclerView = c37525jM30328r0.f83342b) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.home.shortcut.edit.EditHomeContentAdapter");
        ((TextView) ((EditHomeContentAdapter) adapter).getHeaderLayout().findViewById(R$id.tv_tips)).setText(getString(R$string.home_page_ten_drag_tips));
        C36716a.m82243f(HomeCardViewHolderProxy.PAGE_ID, "editQuickAccess", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m30330t0() {
        ImageView rightThree = getNavigationBar().getRightThree();
        Intrinsics.checkNotNull(rightThree);
        ViewExtKt.m66594y(rightThree);
        rightThree.setScaleType(ImageView.ScaleType.CENTER);
        rightThree.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        rightThree.setImageTintList(ContextCompat.getColorStateList(this.f46505q, R$color.c_icon));
        rightThree.setImageResource(R$drawable.ic_edit2_24);
        ViewExtKt.m66575f(rightThree, new Function1() { // from class: com.kubi.home.shortcut.edit.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditHomeMenuActivity.m30322u0(this.f26278b, (View) obj);
            }
        });
        TextView rightText = getNavigationBar().getRightText();
        Intrinsics.checkNotNullExpressionValue(rightText, "getRightText(...)");
        ViewExtKt.m66577h(rightText);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m30331v0() {
        NavigationBar navigationBar = getNavigationBar();
        navigationBar.setMainTitle(getString(R$string.quick_access));
        navigationBar.setBackGroundColor(C27017c.f54310a.m66512a(R$color.c_background));
        m30330t0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m30332w0() {
        getNavigationBar().m54697h(R$string.save, R$color.primary);
        TextView rightText = getNavigationBar().getRightText();
        Intrinsics.checkNotNullExpressionValue(rightText, "getRightText(...)");
        ViewExtKt.m66575f(rightText, new Function1() { // from class: com.kubi.home.shortcut.edit.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditHomeMenuActivity.m30323x0(this.f26280b, (View) obj);
            }
        });
        TextView rightText2 = getNavigationBar().getRightText();
        Intrinsics.checkNotNullExpressionValue(rightText2, "getRightText(...)");
        ViewExtKt.m66594y(rightText2);
        ImageView rightThree = getNavigationBar().getRightThree();
        Intrinsics.checkNotNullExpressionValue(rightThree, "getRightThree(...)");
        ViewExtKt.m66577h(rightThree);
    }
}
