package com.revolut.revolutpay.ui_kit.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wa0.C45784e;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/revolut/revolutpay/ui_kit/widget/SearchNavBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "onClick", "", "setOnNavigationClick", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSearchInputListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/EditText;", "n", "Landroid/widget/EditText;", "searchEditText", "Landroid/view/View;", "o", "Landroid/view/View;", "searchIcon", "p", "navigationIcon", "q", "Lkotlin/jvm/functions/Function1;", "searchInputListener", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class SearchNavBar extends ConstraintLayout {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final EditText searchEditText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final View searchIcon;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final View navigationIcon;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> searchInputListener;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.SearchNavBar$a */
    public static final class C27598a implements TextWatcher {
        public C27598a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence s11, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(s11, "s");
            Function1 function1 = SearchNavBar.this.searchInputListener;
            if (function1 != null) {
                function1.invoke(s11.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SearchNavBar(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchNavBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_search_nav_bar, this);
        View viewFindViewById = findViewById(R$id.internal_search_nav_bar_edittext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.intern…_search_nav_bar_edittext)");
        EditText editText = (EditText) viewFindViewById;
        this.searchEditText = editText;
        View viewFindViewById2 = findViewById(R$id.internal_search_nav_bar_search_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.intern…arch_nav_bar_search_icon)");
        this.searchIcon = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internal_search_nav_bar_navigation_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.intern…_nav_bar_navigation_icon)");
        this.navigationIcon = viewFindViewById3;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui_kit.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNavBar.m68548c(this.f56412b, view);
            }
        });
        editText.addTextChangedListener(new C27598a());
    }

    public final void setSearchInputListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.searchInputListener = listener;
    }

    public /* synthetic */ SearchNavBar(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public static final void m68548c(SearchNavBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.searchEditText.requestFocus();
        C45784e.m101112c(this$0.searchEditText);
    }

    public final void setOnNavigationClick(@NotNull View.OnClickListener onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.navigationIcon.setOnClickListener(onClick);
    }
}
