package com.kubi.kumex.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: SelectMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0015J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/dialog/SelectMenuDialog;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "data", "", "Lcom/kubi/kumex/dialog/SelectObject;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "list", "Landroidx/recyclerview/widget/RecyclerView;", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "select", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectMenuDialog.kt\ncom/kubi/kumex/dialog/SelectMenuDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1878#2,3:101\n*S KotlinDebug\n*F\n+ 1 SelectMenuDialog.kt\ncom/kubi/kumex/dialog/SelectMenuDialog\n*L\n95#1:101,3\n*E\n"})
public final class SelectMenuDialog extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Context f28868D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final List<SelectObject> f28869E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Function1<Object, Unit> f28870F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final RecyclerView f28871G;

    /* JADX INFO: renamed from: com.kubi.kumex.dialog.SelectMenuDialog$a */
    /* JADX INFO: compiled from: SelectMenuDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/dialog/SelectMenuDialog$initViews$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/dialog/SelectObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15849a implements ItemCallBack<SelectObject> {
        public C15849a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, SelectObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            SelectMenuDialog.this.f28870F.invoke(data.getTag());
            SelectMenuDialog.this.m33559m0(i11);
            SelectMenuDialog.this.m96331y();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectMenuDialog(@NotNull Context context, @NotNull List<SelectObject> data, @NotNull Function1<Object, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f28868D = context;
        this.f28869E = data;
        this.f28870F = action;
        m96317a0(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final Context context2 = linearLayout.getContext();
        RecyclerView recyclerView = new RecyclerView(context2) { // from class: com.kubi.kumex.dialog.SelectMenuDialog$1$1
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public void onMeasure(int widthSpec, int heightSpec) {
                int mode = View.MeasureSpec.getMode(heightSpec);
                if (mode != 0) {
                    super.onMeasure(widthSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(heightSpec)) * 0.7d), mode));
                } else {
                    super.onMeasure(widthSpec, heightSpec);
                }
            }
        };
        this.f28871G = recyclerView;
        recyclerView.setBackgroundColor(C27017c.f54310a.m66512a(R$color.c_overlay));
        linearLayout.addView(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(Color.parseColor("#7f000000"));
        ViewExtKt.m66575f(view, new Function1() { // from class: com.kubi.kumex.dialog.n2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectMenuDialog.m33557k0(this.f28957b, (View) obj);
            }
        });
        linearLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        m96309S(linearLayout);
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m33557k0(SelectMenuDialog selectMenuDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selectMenuDialog.m96331y();
        return Unit.INSTANCE;
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@NotNull View view, @Nullable C43724b c43724b) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo25306H(view, c43724b);
        this.f28871G.setAdapter(BaseAdapter.a.m57323c(new BaseAdapter.a().m57326d(this.f28869E), SelectObject.class, SelectObjectProxy.class, new C15849a(), null, 8, null).m57324a());
        ViewExKt.m36476b(this.f28871G);
        this.f28871G.setLayoutManager(new LinearLayoutManager(this.f28868D, 1, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m33559m0(int i11) {
        int i12 = 0;
        for (Object obj : this.f28869E) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((SelectObject) obj).m33657d(i12 == i11);
            i12 = i13;
        }
        RecyclerView.Adapter adapter = this.f28871G.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
