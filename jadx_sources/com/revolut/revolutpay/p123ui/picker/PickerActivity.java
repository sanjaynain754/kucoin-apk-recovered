package com.revolut.revolutpay.p123ui.picker;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.p122di.C27527a;
import com.revolut.revolutpay.p123ui.picker.model.C27572a;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import com.revolut.revolutpay.ui_kit.widget.SearchNavBar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import xa0.InterfaceC46118d;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/picker/PickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/revolut/revolutpay/ui/picker/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "", "Lxa0/d;", FirebaseAnalytics.Param.ITEMS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)V", "Lcom/revolut/revolutpay/ui/picker/model/a;", "countryInfo", "q", "(Lcom/revolut/revolutpay/ui/picker/model/a;)V", "Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;", "i", "Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;", "searchNavBar", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/revolut/revolutpay/ui/picker/e;", "k", "Lcom/revolut/revolutpay/ui/picker/e;", "presenter", "Lcom/revolut/revolutpay/ui/picker/c;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/revolut/revolutpay/ui/picker/c;", "pickerAdapter", "Lcom/revolut/revolutpay/ui_kit/delegate/a;", "m", "Lcom/revolut/revolutpay/ui_kit/delegate/a;", "rowWidgetDelegate", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class PickerActivity extends AppCompatActivity implements InterfaceC27570g {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SearchNavBar searchNavBar;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public RecyclerView recyclerView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public InterfaceC27568e presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public C27566c pickerAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C27591a rowWidgetDelegate = new C27591a();

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.PickerActivity$a */
    public static final class C27562a extends Lambda implements Function1<String, Unit> {
        public C27562a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m68388a(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC27568e interfaceC27568e = PickerActivity.this.presenter;
            if (interfaceC27568e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                interfaceC27568e = null;
            }
            interfaceC27568e.mo68392a(it);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m68388a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.PickerActivity$b */
    public static final class C27563b extends Lambda implements Function1<C27591a.b, Unit> {
        public C27563b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m68389a(@NotNull C27591a.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC27568e interfaceC27568e = PickerActivity.this.presenter;
            if (interfaceC27568e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                interfaceC27568e = null;
            }
            interfaceC27568e.mo68393b(it.mo68503a());
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C27591a.b bVar) {
            m68389a(bVar);
            return Unit.INSTANCE;
        }
    }

    @Override // com.revolut.revolutpay.p123ui.picker.InterfaceC27570g
    /* JADX INFO: renamed from: a */
    public void mo68386a(@NotNull List<? extends InterfaceC46118d> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        C27566c c27566c = this.pickerAdapter;
        if (c27566c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerAdapter");
            c27566c = null;
        }
        c27566c.submitList(items);
    }

    @Override // com.revolut.revolutpay.p123ui.picker.InterfaceC27570g
    /* JADX INFO: renamed from: q */
    public void mo68387q(@NotNull C27572a countryInfo) {
        Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
        C27571h.f56311a.m68406b(new C27567d.a(countryInfo));
        finish();
    }

    /* JADX INFO: renamed from: I */
    public static final void m68385I(PickerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.internal_activity_picker);
        this.presenter = C27527a.f55957a.m68220e();
        View viewFindViewById = findViewById(R$id.internal_picker_searchNavBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.internal_picker_searchNavBar)");
        this.searchNavBar = (SearchNavBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internal_picker_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.internal_picker_recyclerView)");
        this.recyclerView = (RecyclerView) viewFindViewById2;
        SearchNavBar searchNavBar = this.searchNavBar;
        C27566c c27566c = null;
        if (searchNavBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchNavBar");
            searchNavBar = null;
        }
        searchNavBar.setOnNavigationClick(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.picker.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickerActivity.m68385I(this.f56304b, view);
            }
        });
        SearchNavBar searchNavBar2 = this.searchNavBar;
        if (searchNavBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchNavBar");
            searchNavBar2 = null;
        }
        searchNavBar2.setSearchInputListener(new C27562a());
        this.rowWidgetDelegate.m68500e(new C27563b());
        this.pickerAdapter = new C27566c(this.rowWidgetDelegate);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        C27566c c27566c2 = this.pickerAdapter;
        if (c27566c2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerAdapter");
        } else {
            c27566c = c27566c2;
        }
        recyclerView2.setAdapter(c27566c);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        InterfaceC27568e interfaceC27568e = this.presenter;
        if (interfaceC27568e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC27568e = null;
        }
        interfaceC27568e.mo97870a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        InterfaceC27568e interfaceC27568e = this.presenter;
        if (interfaceC27568e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC27568e = null;
        }
        interfaceC27568e.mo97871c();
    }
}
