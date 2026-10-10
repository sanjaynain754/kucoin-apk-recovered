package com.sumsub.sns.core.widget.applicantData;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSFileItemView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.form.model.C28807A;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002LMB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010I\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0006\u0010K\u001a\u00020+R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R7\u00100\u001a\u001f\u0012\u0013\u0012\u001102¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020+\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010F\u001a\b\u0012\u0004\u0012\u00020A0\u001c2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020A0\u001c@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"¨\u0006N"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "pickFileLabel", "getPickFileLabel", "()Ljava/lang/CharSequence;", "setPickFileLabel", "(Ljava/lang/CharSequence;)V", "filesView", "Landroid/view/ViewGroup;", "getFilesView", "()Landroid/view/ViewGroup;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "setError", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;", "files", "getFiles", "()Ljava/util/List;", "setFiles", "(Ljava/util/List;)V", "", "showPickFile", "getShowPickFile", "()Z", "setShowPickFile", "(Z)V", "pickFileClickListener", "Lkotlin/Function0;", "", "getPickFileClickListener", "()Lkotlin/jvm/functions/Function0;", "setPickFileClickListener", "(Lkotlin/jvm/functions/Function0;)V", "deleteFileClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fileId", "getDeleteFileClickListener", "()Lkotlin/jvm/functions/Function1;", "setDeleteFileClickListener", "(Lkotlin/jvm/functions/Function1;)V", "pickFileView", "Lcom/sumsub/sns/core/widget/SNSFileItemView;", "pickFileAnchor", "Landroid/view/View;", "getPickFileAnchor$idensic_mobile_sdk_aar_defaultRelease", "()Landroid/view/View;", "state", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "getState", "()Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "setState", "(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;)V", "itemStates", "getItemStates", "setItemStates", "populateViewItems", FirebaseAnalytics.Param.ITEMS, "cleanup", "Attachment", "State", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataFileFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataFileFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,203:1\n233#2,3:204\n1878#3,3:207\n1321#4,2:210\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataFileFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView\n*L\n84#1:204,3\n109#1:207,3\n183#1:210,2\n*E\n"})
public final class SNSApplicantDataFileFieldView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private Function1<? super String, Unit> deleteFileClickListener;

    @NotNull
    private List<Attachment> files;

    @NotNull
    private List<? extends State> itemStates;

    @Nullable
    private Function0<Unit> pickFileClickListener;

    @NotNull
    private CharSequence pickFileLabel;

    @Nullable
    private SNSFileItemView pickFileView;
    private boolean showPickFile;

    @NotNull
    private State state;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;", "", "", "id", Constants.ScionAnalytics.PARAM_LABEL, "imageUrl", "Lcom/sumsub/sns/internal/core/presentation/form/model/A;", "failure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/A;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getImageUrl", "Lcom/sumsub/sns/internal/core/presentation/form/model/A;", "getFailure", "()Lcom/sumsub/sns/internal/core/presentation/form/model/A;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Attachment {

        @Nullable
        private final C28807A failure;

        @NotNull
        private final String id;

        @Nullable
        private final String imageUrl;

        @Nullable
        private final String label;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return Intrinsics.areEqual(this.id, attachment.id) && Intrinsics.areEqual(this.label, attachment.label) && Intrinsics.areEqual(this.imageUrl, attachment.imageUrl) && Intrinsics.areEqual(this.failure, attachment.failure);
        }

        @Nullable
        public final C28807A getFailure() {
            return this.failure;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C28807A c28807a = this.failure;
            return iHashCode3 + (c28807a != null ? c28807a.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Attachment(id=" + this.id + ", label=" + this.label + ", imageUrl=" + this.imageUrl + ", failure=" + this.failure + ")";
        }

        public Attachment(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable C28807A c28807a) {
            this.id = str;
            this.label = str2;
            this.imageUrl = str3;
            this.failure = c28807a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum State {
        DEFAULT,
        LOADING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public SNSApplicantDataFileFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public final void setFiles(@NotNull List<Attachment> list) {
        setError(null);
        populateViewItems(list);
        this.files = list;
    }

    @JvmOverloads
    public SNSApplicantDataFileFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ViewGroup getFilesView() {
        return (ViewGroup) findViewById(R$id.sns_data_file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void populateViewItems$lambda$6$lambda$5$lambda$4(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, Attachment attachment, View view) {
        Function1<? super String, Unit> function1 = sNSApplicantDataFileFieldView.deleteFileClickListener;
        if (function1 != null) {
            function1.invoke(attachment.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void populateViewItems$lambda$8$lambda$7(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, View view) {
        Function0<Unit> function0 = sNSApplicantDataFileFieldView.pickFileClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Nullable
    public final Function1<String, Unit> getDeleteFileClickListener() {
        return this.deleteFileClickListener;
    }

    @NotNull
    public final List<Attachment> getFiles() {
        return this.files;
    }

    @NotNull
    public final List<State> getItemStates() {
        return this.itemStates;
    }

    @NotNull
    public final View getPickFileAnchor$idensic_mobile_sdk_aar_defaultRelease() {
        SNSFileItemView sNSFileItemView = this.pickFileView;
        return sNSFileItemView != null ? sNSFileItemView : this;
    }

    @Nullable
    public final Function0<Unit> getPickFileClickListener() {
        return this.pickFileClickListener;
    }

    @NotNull
    public final CharSequence getPickFileLabel() {
        return this.pickFileLabel;
    }

    public final boolean getShowPickFile() {
        return this.showPickFile;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    public final void setDeleteFileClickListener(@Nullable Function1<? super String, Unit> function1) {
        this.deleteFileClickListener = function1;
    }

    public final void setItemStates(@NotNull List<? extends State> list) {
        this.itemStates = list;
        populateViewItems(this.files);
    }

    public final void setPickFileClickListener(@Nullable Function0<Unit> function0) {
        this.pickFileClickListener = function0;
    }

    public final void setPickFileLabel(@NotNull CharSequence charSequence) {
        Sequence<View> children;
        View next;
        this.pickFileLabel = charSequence;
        ViewGroup filesView = getFilesView();
        if (filesView == null || (children = ViewGroupKt.getChildren(filesView)) == null) {
            return;
        }
        Iterator<View> it = children.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof SNSFileItemView));
        View view = next;
        if (view != null) {
            ((SNSFileItemView) view).setText(charSequence);
        }
    }

    public final void setShowPickFile(boolean z11) {
        this.showPickFile = z11;
        populateViewItems(this.files);
    }

    public final void setState(@NotNull State state) {
        this.state = state;
    }

    @JvmOverloads
    public SNSApplicantDataFileFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    private final void populateViewItems(List<Attachment> items) {
        SNSStepState sNSStepState;
        SNSStepState sNSStepState2;
        String str;
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            cleanup();
            filesView.removeAllViews();
            this.pickFileView = null;
            Context context = filesView.getContext();
            if (context != null) {
                int i11 = 0;
                for (Object obj : items) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final Attachment attachment = (Attachment) obj;
                    SNSFileItemView sNSFileItemView = new SNSFileItemView(context, null, 0, 0, 14, null);
                    sNSFileItemView.setText(attachment.getLabel());
                    sNSFileItemView.loadImage(attachment.getImageUrl());
                    C28468k0 c28468k0 = C28468k0.f57983a;
                    sNSFileItemView.setStartIcon(c28468k0.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.IMAGE.getImageName()));
                    if (((State) CollectionsKt.getOrNull(this.itemStates, i11)) == State.LOADING) {
                        sNSFileItemView.setProgress(0, true);
                    } else {
                        Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.DELETE.getImageName());
                        if (drawableOnResolveIcon == null) {
                            drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.BIN.getImageName());
                        }
                        sNSFileItemView.setEndIcon(drawableOnResolveIcon);
                        sNSFileItemView.setEndIconClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.applicantData.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SNSApplicantDataFileFieldView.populateViewItems$lambda$6$lambda$5$lambda$4(this.f57543b, attachment, view);
                            }
                        });
                    }
                    CharSequence error = getError();
                    if ((error != null && error.length() != 0) || attachment.getFailure() != null) {
                        sNSStepState2 = SNSStepState.REJECTED;
                    } else {
                        sNSStepState2 = SNSStepState.INIT;
                    }
                    SNSStepViewExtensionsKt.setSnsStepState(sNSFileItemView, sNSStepState2);
                    C28807A failure = attachment.getFailure();
                    if (failure != null) {
                        str = failure.f58577b;
                    } else {
                        str = null;
                    }
                    sNSFileItemView.setError(str);
                    filesView.addView(sNSFileItemView);
                    i11 = i12;
                }
                if (this.showPickFile && this.state == State.DEFAULT) {
                    SNSFileItemView sNSFileItemView2 = new SNSFileItemView(context, null, 0, 0, 14, null);
                    sNSFileItemView2.setText(this.pickFileLabel);
                    sNSFileItemView2.loadImage(null);
                    sNSFileItemView2.setStartIcon(C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.ATTACHMENT.getImageName()));
                    sNSFileItemView2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.applicantData.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SNSApplicantDataFileFieldView.populateViewItems$lambda$8$lambda$7(this.f57545b, view);
                        }
                    });
                    CharSequence error2 = getError();
                    if (error2 != null && error2.length() != 0) {
                        sNSStepState = SNSStepState.REJECTED;
                    } else {
                        sNSStepState = SNSStepState.INIT;
                    }
                    SNSStepViewExtensionsKt.setSnsStepState(sNSFileItemView2, sNSStepState);
                    filesView.addView(sNSFileItemView2);
                    this.pickFileView = sNSFileItemView2;
                }
                if (this.state == State.LOADING) {
                    SNSProgressBarView sNSProgressBarView = new SNSProgressBarView(context, null, R.attr.progressBarStyle);
                    sNSProgressBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_medium)));
                    filesView.addView(sNSProgressBarView);
                }
            }
        }
    }

    public final void cleanup() {
        Sequence<View> children;
        ViewGroup filesView = getFilesView();
        if (filesView != null && (children = ViewGroupKt.getChildren(filesView)) != null) {
            for (View view : children) {
                if (view instanceof SNSFileItemView) {
                    ((SNSFileItemView) view).loadImage(null);
                }
            }
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null && (text = tvLabel$idensic_mobile_sdk_aar_defaultRelease.getText()) != null) {
            return text;
        }
        return "";
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(@Nullable CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            AbstractC28458h.m69341a(tvError, charSequence);
        }
        populateViewItems(this.files);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28458h.m69341a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, charSequence);
        }
    }

    public /* synthetic */ SNSApplicantDataFileFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFileFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFileFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataFileFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.pickFileLabel = "";
        this.files = CollectionsKt.emptyList();
        this.showPickFile = true;
        this.state = State.DEFAULT;
        this.itemStates = CollectionsKt.emptyList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataFileFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataFileFieldView_sns_applicantDataFileFieldLayout, R$layout.sns_layout_applicant_data_file_field_view), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        populateViewItems(CollectionsKt.emptyList());
        onInitializationFinished();
    }
}
