package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.messaging.Constants;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29325b0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "Lcom/sumsub/sns/core/presentation/base/s;", "<init>", "()V", "", "getHasVideo", "()Z", "hasVideo", "isError", "isVideoCall", "isPreview", "isWaiting", "isReconnecting", "isLoading", "Loading", "EnterPhone", "LanguageSelection", "Permissions", "VideoStepState", "ErrorState", "ConfirmExitDialog", "StateWithVideo", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$EnterPhone;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Loading;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Permissions;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSViewState.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public abstract class SNSViewState implements InterfaceC28147s {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;", "", "message", "", "buttonPositive", "buttonNegative", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getMessage", "()Ljava/lang/CharSequence;", "getButtonPositive", "getButtonNegative", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class ConfirmExitDialog {

        @Nullable
        private final CharSequence buttonNegative;

        @Nullable
        private final CharSequence buttonPositive;

        @Nullable
        private final CharSequence message;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmExitDialog)) {
                return false;
            }
            ConfirmExitDialog confirmExitDialog = (ConfirmExitDialog) other;
            return Intrinsics.areEqual(this.message, confirmExitDialog.message) && Intrinsics.areEqual(this.buttonPositive, confirmExitDialog.buttonPositive) && Intrinsics.areEqual(this.buttonNegative, confirmExitDialog.buttonNegative);
        }

        public static /* synthetic */ ConfirmExitDialog copy$default(ConfirmExitDialog confirmExitDialog, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = confirmExitDialog.message;
            }
            if ((i11 & 2) != 0) {
                charSequence2 = confirmExitDialog.buttonPositive;
            }
            if ((i11 & 4) != 0) {
                charSequence3 = confirmExitDialog.buttonNegative;
            }
            return confirmExitDialog.copy(charSequence, charSequence2, charSequence3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getButtonPositive() {
            return this.buttonPositive;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getButtonNegative() {
            return this.buttonNegative;
        }

        @NotNull
        public final ConfirmExitDialog copy(@Nullable CharSequence message, @Nullable CharSequence buttonPositive, @Nullable CharSequence buttonNegative) {
            return new ConfirmExitDialog(message, buttonPositive, buttonNegative);
        }

        @Nullable
        public final CharSequence getButtonNegative() {
            return this.buttonNegative;
        }

        @Nullable
        public final CharSequence getButtonPositive() {
            return this.buttonPositive;
        }

        @Nullable
        public final CharSequence getMessage() {
            return this.message;
        }

        public int hashCode() {
            CharSequence charSequence = this.message;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.buttonPositive;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonNegative;
            return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConfirmExitDialog(message=" + ((Object) this.message) + ", buttonPositive=" + ((Object) this.buttonPositive) + ", buttonNegative=" + ((Object) this.buttonNegative) + ")";
        }

        public ConfirmExitDialog(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3) {
            this.message = charSequence;
            this.buttonPositive = charSequence2;
            this.buttonNegative = charSequence3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$EnterPhone;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class EnterPhone extends SNSViewState implements Parcelable {

        @NotNull
        public static final EnterPhone INSTANCE = new EnterPhone();

        @NotNull
        public static final Parcelable.Creator<EnterPhone> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<EnterPhone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnterPhone createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EnterPhone.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnterPhone[] newArray(int i11) {
                return new EnterPhone[i11];
            }
        }

        private EnterPhone() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof EnterPhone);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @NotNull
        public String toString() {
            return "EnterPhone";
        }

        public int hashCode() {
            return 643732675;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ErrorState;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "UPLOAD_ERROR", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum ErrorState {
        GENERAL,
        UPLOAD_ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ErrorState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J8\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0015¨\u0006'"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "Landroid/os/Parcelable;", "", "selectedLanguage", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/b0;", LanguageSelectionViewModel.ARG_LANGS, "idDocSetType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectedLanguage", "Ljava/util/List;", "getLanguages", "getIdDocSetType", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class LanguageSelection extends SNSViewState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LanguageSelection> CREATOR = new Creator();

        @Nullable
        private final String idDocSetType;

        @NotNull
        private final List<C29325b0> languages;

        @Nullable
        private final String selectedLanguage;

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<LanguageSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LanguageSelection createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(C29325b0.CREATOR.createFromParcel(parcel));
                }
                return new LanguageSelection(string, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LanguageSelection[] newArray(int i11) {
                return new LanguageSelection[i11];
            }
        }

        public LanguageSelection(@Nullable String str, @NotNull List<C29325b0> list, @Nullable String str2) {
            super(null);
            this.selectedLanguage = str;
            this.languages = list;
            this.idDocSetType = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LanguageSelection)) {
                return false;
            }
            LanguageSelection languageSelection = (LanguageSelection) other;
            return Intrinsics.areEqual(this.selectedLanguage, languageSelection.selectedLanguage) && Intrinsics.areEqual(this.languages, languageSelection.languages) && Intrinsics.areEqual(this.idDocSetType, languageSelection.idDocSetType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LanguageSelection copy$default(LanguageSelection languageSelection, String str, List list, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = languageSelection.selectedLanguage;
            }
            if ((i11 & 2) != 0) {
                list = languageSelection.languages;
            }
            if ((i11 & 4) != 0) {
                str2 = languageSelection.idDocSetType;
            }
            return languageSelection.copy(str, list, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelectedLanguage() {
            return this.selectedLanguage;
        }

        @NotNull
        public final List<C29325b0> component2() {
            return this.languages;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getIdDocSetType() {
            return this.idDocSetType;
        }

        @NotNull
        public final LanguageSelection copy(@Nullable String selectedLanguage, @NotNull List<C29325b0> languages, @Nullable String idDocSetType) {
            return new LanguageSelection(selectedLanguage, languages, idDocSetType);
        }

        @Nullable
        public final String getIdDocSetType() {
            return this.idDocSetType;
        }

        @NotNull
        public final List<C29325b0> getLanguages() {
            return this.languages;
        }

        @Nullable
        public final String getSelectedLanguage() {
            return this.selectedLanguage;
        }

        public int hashCode() {
            String str = this.selectedLanguage;
            int iHashCode = (this.languages.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            String str2 = this.idDocSetType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LanguageSelection(selectedLanguage=" + this.selectedLanguage + ", languages=" + this.languages + ", idDocSetType=" + this.idDocSetType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.writeString(this.selectedLanguage);
            List<C29325b0> list = this.languages;
            dest.writeInt(list.size());
            Iterator<C29325b0> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.idDocSetType);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Loading;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Loading extends SNSViewState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$Permissions;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Permissions extends SNSViewState {

        @NotNull
        public static final Permissions INSTANCE = new Permissions();

        private Permissions() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Permissions);
        }

        @NotNull
        public String toString() {
            return "Permissions";
        }

        public int hashCode() {
            return -345172265;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001Bý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J\b\u0010b\u001a\u00020cH\u0016J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010r\u001a\u00020\u0007HÆ\u0003J\t\u0010s\u001a\u00020\u0007HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010&HÆ\u0003J\u009d\u0002\u0010|\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&HÆ\u0001J\u0013\u0010}\u001a\u00020\u00072\b\u0010~\u001a\u0004\u0018\u00010\u007fHÖ\u0003J\u000b\u0010\u0080\u0001\u001a\u00030\u0081\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00106\"\u0004\b?\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0013\u0010 \u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006\u0083\u0001"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "state", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$VideoStepState;", "errorState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ErrorState;", "showProgress", "", "showLocalVideo", "showBottomButton", "bottomButtonEnabled", "showSwitchCamera", "bottomSheetTitle", "", "bottomSheetText", "bottomButtonText", "bottomButtonAction", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;", "bottomSecondaryButtonText", "bottomTertiaryButtonText", "bottomWarning", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSWarning;", "showBottomSheet", "showRecordTimer", "remoteVideoState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;", "message", "documents", "", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem;", "previewImage", "Landroid/graphics/Bitmap;", "previousState", "analyticsState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "confirmExitDialog", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;", "language", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;", "<init>", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$VideoStepState;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ErrorState;ZZZZZLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSWarning;ZZLcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;Ljava/lang/CharSequence;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;)V", "getState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$VideoStepState;", "getErrorState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ErrorState;", "getShowProgress", "()Z", "setShowProgress", "(Z)V", "getShowLocalVideo", "getShowBottomButton", "getBottomButtonEnabled", "getShowSwitchCamera", "getBottomSheetTitle", "()Ljava/lang/CharSequence;", "setBottomSheetTitle", "(Ljava/lang/CharSequence;)V", "getBottomSheetText", "setBottomSheetText", "getBottomButtonText", "getBottomButtonAction", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;", "getBottomSecondaryButtonText", "setBottomSecondaryButtonText", "getBottomTertiaryButtonText", "setBottomTertiaryButtonText", "getBottomWarning", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSWarning;", "getShowBottomSheet", "getShowRecordTimer", "getRemoteVideoState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;", "setRemoteVideoState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;)V", "getMessage", "setMessage", "getDocuments", "()Ljava/util/List;", "setDocuments", "(Ljava/util/List;)V", "getPreviewImage", "()Landroid/graphics/Bitmap;", "setPreviewImage", "(Landroid/graphics/Bitmap;)V", "getPreviousState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "getAnalyticsState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "setAnalyticsState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;)V", "getConfirmExitDialog", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;", "setConfirmExitDialog", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;)V", "getLanguage", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;", "setLanguage", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;)V", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "", "hashCode", "", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class StateWithVideo extends SNSViewState {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private AnalyticsCallState analyticsState;

        @Nullable
        private final ButtonAction bottomButtonAction;
        private final boolean bottomButtonEnabled;

        @Nullable
        private final CharSequence bottomButtonText;

        @Nullable
        private CharSequence bottomSecondaryButtonText;

        @Nullable
        private CharSequence bottomSheetText;

        @Nullable
        private CharSequence bottomSheetTitle;

        @Nullable
        private CharSequence bottomTertiaryButtonText;

        @Nullable
        private final SNSWarning bottomWarning;

        @Nullable
        private ConfirmExitDialog confirmExitDialog;

        @NotNull
        private List<SNSStepViewItem> documents;

        @Nullable
        private final ErrorState errorState;

        @Nullable
        private Companion.LanguageState language;

        @Nullable
        private CharSequence message;

        @Nullable
        private Bitmap previewImage;

        @Nullable
        private final StateWithVideo previousState;

        @Nullable
        private RemoteVideoState remoteVideoState;
        private final boolean showBottomButton;
        private final boolean showBottomSheet;
        private final boolean showLocalVideo;
        private boolean showProgress;
        private final boolean showRecordTimer;
        private final boolean showSwitchCamera;

        @NotNull
        private final VideoStepState state;

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ0\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J0\u0010\u0016\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010\u0019\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015J>\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015J4\u0010\"\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006'"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion;", "", "<init>", "()V", "preview", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "bottomButtonText", "", "title", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "language", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;", "startVideoCallEnabled", "", "waitingForOperator", "message", "bottomSheetTitle", "documents", "", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem;", "confirmExitDialog", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ConfirmExitDialog;", "videoCall", "remoteVideoState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;", "readyForPhoto", "bottomSheetText", "errorWithButton", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$ErrorState;", "text", "primaryButtonText", "primaryButtonAction", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/ButtonAction;", "previewPhoto", "secondaryButtonText", "previewImage", "Landroid/graphics/Bitmap;", "LanguageState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
            @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo$Companion$LanguageState;", "", "title", "", "language", "change", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLanguage", "getChange", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
            public static final /* data */ class LanguageState {

                @Nullable
                private final String change;

                @Nullable
                private final String language;

                @Nullable
                private final String title;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LanguageState)) {
                        return false;
                    }
                    LanguageState languageState = (LanguageState) other;
                    return Intrinsics.areEqual(this.title, languageState.title) && Intrinsics.areEqual(this.language, languageState.language) && Intrinsics.areEqual(this.change, languageState.change);
                }

                public static /* synthetic */ LanguageState copy$default(LanguageState languageState, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = languageState.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = languageState.language;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = languageState.change;
                    }
                    return languageState.copy(str, str2, str3);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getLanguage() {
                    return this.language;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getChange() {
                    return this.change;
                }

                @NotNull
                public final LanguageState copy(@Nullable String title, @Nullable String language, @Nullable String change) {
                    return new LanguageState(title, language, change);
                }

                @Nullable
                public final String getChange() {
                    return this.change;
                }

                @Nullable
                public final String getLanguage() {
                    return this.language;
                }

                @Nullable
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.language;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.change;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "LanguageState(title=" + this.title + ", language=" + this.language + ", change=" + this.change + ")";
                }

                public LanguageState(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                    this.title = str;
                    this.language = str2;
                    this.change = str3;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ StateWithVideo errorWithButton$default(Companion companion, ErrorState errorState, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, ConfirmExitDialog confirmExitDialog, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    errorState = ErrorState.GENERAL;
                }
                return companion.errorWithButton(errorState, charSequence, charSequence2, charSequence3, buttonAction, confirmExitDialog);
            }

            public static /* synthetic */ StateWithVideo preview$default(Companion companion, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, LanguageState languageState, boolean z11, int i11, Object obj) {
                if ((i11 & 8) != 0) {
                    languageState = null;
                }
                return companion.preview(charSequence, charSequence2, charSequence3, languageState, z11);
            }

            @NotNull
            public final StateWithVideo errorWithButton(@NotNull ErrorState error, @Nullable CharSequence title, @Nullable CharSequence text, @Nullable CharSequence primaryButtonText, @NotNull ButtonAction primaryButtonAction, @NotNull ConfirmExitDialog confirmExitDialog) {
                return new StateWithVideo(VideoStepState.ERROR, error, false, true, true, true, true, null, null, primaryButtonText, primaryButtonAction, null, null, new SNSWarning(title, text), true, false, null, null, CollectionsKt.emptyList(), null, null, null, confirmExitDialog, null, 12062720, null);
            }

            @NotNull
            public final StateWithVideo preview(@Nullable CharSequence bottomButtonText, @Nullable CharSequence title, @Nullable CharSequence description, @Nullable LanguageState language, boolean startVideoCallEnabled) {
                return new StateWithVideo(VideoStepState.PREVIEW, null, false, true, true, startVideoCallEnabled, true, title, description, bottomButtonText, ButtonAction.START_CALL, null, null, null, true, false, null, null, null, null, null, AnalyticsCallState.PREPARING, null, language, 1839106, null);
            }

            @NotNull
            public final StateWithVideo previewPhoto(@Nullable CharSequence primaryButtonText, @NotNull ButtonAction primaryButtonAction, @Nullable CharSequence secondaryButtonText, @Nullable Bitmap previewImage, @NotNull ConfirmExitDialog confirmExitDialog) {
                return new StateWithVideo(VideoStepState.VIDEO_CALL, null, false, true, true, true, true, null, null, primaryButtonText, primaryButtonAction, secondaryButtonText, null, null, true, true, null, null, CollectionsKt.emptyList(), previewImage, null, AnalyticsCallState.IN_PROGRESS, confirmExitDialog, null, 8392706, null);
            }

            @NotNull
            public final StateWithVideo readyForPhoto(@Nullable CharSequence bottomSheetTitle, @Nullable CharSequence bottomSheetText, @NotNull ConfirmExitDialog confirmExitDialog) {
                return new StateWithVideo(VideoStepState.VIDEO_CALL, null, false, true, false, false, true, bottomSheetTitle, bottomSheetText, null, null, null, null, null, true, true, null, null, CollectionsKt.emptyList(), null, null, AnalyticsCallState.IN_PROGRESS, confirmExitDialog, null, 9965570, null);
            }

            @NotNull
            public final StateWithVideo videoCall(@Nullable CharSequence bottomSheetTitle, @Nullable RemoteVideoState remoteVideoState, @NotNull List<SNSStepViewItem> documents, @NotNull ConfirmExitDialog confirmExitDialog) {
                return new StateWithVideo(VideoStepState.VIDEO_CALL, null, false, true, false, false, true, null, bottomSheetTitle, null, null, null, null, null, true, true, remoteVideoState, null, documents, null, null, AnalyticsCallState.IN_PROGRESS, confirmExitDialog, null, 9965570, null);
            }

            @NotNull
            public final StateWithVideo waitingForOperator(@Nullable CharSequence message, @Nullable CharSequence bottomSheetTitle, @NotNull List<SNSStepViewItem> documents, @NotNull ConfirmExitDialog confirmExitDialog) {
                return new StateWithVideo(VideoStepState.WAITING, null, false, true, false, false, true, null, bottomSheetTitle, null, null, null, null, null, true, false, null, message, documents, null, null, AnalyticsCallState.WAITING_FOR_OPERATOR, confirmExitDialog, null, 9965570, null);
            }
        }

        public /* synthetic */ StateWithVideo(VideoStepState videoStepState, ErrorState errorState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, CharSequence charSequence4, CharSequence charSequence5, SNSWarning sNSWarning, boolean z16, boolean z17, RemoteVideoState remoteVideoState, CharSequence charSequence6, List list, Bitmap bitmap, StateWithVideo stateWithVideo, AnalyticsCallState analyticsCallState, ConfirmExitDialog confirmExitDialog, Companion.LanguageState languageState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoStepState, (i11 & 2) != 0 ? null : errorState, (i11 & 4) != 0 ? false : z11, z12, z13, z14, z15, charSequence, charSequence2, charSequence3, buttonAction, charSequence4, (i11 & 4096) != 0 ? null : charSequence5, sNSWarning, z16, z17, remoteVideoState, charSequence6, (262144 & i11) != 0 ? CollectionsKt.emptyList() : list, (524288 & i11) != 0 ? null : bitmap, (1048576 & i11) != 0 ? null : stateWithVideo, (2097152 & i11) != 0 ? null : analyticsCallState, (4194304 & i11) != 0 ? null : confirmExitDialog, (i11 & 8388608) != 0 ? null : languageState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateWithVideo copy$default(StateWithVideo stateWithVideo, VideoStepState videoStepState, ErrorState errorState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, CharSequence charSequence4, CharSequence charSequence5, SNSWarning sNSWarning, boolean z16, boolean z17, RemoteVideoState remoteVideoState, CharSequence charSequence6, List list, Bitmap bitmap, StateWithVideo stateWithVideo2, AnalyticsCallState analyticsCallState, ConfirmExitDialog confirmExitDialog, Companion.LanguageState languageState, int i11, Object obj) {
            Companion.LanguageState languageState2;
            ConfirmExitDialog confirmExitDialog2;
            VideoStepState videoStepState2 = (i11 & 1) != 0 ? stateWithVideo.state : videoStepState;
            ErrorState errorState2 = (i11 & 2) != 0 ? stateWithVideo.errorState : errorState;
            boolean z18 = (i11 & 4) != 0 ? stateWithVideo.showProgress : z11;
            boolean z19 = (i11 & 8) != 0 ? stateWithVideo.showLocalVideo : z12;
            boolean z21 = (i11 & 16) != 0 ? stateWithVideo.showBottomButton : z13;
            boolean z22 = (i11 & 32) != 0 ? stateWithVideo.bottomButtonEnabled : z14;
            boolean z23 = (i11 & 64) != 0 ? stateWithVideo.showSwitchCamera : z15;
            CharSequence charSequence7 = (i11 & 128) != 0 ? stateWithVideo.bottomSheetTitle : charSequence;
            CharSequence charSequence8 = (i11 & 256) != 0 ? stateWithVideo.bottomSheetText : charSequence2;
            CharSequence charSequence9 = (i11 & 512) != 0 ? stateWithVideo.bottomButtonText : charSequence3;
            ButtonAction buttonAction2 = (i11 & 1024) != 0 ? stateWithVideo.bottomButtonAction : buttonAction;
            CharSequence charSequence10 = (i11 & 2048) != 0 ? stateWithVideo.bottomSecondaryButtonText : charSequence4;
            CharSequence charSequence11 = (i11 & 4096) != 0 ? stateWithVideo.bottomTertiaryButtonText : charSequence5;
            SNSWarning sNSWarning2 = (i11 & 8192) != 0 ? stateWithVideo.bottomWarning : sNSWarning;
            VideoStepState videoStepState3 = videoStepState2;
            boolean z24 = (i11 & 16384) != 0 ? stateWithVideo.showBottomSheet : z16;
            boolean z25 = (i11 & 32768) != 0 ? stateWithVideo.showRecordTimer : z17;
            RemoteVideoState remoteVideoState2 = (i11 & 65536) != 0 ? stateWithVideo.remoteVideoState : remoteVideoState;
            CharSequence charSequence12 = (i11 & 131072) != 0 ? stateWithVideo.message : charSequence6;
            List list2 = (i11 & 262144) != 0 ? stateWithVideo.documents : list;
            Bitmap bitmap2 = (i11 & 524288) != 0 ? stateWithVideo.previewImage : bitmap;
            StateWithVideo stateWithVideo3 = (i11 & 1048576) != 0 ? stateWithVideo.previousState : stateWithVideo2;
            AnalyticsCallState analyticsCallState2 = (i11 & 2097152) != 0 ? stateWithVideo.analyticsState : analyticsCallState;
            ConfirmExitDialog confirmExitDialog3 = (i11 & 4194304) != 0 ? stateWithVideo.confirmExitDialog : confirmExitDialog;
            if ((i11 & 8388608) != 0) {
                confirmExitDialog2 = confirmExitDialog3;
                languageState2 = stateWithVideo.language;
            } else {
                languageState2 = languageState;
                confirmExitDialog2 = confirmExitDialog3;
            }
            return stateWithVideo.copy(videoStepState3, errorState2, z18, z19, z21, z22, z23, charSequence7, charSequence8, charSequence9, buttonAction2, charSequence10, charSequence11, sNSWarning2, z24, z25, remoteVideoState2, charSequence12, list2, bitmap2, stateWithVideo3, analyticsCallState2, confirmExitDialog2, languageState2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateWithVideo)) {
                return false;
            }
            StateWithVideo stateWithVideo = (StateWithVideo) other;
            return this.state == stateWithVideo.state && this.errorState == stateWithVideo.errorState && this.showProgress == stateWithVideo.showProgress && this.showLocalVideo == stateWithVideo.showLocalVideo && this.showBottomButton == stateWithVideo.showBottomButton && this.bottomButtonEnabled == stateWithVideo.bottomButtonEnabled && this.showSwitchCamera == stateWithVideo.showSwitchCamera && Intrinsics.areEqual(this.bottomSheetTitle, stateWithVideo.bottomSheetTitle) && Intrinsics.areEqual(this.bottomSheetText, stateWithVideo.bottomSheetText) && Intrinsics.areEqual(this.bottomButtonText, stateWithVideo.bottomButtonText) && this.bottomButtonAction == stateWithVideo.bottomButtonAction && Intrinsics.areEqual(this.bottomSecondaryButtonText, stateWithVideo.bottomSecondaryButtonText) && Intrinsics.areEqual(this.bottomTertiaryButtonText, stateWithVideo.bottomTertiaryButtonText) && Intrinsics.areEqual(this.bottomWarning, stateWithVideo.bottomWarning) && this.showBottomSheet == stateWithVideo.showBottomSheet && this.showRecordTimer == stateWithVideo.showRecordTimer && Intrinsics.areEqual(this.remoteVideoState, stateWithVideo.remoteVideoState) && Intrinsics.areEqual(this.message, stateWithVideo.message) && Intrinsics.areEqual(this.documents, stateWithVideo.documents) && Intrinsics.areEqual(this.previewImage, stateWithVideo.previewImage) && Intrinsics.areEqual(this.previousState, stateWithVideo.previousState) && this.analyticsState == stateWithVideo.analyticsState && Intrinsics.areEqual(this.confirmExitDialog, stateWithVideo.confirmExitDialog) && Intrinsics.areEqual(this.language, stateWithVideo.language);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoStepState getState() {
            return this.state;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final CharSequence getBottomButtonText() {
            return this.bottomButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final ButtonAction getBottomButtonAction() {
            return this.bottomButtonAction;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final CharSequence getBottomSecondaryButtonText() {
            return this.bottomSecondaryButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final CharSequence getBottomTertiaryButtonText() {
            return this.bottomTertiaryButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final SNSWarning getBottomWarning() {
            return this.bottomWarning;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final boolean getShowBottomSheet() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getShowRecordTimer() {
            return this.showRecordTimer;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final RemoteVideoState getRemoteVideoState() {
            return this.remoteVideoState;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        @NotNull
        public final List<SNSStepViewItem> component19() {
            return this.documents;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Bitmap getPreviewImage() {
            return this.previewImage;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final StateWithVideo getPreviousState() {
            return this.previousState;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final AnalyticsCallState getAnalyticsState() {
            return this.analyticsState;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final ConfirmExitDialog getConfirmExitDialog() {
            return this.confirmExitDialog;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Companion.LanguageState getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShowProgress() {
            return this.showProgress;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowLocalVideo() {
            return this.showLocalVideo;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShowBottomButton() {
            return this.showBottomButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getBottomButtonEnabled() {
            return this.bottomButtonEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getShowSwitchCamera() {
            return this.showSwitchCamera;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final CharSequence getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final CharSequence getBottomSheetText() {
            return this.bottomSheetText;
        }

        @NotNull
        public final StateWithVideo copy(@NotNull VideoStepState state, @Nullable ErrorState errorState, boolean showProgress, boolean showLocalVideo, boolean showBottomButton, boolean bottomButtonEnabled, boolean showSwitchCamera, @Nullable CharSequence bottomSheetTitle, @Nullable CharSequence bottomSheetText, @Nullable CharSequence bottomButtonText, @Nullable ButtonAction bottomButtonAction, @Nullable CharSequence bottomSecondaryButtonText, @Nullable CharSequence bottomTertiaryButtonText, @Nullable SNSWarning bottomWarning, boolean showBottomSheet, boolean showRecordTimer, @Nullable RemoteVideoState remoteVideoState, @Nullable CharSequence message, @NotNull List<SNSStepViewItem> documents, @Nullable Bitmap previewImage, @Nullable StateWithVideo previousState, @Nullable AnalyticsCallState analyticsState, @Nullable ConfirmExitDialog confirmExitDialog, @Nullable Companion.LanguageState language) {
            return new StateWithVideo(state, errorState, showProgress, showLocalVideo, showBottomButton, bottomButtonEnabled, showSwitchCamera, bottomSheetTitle, bottomSheetText, bottomButtonText, bottomButtonAction, bottomSecondaryButtonText, bottomTertiaryButtonText, bottomWarning, showBottomSheet, showRecordTimer, remoteVideoState, message, documents, previewImage, previousState, analyticsState, confirmExitDialog, language);
        }

        @Nullable
        public final AnalyticsCallState getAnalyticsState() {
            return this.analyticsState;
        }

        @Nullable
        public final ButtonAction getBottomButtonAction() {
            return this.bottomButtonAction;
        }

        public final boolean getBottomButtonEnabled() {
            return this.bottomButtonEnabled;
        }

        @Nullable
        public final CharSequence getBottomButtonText() {
            return this.bottomButtonText;
        }

        @Nullable
        public final CharSequence getBottomSecondaryButtonText() {
            return this.bottomSecondaryButtonText;
        }

        @Nullable
        public final CharSequence getBottomSheetText() {
            return this.bottomSheetText;
        }

        @Nullable
        public final CharSequence getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @Nullable
        public final CharSequence getBottomTertiaryButtonText() {
            return this.bottomTertiaryButtonText;
        }

        @Nullable
        public final SNSWarning getBottomWarning() {
            return this.bottomWarning;
        }

        @Nullable
        public final ConfirmExitDialog getConfirmExitDialog() {
            return this.confirmExitDialog;
        }

        @NotNull
        public final List<SNSStepViewItem> getDocuments() {
            return this.documents;
        }

        @Nullable
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Nullable
        public final Companion.LanguageState getLanguage() {
            return this.language;
        }

        @Nullable
        public final CharSequence getMessage() {
            return this.message;
        }

        @Nullable
        public final Bitmap getPreviewImage() {
            return this.previewImage;
        }

        @Nullable
        public final StateWithVideo getPreviousState() {
            return this.previousState;
        }

        @Nullable
        public final RemoteVideoState getRemoteVideoState() {
            return this.remoteVideoState;
        }

        public final boolean getShowBottomButton() {
            return this.showBottomButton;
        }

        public final boolean getShowBottomSheet() {
            return this.showBottomSheet;
        }

        public final boolean getShowLocalVideo() {
            return this.showLocalVideo;
        }

        public final boolean getShowProgress() {
            return this.showProgress;
        }

        public final boolean getShowRecordTimer() {
            return this.showRecordTimer;
        }

        public final boolean getShowSwitchCamera() {
            return this.showSwitchCamera;
        }

        @NotNull
        public final VideoStepState getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            ErrorState errorState = this.errorState;
            int iM69001a = AbstractC27920h.m69001a(this.showSwitchCamera, AbstractC27920h.m69001a(this.bottomButtonEnabled, AbstractC27920h.m69001a(this.showBottomButton, AbstractC27920h.m69001a(this.showLocalVideo, AbstractC27920h.m69001a(this.showProgress, (iHashCode + (errorState == null ? 0 : errorState.hashCode())) * 31, 31), 31), 31), 31), 31);
            CharSequence charSequence = this.bottomSheetTitle;
            int iHashCode2 = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.bottomSheetText;
            int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.bottomButtonText;
            int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            ButtonAction buttonAction = this.bottomButtonAction;
            int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            CharSequence charSequence4 = this.bottomSecondaryButtonText;
            int iHashCode6 = (iHashCode5 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.bottomTertiaryButtonText;
            int iHashCode7 = (iHashCode6 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            SNSWarning sNSWarning = this.bottomWarning;
            int iM69001a2 = AbstractC27920h.m69001a(this.showRecordTimer, AbstractC27920h.m69001a(this.showBottomSheet, (iHashCode7 + (sNSWarning == null ? 0 : sNSWarning.hashCode())) * 31, 31), 31);
            RemoteVideoState remoteVideoState = this.remoteVideoState;
            int iHashCode8 = (iM69001a2 + (remoteVideoState == null ? 0 : remoteVideoState.hashCode())) * 31;
            CharSequence charSequence6 = this.message;
            int iHashCode9 = (this.documents.hashCode() + ((iHashCode8 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31)) * 31;
            Bitmap bitmap = this.previewImage;
            int iHashCode10 = (iHashCode9 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            StateWithVideo stateWithVideo = this.previousState;
            int iHashCode11 = (iHashCode10 + (stateWithVideo == null ? 0 : stateWithVideo.hashCode())) * 31;
            AnalyticsCallState analyticsCallState = this.analyticsState;
            int iHashCode12 = (iHashCode11 + (analyticsCallState == null ? 0 : analyticsCallState.hashCode())) * 31;
            ConfirmExitDialog confirmExitDialog = this.confirmExitDialog;
            int iHashCode13 = (iHashCode12 + (confirmExitDialog == null ? 0 : confirmExitDialog.hashCode())) * 31;
            Companion.LanguageState languageState = this.language;
            return iHashCode13 + (languageState != null ? languageState.hashCode() : 0);
        }

        public final void setAnalyticsState(@Nullable AnalyticsCallState analyticsCallState) {
            this.analyticsState = analyticsCallState;
        }

        public final void setBottomSecondaryButtonText(@Nullable CharSequence charSequence) {
            this.bottomSecondaryButtonText = charSequence;
        }

        public final void setBottomSheetText(@Nullable CharSequence charSequence) {
            this.bottomSheetText = charSequence;
        }

        public final void setBottomSheetTitle(@Nullable CharSequence charSequence) {
            this.bottomSheetTitle = charSequence;
        }

        public final void setBottomTertiaryButtonText(@Nullable CharSequence charSequence) {
            this.bottomTertiaryButtonText = charSequence;
        }

        public final void setConfirmExitDialog(@Nullable ConfirmExitDialog confirmExitDialog) {
            this.confirmExitDialog = confirmExitDialog;
        }

        public final void setDocuments(@NotNull List<SNSStepViewItem> list) {
            this.documents = list;
        }

        public final void setLanguage(@Nullable Companion.LanguageState languageState) {
            this.language = languageState;
        }

        public final void setMessage(@Nullable CharSequence charSequence) {
            this.message = charSequence;
        }

        public final void setPreviewImage(@Nullable Bitmap bitmap) {
            this.previewImage = bitmap;
        }

        public final void setRemoteVideoState(@Nullable RemoteVideoState remoteVideoState) {
            this.remoteVideoState = remoteVideoState;
        }

        public final void setShowProgress(boolean z11) {
            this.showProgress = z11;
        }

        public StateWithVideo(@NotNull VideoStepState videoStepState, @Nullable ErrorState errorState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable ButtonAction buttonAction, @Nullable CharSequence charSequence4, @Nullable CharSequence charSequence5, @Nullable SNSWarning sNSWarning, boolean z16, boolean z17, @Nullable RemoteVideoState remoteVideoState, @Nullable CharSequence charSequence6, @NotNull List<SNSStepViewItem> list, @Nullable Bitmap bitmap, @Nullable StateWithVideo stateWithVideo, @Nullable AnalyticsCallState analyticsCallState, @Nullable ConfirmExitDialog confirmExitDialog, @Nullable Companion.LanguageState languageState) {
            super(null);
            this.state = videoStepState;
            this.errorState = errorState;
            this.showProgress = z11;
            this.showLocalVideo = z12;
            this.showBottomButton = z13;
            this.bottomButtonEnabled = z14;
            this.showSwitchCamera = z15;
            this.bottomSheetTitle = charSequence;
            this.bottomSheetText = charSequence2;
            this.bottomButtonText = charSequence3;
            this.bottomButtonAction = buttonAction;
            this.bottomSecondaryButtonText = charSequence4;
            this.bottomTertiaryButtonText = charSequence5;
            this.bottomWarning = sNSWarning;
            this.showBottomSheet = z16;
            this.showRecordTimer = z17;
            this.remoteVideoState = remoteVideoState;
            this.message = charSequence6;
            this.documents = list;
            this.previewImage = bitmap;
            this.previousState = stateWithVideo;
            this.analyticsState = analyticsCallState;
            this.confirmExitDialog = confirmExitDialog;
            this.language = languageState;
        }

        @NotNull
        public String toString() {
            boolean z11;
            String strM69333a = AbstractC28458h.m69333a(this);
            VideoStepState videoStepState = this.state;
            boolean z12 = this.showProgress;
            CharSequence charSequence = this.bottomSheetTitle;
            List<SNSStepViewItem> list = this.documents;
            if (this.previewImage != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            return strM69333a + " (" + videoStepState + ", progress=" + z12 + ", title=" + ((Object) charSequence) + ", docs=" + list + ", preview=" + z11 + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$VideoStepState;", "", "<init>", "(Ljava/lang/String;I)V", "PREVIEW", "WAITING", "VIDEO_CALL", "RECONNECTING", "ERROR", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum VideoStepState {
        PREVIEW,
        WAITING,
        VIDEO_CALL,
        RECONNECTING,
        ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<VideoStepState> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ SNSViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SNSViewState() {
    }

    public final boolean isError() {
        return (this instanceof StateWithVideo) && ((StateWithVideo) this).getState() == VideoStepState.ERROR;
    }

    public final boolean isLoading() {
        if (Intrinsics.areEqual(this, Loading.INSTANCE)) {
            return true;
        }
        SNSViewState sNSViewState = this instanceof StateWithVideo ? this : null;
        return sNSViewState != null ? ((StateWithVideo) sNSViewState).getShowProgress() : false;
    }

    public final boolean isPreview() {
        return (this instanceof StateWithVideo) && ((StateWithVideo) this).getState() == VideoStepState.PREVIEW;
    }

    public final boolean isReconnecting() {
        return (this instanceof StateWithVideo) && ((StateWithVideo) this).getState() == VideoStepState.RECONNECTING;
    }

    public final boolean isVideoCall() {
        return (this instanceof StateWithVideo) && ((StateWithVideo) this).getState() == VideoStepState.VIDEO_CALL;
    }

    public final boolean isWaiting() {
        return (this instanceof StateWithVideo) && ((StateWithVideo) this).getState() == VideoStepState.WAITING;
    }

    public final boolean getHasVideo() {
        if (!isPreview() && !isVideoCall() && !isWaiting()) {
            return false;
        }
        return true;
    }
}
