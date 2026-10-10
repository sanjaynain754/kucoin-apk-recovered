package com.sumsub.sns.core.widget.applicantData;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.presentation.simplepicker.C32382c;
import com.sumsub.sns.internal.features.presentation.simplepicker.C32387h;
import com.sumsub.sns.internal.features.presentation.simplepicker.InterfaceC32380a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rR\"\u0010\u0015\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0013R6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R?\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u0010.\u001a\u0004\u0018\u00010\u001b2\b\u0010-\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "showDialog", "()V", "showAlertDialog", "showBottomSheet", "", "enabled", "setEnabled", "(Z)V", "openSelector", "setEndSelectionOnSetValue", "Z", "getSetEndSelectionOnSetValue", "()Z", "setSetEndSelectionOnSetValue", "", "Lcom/sumsub/sns/internal/features/data/model/common/z;", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "onSelectedCallback", "Lkotlin/jvm/functions/Function1;", "getOnSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "aValue", "selectedItem", "Lcom/sumsub/sns/internal/features/data/model/common/z;", "getSelectedItem", "()Lcom/sumsub/sns/internal/features/data/model/common/z;", "setSelectedItem", "(Lcom/sumsub/sns/internal/features/data/model/common/z;)V", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nSNSApplicantDataSelectionFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataSelectionFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1563#2:132\n1634#2,3:133\n1208#2,2:136\n1236#2,4:138\n1563#2:142\n1634#2,3:143\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataSelectionFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView\n*L\n92#1:132\n92#1:133,3\n110#1:136,2\n110#1:138,4\n111#1:142\n111#1:143,3\n*E\n"})
public final class SNSApplicantDataSelectionFieldView extends SNSApplicantDataFieldView implements SNSApplicantDataBaseFieldView.Selectable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private Drawable endIcon;

    @NotNull
    private List<C29724z> items;

    @Nullable
    private Function1<? super C29724z, Unit> onSelectedCallback;

    @Nullable
    private C29724z selectedItem;
    private boolean setEndSelectionOnSetValue;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView$Companion;", "", "<init>", "()V", "BOTTOM_SHEET_ITEMS_THRESHOLD", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public SNSApplicantDataSelectionFieldView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSApplicantDataSelectionFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void showAlertDialog() {
        SNSAlertDialogBuilder sNSAlertDialogBuilder = new SNSAlertDialogBuilder(getContext());
        List<C29724z> list = this.items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29724z) it.next()).f59792b);
        }
        sNSAlertDialogBuilder.setStyledItems(arrayList, new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.core.widget.applicantData.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SNSApplicantDataSelectionFieldView.showAlertDialog$lambda$3(this.f57557b, dialogInterface, i11);
            }
        }).setCancelable(true).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sumsub.sns.core.widget.applicantData.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SNSApplicantDataSelectionFieldView.showAlertDialog$lambda$4(this.f57558b, dialogInterface);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheet$lambda$7(Map map, SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, C32387h c32387h) {
        C29724z c29724z = (C29724z) map.get(c32387h.f65972a);
        if (c29724z == null) {
            return;
        }
        sNSApplicantDataSelectionFieldView.setValue(c29724z.f59792b);
        sNSApplicantDataSelectionFieldView.setSelectedItem(c29724z);
        Function1<? super C29724z, Unit> function1 = sNSApplicantDataSelectionFieldView.onSelectedCallback;
        if (function1 != null) {
            function1.invoke(c29724z);
        }
    }

    private final void showDialog() {
        if (this.items.size() >= 10) {
            showBottomSheet();
        } else {
            showAlertDialog();
        }
    }

    @NotNull
    public final List<C29724z> getItems() {
        return this.items;
    }

    @Nullable
    public final Function1<C29724z, Unit> getOnSelectedCallback() {
        return this.onSelectedCallback;
    }

    @Nullable
    public final C29724z getSelectedItem() {
        return this.selectedItem;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public boolean getSetEndSelectionOnSetValue() {
        return this.setEndSelectionOnSetValue;
    }

    public final void setItems(@NotNull List<C29724z> list) {
        if (Intrinsics.areEqual(this.items, list)) {
            return;
        }
        this.items = list;
        if (list.isEmpty()) {
            enableInput();
        } else {
            disableInput();
        }
    }

    public final void setOnSelectedCallback(@Nullable Function1<? super C29724z, Unit> function1) {
        this.onSelectedCallback = function1;
    }

    public final void setSelectedItem(@Nullable C29724z c29724z) {
        String str;
        this.selectedItem = c29724z;
        if (c29724z == null || (str = c29724z.f59792b) == null) {
            str = "";
        }
        setValue(str);
    }

    public void setSetEndSelectionOnSetValue(boolean z11) {
        this.setEndSelectionOnSetValue = z11;
    }

    public /* synthetic */ SNSApplicantDataSelectionFieldView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialog$lambda$3(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        sNSApplicantDataSelectionFieldView.setValue(sNSApplicantDataSelectionFieldView.items.get(i11).f59792b);
        sNSApplicantDataSelectionFieldView.setSelectedItem(sNSApplicantDataSelectionFieldView.items.get(i11));
        Function1<? super C29724z, Unit> function1 = sNSApplicantDataSelectionFieldView.onSelectedCallback;
        if (function1 != null) {
            function1.invoke(sNSApplicantDataSelectionFieldView.items.get(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialog$lambda$4(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, DialogInterface dialogInterface) {
        EditText editText;
        TextInputLayout inputLayout = sNSApplicantDataSelectionFieldView.getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.clearFocus();
        }
    }

    private final void showBottomSheet() {
        FragmentManager supportFragmentManager;
        FragmentActivity fragmentActivityM69330a = AbstractC28458h.m69330a(getContext());
        if (fragmentActivityM69330a != null && (supportFragmentManager = fragmentActivityM69330a.getSupportFragmentManager()) != null && supportFragmentManager.findFragmentByTag("SNSSimpleBottomSheetPicker") == null) {
            List<C29724z> list = this.items;
            final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((C29724z) obj).f59791a, obj);
            }
            List<C29724z> list2 = this.items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (C29724z c29724z : list2) {
                arrayList.add(new C32387h(c29724z.f59791a, c29724z.f59792b));
            }
            int i11 = C32382c.f65965U;
            InterfaceC32380a interfaceC32380a = new InterfaceC32380a() { // from class: com.sumsub.sns.core.widget.applicantData.s
                @Override // com.sumsub.sns.internal.features.presentation.simplepicker.InterfaceC32380a
                /* JADX INFO: renamed from: a */
                public final void mo69244a(C32387h c32387h) {
                    SNSApplicantDataSelectionFieldView.showBottomSheet$lambda$7(linkedHashMap, this, c32387h);
                }
            };
            Function0 function0 = new Function0() { // from class: com.sumsub.sns.core.widget.applicantData.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SNSApplicantDataSelectionFieldView.showBottomSheet$lambda$8(this.f57561b);
                }
            };
            C32382c c32382c = new C32382c();
            c32382c.f65966b = interfaceC32380a;
            c32382c.f65967c = function0;
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("extra_items", (Parcelable[]) arrayList.toArray(new C32387h[0]));
            c32382c.setArguments(bundle);
            c32382c.show(supportFragmentManager, "SNSSimpleBottomSheetPicker");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBottomSheet$lambda$8(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView) {
        EditText editText;
        TextInputLayout inputLayout = sNSApplicantDataSelectionFieldView.getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.clearFocus();
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        if (isEnabled() && !this.items.isEmpty()) {
            showDialog();
        }
    }

    @Override // com.sumsub.sns.core.widget.SNSApplicantDataFieldView, android.view.View
    public void setEnabled(boolean enabled) {
        Drawable drawable;
        int i11;
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            if (enabled) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            inputLayout.setEndIconMode(i11);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            if (enabled) {
                drawable = this.endIcon;
            } else {
                drawable = null;
            }
            inputLayout2.setEndIconDrawable(drawable);
        }
    }

    @JvmOverloads
    public SNSApplicantDataSelectionFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        EditText editText;
        super(context, attributeSet, i11, 0, 8, null);
        this.items = new ArrayList();
        final GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                this.this$0.openSelector();
                return super.onSingleTapUp(e11);
            }
        });
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.sumsub.sns.core.widget.applicantData.p
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SNSApplicantDataSelectionFieldView._init_$lambda$0(gestureDetector, view, motionEvent);
                }
            });
        }
        String imageName = SNSIconHandler.SNSCommonIcons.MORE.getImageName();
        C28468k0 c28468k0 = C28468k0.f57983a;
        Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(context, imageName);
        this.endIcon = drawableOnResolveIcon == null ? c28468k0.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName()) : drawableOnResolveIcon;
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            inputLayout2.setEndIconMode(-1);
        }
        TextInputLayout inputLayout3 = getInputLayout();
        if (inputLayout3 != null) {
            inputLayout3.setEndIconDrawable(this.endIcon);
        }
        onInitializationFinished();
    }
}
