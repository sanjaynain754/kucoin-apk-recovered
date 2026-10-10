package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.databinding.C28332L;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32574b extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a */
    public static final C32574b f66438a = new C32574b();

    public C32574b() {
        super(2, C28332L.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateDocumentsBinding;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.sns_sumsubid_state_documents, viewGroup);
        int i11 = R$id.sns_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewGroup, i11);
        if (recyclerView != null) {
            i11 = R$id.sns_text;
            SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewGroup, i11);
            if (sNSCaptionTextView != null) {
                return new C28332L(viewGroup, recyclerView, sNSCaptionTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i11)));
    }
}
