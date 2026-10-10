package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhotoStepStateHelper;", "", "<init>", "()V", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "strings", "", "docSetType", "Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;", "side", "docType", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhotoStepStateHelper$State;", "createState", "(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/String;)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhotoStepStateHelper$State;", "State", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PhotoStepStateHelper {

    @NotNull
    public static final PhotoStepStateHelper INSTANCE = new PhotoStepStateHelper();

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/PhotoStepStateHelper$State;", "", "title", "", "text", "uploadText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "getText", "getUploadText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class State {

        @NotNull
        private final CharSequence text;

        @NotNull
        private final CharSequence title;

        @Nullable
        private final CharSequence uploadText;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.title, state.title) && Intrinsics.areEqual(this.text, state.text) && Intrinsics.areEqual(this.uploadText, state.uploadText);
        }

        public static /* synthetic */ State copy$default(State state, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = state.title;
            }
            if ((i11 & 2) != 0) {
                charSequence2 = state.text;
            }
            if ((i11 & 4) != 0) {
                charSequence3 = state.uploadText;
            }
            return state.copy(charSequence, charSequence2, charSequence3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CharSequence getUploadText() {
            return this.uploadText;
        }

        @NotNull
        public final State copy(@NotNull CharSequence title, @NotNull CharSequence text, @Nullable CharSequence uploadText) {
            return new State(title, text, uploadText);
        }

        @NotNull
        public final CharSequence getText() {
            return this.text;
        }

        @NotNull
        public final CharSequence getTitle() {
            return this.title;
        }

        @Nullable
        public final CharSequence getUploadText() {
            return this.uploadText;
        }

        public int hashCode() {
            int iHashCode = (this.text.hashCode() + (this.title.hashCode() * 31)) * 31;
            CharSequence charSequence = this.uploadText;
            return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        @NotNull
        public String toString() {
            return "State(title=" + ((Object) this.title) + ", text=" + ((Object) this.text) + ", uploadText=" + ((Object) this.uploadText) + ")";
        }

        public State(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @Nullable CharSequence charSequence3) {
            this.title = charSequence;
            this.text = charSequence2;
            this.uploadText = charSequence3;
        }
    }

    @NotNull
    public final State createState(@NotNull final C29983l strings, @NotNull String docSetType, @Nullable IdentitySide side, @Nullable String docType) {
        String strReplace$default;
        if (new C29070X(docSetType).m69749f()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM69671a = AbstractC28892d.m69671a(new Object[]{docSetType, "videoident", "title"}, 3, "sns_step_%s_%s_%s", strings);
            String strM69671a2 = AbstractC28892d.m69671a(new Object[]{docSetType, "videoident", "text"}, 3, "sns_step_%s_%s_%s", strings);
            if (strM69671a == null) {
                strM69671a = "";
            }
            return new State(strM69671a, strM69671a2 != null ? strM69671a2 : "", strings.m70061a("sns_videoident_action_upload"));
        }
        String strM70061a = strings.m70061a("sns_videoident_action_pickUp");
        if (strM70061a == null) {
            strReplace$default = docType == null ? docSetType : docType;
        } else {
            strReplace$default = docType != null ? StringsKt.replace$default(strM70061a.toString(), "{doctype}", AbstractC29121g2.m69769a(docType).m69801a(strings, null).toString(), false, 4, (Object) null) : StringsKt.replace$default(strM70061a.toString(), "{doctype}", new C29070X(docSetType).m69745b(strings).toString(), false, 4, (Object) null);
        }
        if (side == null) {
            String str = (String) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(PhotoStepStateHelperKt.buildKeyList(docSetType, "videoident", "title")), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return strings.m70061a((String) obj);
                }
            }));
            if (str == null) {
                str = "";
            }
            String str2 = (String) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(PhotoStepStateHelperKt.buildKeyList(docSetType, "videoident", "text")), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return strings.m70061a((String) obj);
                }
            }));
            return new State(str, str2 != null ? str2 : "", strReplace$default);
        }
        String str3 = side == IdentitySide.Back ? "backSide" : "frontSide";
        String str4 = (String) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(PhotoStepStateHelperKt.buildKeyList(docSetType, "videoident", str3, "title", docType)), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return strings.m70061a((String) obj);
            }
        }));
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(PhotoStepStateHelperKt.buildKeyList(docSetType, "videoident", str3, "text", docType)), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return strings.m70061a((String) obj);
            }
        }));
        return new State(str4, str5 != null ? str5 : "", strReplace$default);
    }

    private PhotoStepStateHelper() {
    }
}
