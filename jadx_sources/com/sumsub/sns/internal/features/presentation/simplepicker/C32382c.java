package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28323C;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30815c;
import java.util.ArrayList;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/simplepicker/c;", "Lcom/sumsub/sns/internal/features/presentation/common/c;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/simplepicker/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSimpleBottomSheetPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSimpleBottomSheetPicker.kt\ncom/sumsub/sns/internal/features/presentation/simplepicker/SNSSimpleBottomSheetPicker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,99:1\n4135#2,11:100\n49#3:111\n65#3,16:112\n93#3,3:128\n*S KotlinDebug\n*F\n+ 1 SNSSimpleBottomSheetPicker.kt\ncom/sumsub/sns/internal/features/presentation/simplepicker/SNSSimpleBottomSheetPicker\n*L\n21#1:100,11\n52#1:111\n52#1:112,16\n52#1:128,3\n*E\n"})
public final class C32382c extends AbstractC30815c {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f65965U = 0;

    /* JADX INFO: renamed from: b */
    public InterfaceC32380a f65966b;

    /* JADX INFO: renamed from: c */
    public Function0 f65967c;

    /* JADX INFO: renamed from: a */
    public static final void m71108a(C32382c c32382c, View view) {
        c32382c.dismiss();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71107a(C32382c c32382c, C32387h c32387h) {
        InterfaceC32380a interfaceC32380a = c32382c.f65966b;
        if (interfaceC32380a != null) {
            interfaceC32380a.mo69244a(c32387h);
        }
        c32382c.dismiss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Function0 function0 = this.f65967c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && this.f65966b == null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function0 function0 = this.f65967c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? EmptyList;
        super.onViewCreated(view, bundle);
        C28323C c28323c = this.f62250a;
        if (c28323c == null) {
            return;
        }
        SNSToolbarView sNSToolbarView = c28323c.f57634e;
        Context contextRequireContext = requireContext();
        Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(contextRequireContext, SNSIconHandler.SNSCommonIcons.CLOSE.getImageName());
        if (drawableOnResolveIcon == null) {
            drawableOnResolveIcon = ResourcesCompat.getDrawable(contextRequireContext.getResources(), R$drawable.sns_ic_close, contextRequireContext.getTheme());
        }
        sNSToolbarView.setCloseButtonDrawable(drawableOnResolveIcon);
        sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.simplepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C32382c.m71108a(this.f65977b, view2);
            }
        });
        SNSTextInputLayout sNSTextInputLayout = c28323c.f57632c;
        m70481a(sNSTextInputLayout);
        Parcelable[] parcelableArray = requireArguments().getParcelableArray("extra_items");
        if (parcelableArray != null) {
            EmptyList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof C32387h) {
                    EmptyList.add(parcelable);
                }
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        C32384e c32384e = new C32384e(EmptyList, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.simplepicker.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32382c.m71107a(this.f65978b, (C32387h) obj);
            }
        });
        EditText editText = sNSTextInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C32381b(c32384e, sNSTextInputLayout));
        }
        RecyclerView recyclerView = c28323c.f57633d;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        AbstractC30815c.m70478a(recyclerView);
        recyclerView.setAdapter(c32384e);
        c28323c.f57631b.setVisibility(8);
    }
}
