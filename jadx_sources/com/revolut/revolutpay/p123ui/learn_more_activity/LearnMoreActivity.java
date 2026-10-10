package com.revolut.revolutpay.p123ui.learn_more_activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.R$string;
import com.revolut.revolutpay.R$styleable;
import com.revolut.revolutpay.p122di.C27527a;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import com.revolut.revolutpay.ui_kit.model.C27593c;
import com.revolut.revolutpay.ui_kit.widget.C27599a;
import com.revolut.revolutpay.ui_kit.widget.NavBar;
import com.revolut.revolutpay.ui_kit.widget.RevPayTextView;
import com.revolut.revolutpay.ui_kit.widget.large_action_button.LargeActionButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import pa0.C43428b;
import qa0.C43680e;
import xa0.C46122h;
import xa0.InterfaceC46115a;
import za0.C46743b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/revolut/revolutpay/ui/learn_more_activity/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lxa0/a;", "clause", "v", "(Lxa0/a;)V", "Lcom/revolut/revolutpay/ui_kit/delegate/a$b;", "model", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/revolut/revolutpay/ui_kit/delegate/a$b;)V", "onAttachedToWindow", "onDetachedFromWindow", "", "linkColor", "K", "(Ljava/lang/Integer;)V", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton;", "i", "Lcom/revolut/revolutpay/ui_kit/widget/large_action_button/LargeActionButton;", "button", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "j", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "footer", "Lcom/revolut/revolutpay/ui_kit/widget/NavBar;", "k", "Lcom/revolut/revolutpay/ui_kit/widget/NavBar;", "navbar", "Landroid/widget/LinearLayout;", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/widget/LinearLayout;", "stepsLayout", "Lcom/revolut/revolutpay/ui/learn_more_activity/c;", "m", "Lcom/revolut/revolutpay/ui/learn_more_activity/c;", "presenter", "n", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class LearnMoreActivity extends AppCompatActivity implements InterfaceC27553d {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LargeActionButton button;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public RevPayTextView footer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public NavBar navbar;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public LinearLayout stepsLayout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public InterfaceC27552c presenter;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.learn_more_activity.LearnMoreActivity$a */
    public static final class C27547a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C27547a> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        @NotNull
        private final String f56268a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final String f56269b;

        /* JADX INFO: renamed from: c */
        private final boolean f56270c;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.learn_more_activity.LearnMoreActivity$a$a */
        public static final class a implements Parcelable.Creator<C27547a> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C27547a[] newArray(int i11) {
                return new C27547a[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C27547a createFromParcel(@NotNull Parcel parcel) {
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new C27547a(string, string2, z11);
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C27547a m68325a(C27547a c27547a, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = c27547a.f56268a;
            }
            if ((i11 & 2) != 0) {
                str2 = c27547a.f56269b;
            }
            if ((i11 & 4) != 0) {
                z11 = c27547a.f56270c;
            }
            return c27547a.m68326a(str, str2, z11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27547a)) {
                return false;
            }
            C27547a c27547a = (C27547a) obj;
            return Intrinsics.areEqual(this.f56268a, c27547a.f56268a) && Intrinsics.areEqual(this.f56269b, c27547a.f56269b) && this.f56270c == c27547a.f56270c;
        }

        public C27547a(@NotNull String cashRewardString, @Nullable String str, boolean z11) {
            Intrinsics.checkNotNullParameter(cashRewardString, "cashRewardString");
            this.f56268a = cashRewardString;
            this.f56269b = str;
            this.f56270c = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C27547a m68326a(@NotNull String cashRewardString, @Nullable String str, boolean z11) {
            Intrinsics.checkNotNullParameter(cashRewardString, "cashRewardString");
            return new C27547a(cashRewardString, str, z11);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m68328b() {
            return this.f56269b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m68329c() {
            return this.f56270c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final String m68330d() {
            return this.f56268a;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final String m68331e() {
            return this.f56269b;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m68332f() {
            return this.f56270c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iHashCode = this.f56268a.hashCode() * 31;
            String str = this.f56269b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z11 = this.f56270c;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return iHashCode2 + r11;
        }

        @NotNull
        public String toString() {
            return "CashbackData(cashRewardString=" + this.f56268a + ", minTransactionString=" + this.f56269b + ", needsAccountCreation=" + this.f56270c + ')';
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m68327a() {
            return this.f56268a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i11) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f56268a);
            out.writeString(this.f56269b);
            out.writeInt(this.f56270c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.learn_more_activity.LearnMoreActivity$c */
    public static final class C27549c extends Lambda implements Function1<C46743b, Unit> {
        public C27549c() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m68335a(@NotNull C46743b clickData) {
            Intrinsics.checkNotNullParameter(clickData, "clickData");
            InterfaceC27552c interfaceC27552c = LearnMoreActivity.this.presenter;
            if (interfaceC27552c != null) {
                interfaceC27552c.mo68336b(clickData);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C46743b c46743b) {
            m68335a(c46743b);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m68322K(Integer linkColor) {
        RevPayTextView revPayTextView = this.footer;
        if (revPayTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footer");
            revPayTextView = null;
        }
        revPayTextView.m68545b(new C46122h(R$string.revolut_upsell_widget_learn_more_footer, CollectionsKt.listOf(new C46122h(R$string.revolut_upsell_widget_learn_more_footer_link, null, new C27593c("terms_and_conditions", false, linkColor, null, 10, null), 2, null)), null, 4, null), new C27549c());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(C27527a.f55957a.m68221f());
        super.onCreate(savedInstanceState);
        setContentView(R$layout.internal_revolut_pay_activity_learn_more_layout);
        View viewFindViewById = findViewById(R$id.learn_more_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.learn_more_button)");
        this.button = (LargeActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.learn_more_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.learn_more_footer)");
        this.footer = (RevPayTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internalRevolutPay_learnMoreNavBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.intern…volutPay_learnMoreNavBar)");
        this.navbar = (NavBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.internalRevolutPay_stepsLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.internalRevolutPay_stepsLayout)");
        this.stepsLayout = (LinearLayout) viewFindViewById4;
        C27547a c27547a = (C27547a) getIntent().getParcelableExtra("cashbackData");
        if (c27547a != null) {
            this.presenter = new C27554e(new C43428b(this), new C43680e(), c27547a);
        }
        m68322K(Integer.valueOf(getTheme().obtainStyledAttributes(R$styleable.PromoBannerWidget).getColor(R$styleable.PromoBannerWidget_revolutPay_ColorAccent, Color.parseColor("#0666EB"))));
        NavBar navBar = this.navbar;
        LargeActionButton largeActionButton = null;
        if (navBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navbar");
            navBar = null;
        }
        navBar.setOnBackClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.learn_more_activity.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnMoreActivity.m68320J(this.f56272b, view);
            }
        });
        LargeActionButton largeActionButton2 = this.button;
        if (largeActionButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("button");
        } else {
            largeActionButton = largeActionButton2;
        }
        largeActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.learn_more_activity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnMoreActivity.m68321L(this.f56273b, view);
            }
        });
    }

    @Override // com.revolut.revolutpay.p123ui.learn_more_activity.InterfaceC27553d
    /* JADX INFO: renamed from: v */
    public void mo68324v(@NotNull InterfaceC46115a clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        NavBar navBar = this.navbar;
        if (navBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navbar");
            navBar = null;
        }
        NavBar.m68537b(navBar, clause, null, 2, null);
    }

    /* JADX INFO: renamed from: J */
    public static final void m68320J(LearnMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: renamed from: L */
    public static final void m68321L(LearnMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC27552c interfaceC27552c = this.presenter;
        if (interfaceC27552c != null) {
            interfaceC27552c.mo97870a(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC27552c interfaceC27552c = this.presenter;
        if (interfaceC27552c != null) {
            interfaceC27552c.mo97871c();
        }
    }

    @Override // com.revolut.revolutpay.p123ui.learn_more_activity.InterfaceC27553d
    /* JADX INFO: renamed from: s */
    public void mo68323s(@NotNull C27591a.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        LinearLayout linearLayout = null;
        C27599a c27599a = new C27599a(this, null, 2, null);
        new C27591a.c(c27599a).m68509b(model);
        LinearLayout linearLayout2 = this.stepsLayout;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepsLayout");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.addView(c27599a);
    }
}
