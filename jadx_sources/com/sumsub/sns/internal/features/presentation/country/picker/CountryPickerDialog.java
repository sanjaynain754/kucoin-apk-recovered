package com.sumsub.sns.internal.features.presentation.country.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import com.sumsub.sns.databinding.C28323C;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.NavigationAction;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30815c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;", "Lcom/sumsub/sns/internal/features/presentation/common/c;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/country/picker/r", "com/sumsub/sns/internal/features/presentation/country/picker/B", "com/sumsub/sns/internal/features/presentation/country/picker/o", "SelectionMode", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountryPickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPickerDialog.kt\ncom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,281:1\n4135#2,11:282\n4135#2,11:293\n49#3:304\n65#3,16:305\n93#3,3:321\n*S KotlinDebug\n*F\n+ 1 CountryPickerDialog.kt\ncom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog\n*L\n48#1:282,11\n53#1:293,11\n98#1:304\n98#1:305,16\n98#1:321,3\n*E\n"})
public final class CountryPickerDialog extends AbstractC30815c {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f62384U = 0;

    /* JADX INFO: renamed from: b */
    public SNSApplicantDataMultipleCountrySelectionFieldView.C282561 f62385b;

    /* JADX INFO: renamed from: c */
    public InterfaceC30893e f62386c;

    /* JADX INFO: renamed from: d */
    public InterfaceC30906r f62387d;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "MULTI", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SelectionMode implements Parcelable {
        SINGLE,
        MULTI;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static final Parcelable.Creator<SelectionMode> CREATOR = new C30904p();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public static EnumEntries<SelectionMode> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.writeString(name());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70508b(CountryPickerDialog countryPickerDialog, View view) {
        InterfaceC30906r interfaceC30906r = countryPickerDialog.f62387d;
        if (interfaceC30906r == null) {
            interfaceC30906r = null;
        }
        interfaceC30906r.mo70506b();
    }

    /* JADX INFO: renamed from: a */
    public static final void m70507a(CountryPickerDialog countryPickerDialog, View view) {
        countryPickerDialog.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        SNSApplicantDataMultipleCountrySelectionFieldView.C282561 c282561 = this.f62385b;
        if (c282561 != null) {
            c282561.onDismiss();
        }
        InterfaceC30893e interfaceC30893e = this.f62386c;
        if (interfaceC30893e != null) {
            interfaceC30893e.onDismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC30906r c30880b;
        super.onCreate(bundle);
        if (bundle != null && this.f62386c == null && this.f62385b == null) {
            dismiss();
            return;
        }
        int i11 = AbstractC30881C.f62383a[((SelectionMode) requireArguments().getParcelable("extra_selection_mode")).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                c30880b = new C30903o(this, this.f62385b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c30880b = new C30880B(this, this.f62386c);
        }
        this.f62387d = c30880b;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        SNSApplicantDataMultipleCountrySelectionFieldView.C282561 c282561 = this.f62385b;
        if (c282561 != null) {
            c282561.onDismiss();
        }
        InterfaceC30893e interfaceC30893e = this.f62386c;
        if (interfaceC30893e != null) {
            interfaceC30893e.onDismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? EmptyList;
        ?? EmptyList2;
        ?? EmptyList3;
        Fragment fragmentPrevious;
        AbstractC28133l abstractC28133l;
        String f66531c;
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
        sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.country.picker.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountryPickerDialog.m70507a(this.f62398b, view2);
            }
        });
        SNSTextInputLayout sNSTextInputLayout = c28323c.f57632c;
        m70481a(sNSTextInputLayout);
        Parcelable[] parcelableArray = requireArguments().getParcelableArray("extra_preselected_items");
        if (parcelableArray != null) {
            EmptyList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof C30877b) {
                    EmptyList.add(parcelable);
                }
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        Parcelable[] parcelableArray2 = requireArguments().getParcelableArray("extra_items");
        if (parcelableArray2 != null) {
            EmptyList2 = new ArrayList();
            for (Parcelable parcelable2 : parcelableArray2) {
                if (parcelable2 instanceof C30877b) {
                    EmptyList2.add(parcelable2);
                }
            }
        } else {
            EmptyList2 = CollectionsKt.emptyList();
        }
        Set setIntersect = CollectionsKt.intersect(EmptyList, CollectionsKt.toSet(EmptyList2));
        Parcelable[] parcelableArray3 = requireArguments().getParcelableArray("extra_items");
        if (parcelableArray3 != null) {
            EmptyList3 = new ArrayList();
            for (Parcelable parcelable3 : parcelableArray3) {
                if (parcelable3 instanceof C30877b) {
                    EmptyList3.add(parcelable3);
                }
            }
        } else {
            EmptyList3 = CollectionsKt.emptyList();
        }
        boolean z11 = requireArguments().getBoolean("extra_sort", true);
        InterfaceC30906r interfaceC30906r = this.f62387d;
        if (interfaceC30906r == null) {
            interfaceC30906r = null;
        }
        C30891d c30891d = new C30891d(EmptyList3, setIntersect, z11, interfaceC30906r.getConfig().f62437a);
        InterfaceC30906r interfaceC30906r2 = this.f62387d;
        if (interfaceC30906r2 == null) {
            interfaceC30906r2 = null;
        }
        interfaceC30906r2.mo70505a(c30891d);
        EditText editText = sNSTextInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C30882D(c30891d, sNSTextInputLayout));
        }
        RecyclerView recyclerView = c28323c.f57633d;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        AbstractC30815c.m70478a(recyclerView);
        recyclerView.setAdapter(c30891d);
        SNSPrimaryButton sNSPrimaryButton = c28323c.f57631b;
        sNSPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.country.picker.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountryPickerDialog.m70508b(this.f62400b, view2);
            }
        });
        InterfaceC30906r interfaceC30906r3 = this.f62387d;
        if (interfaceC30906r3 == null) {
            interfaceC30906r3 = null;
        }
        AbstractC28421U.m69305b(interfaceC30906r3.mo70504a(), getViewLifecycleOwner(), new C30883E(sNSPrimaryButton, null));
        List<Fragment> fragments = getParentFragmentManager().getFragments();
        ListIterator<Fragment> listIterator = fragments.listIterator(fragments.size());
        do {
            if (listIterator.hasPrevious()) {
                fragmentPrevious = listIterator.previous();
            } else {
                fragmentPrevious = null;
                break;
            }
        } while (!(fragmentPrevious instanceof AbstractC28133l));
        if (fragmentPrevious instanceof AbstractC28133l) {
            abstractC28133l = (AbstractC28133l) fragmentPrevious;
        } else {
            abstractC28133l = null;
        }
        if (abstractC28133l != null) {
            f66531c = abstractC28133l.getF66531c();
        } else {
            f66531c = null;
        }
        if (f66531c == null) {
            f66531c = "TYPE_UNKNOWN";
        }
        C28368g c28368gM69265a = new C28368g().m69265a(Screen.CountriesScreen, f66531c, null);
        c28368gM69265a.f57846b.add(NavigationAction.Opened);
        c28368gM69265a.f57847c = MapsKt.emptyMap();
        c28368gM69265a.m69267a(false);
    }
}
