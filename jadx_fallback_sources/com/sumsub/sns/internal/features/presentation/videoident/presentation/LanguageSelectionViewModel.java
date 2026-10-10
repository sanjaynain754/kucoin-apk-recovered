package com.sumsub.sns.internal.features.presentation.videoident.presentation;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@kotlin.Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()'B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006*"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel;", "Lcom/sumsub/sns/core/presentation/base/M0;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Landroid/os/Bundle;", "args", "Lcom/sumsub/sns/internal/features/data/repository/common/a;", "commonRepository", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "dataRepository", "<init>", "(Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V", "Lcom/sumsub/sns/internal/features/data/model/common/h;", "config", "", "updateViewState", "(Lcom/sumsub/sns/internal/features/data/model/common/h;)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "language", "onItemSelected", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;)V", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/b0;", "getAvailableLanguages", "()Ljava/util/List;", "availableLanguages", "", "getSelectedLanguage", "()Ljava/lang/String;", "selectedLanguage", "getIdDocSetType", "idDocSetType", "Companion", "FinishWithLanguage", "ViewState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLanguageSelectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel\n+ 2 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,131:1\n33#2,5:132\n*S KotlinDebug\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel\n*L\n34#1:132,5\n*E\n"})
public final class LanguageSelectionViewModel extends com.sumsub.sns.core.presentation.base.AbstractC28073M0 {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_ID_DOC_SET_TYPE = "id_doc_set_type";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_LANGS = "languages";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_SELECTED_LANG = "lang";

    @org.jetbrains.annotations.NotNull
    public static final com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String STRING_LANG_ITEM_PREFIX = "sns_videoident_langSelector_waitTime_prefix";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String STRING_LANG_ITEM_TEXT = "sns_videoident_langSelector_waitTime_text";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String STRING_TITLE = "sns_videoident_langSelector_title";

    @org.jetbrains.annotations.NotNull
    private final android.os.Bundle args;

    @org.jetbrains.annotations.NotNull
    private final com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m dataRepository;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$Companion;", "", "<init>", "()V", "ARG_LANGS", "", "ARG_SELECTED_LANG", "ARG_ID_DOC_SET_TYPE", "STRING_TITLE", "STRING_LANG_ITEM_PREFIX", "STRING_LANG_ITEM_TEXT", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @kotlin.Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$FinishWithLanguage;", "Lcom/sumsub/sns/core/presentation/base/r;", "", "language", "", "waitTimeSec", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$FinishWithLanguage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLanguage", "J", "getWaitTimeSec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class FinishWithLanguage implements com.sumsub.sns.core.presentation.base.InterfaceC28145r {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String language;
        private final long waitTimeSec;

        public FinishWithLanguage(@org.jetbrains.annotations.NotNull java.lang.String r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.language = r1
                r0.waitTimeSec = r2
                return
        }

        public static /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.FinishWithLanguage copy$default(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.FinishWithLanguage r0, java.lang.String r1, long r2, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                java.lang.String r1 = r0.language
            L6:
                r4 = r4 & 2
                if (r4 == 0) goto Lc
                long r2 = r0.waitTimeSec
            Lc:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.language
                return r0
        }

        public final long component2() {
                r2 = this;
                long r0 = r2.waitTimeSec
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.FinishWithLanguage copy(@org.jetbrains.annotations.NotNull java.lang.String r2, long r3) {
                r1 = this;
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.FinishWithLanguage
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage r8 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.FinishWithLanguage) r8
                java.lang.String r1 = r7.language
                java.lang.String r3 = r8.language
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                long r3 = r7.waitTimeSec
                long r5 = r8.waitTimeSec
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L20
                return r2
            L20:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLanguage() {
                r1 = this;
                java.lang.String r0 = r1.language
                return r0
        }

        public final long getWaitTimeSec() {
                r2 = this;
                long r0 = r2.waitTimeSec
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.language
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                long r1 = r3.waitTimeSec
                int r1 = java.lang.Long.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r5 = this;
                java.lang.String r0 = r5.language
                long r1 = r5.waitTimeSec
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "FinishWithLanguage(language="
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ", waitTimeSec="
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = ")"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @kotlin.Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "title", "", "languages", "", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getLanguages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ButtonState", "Language", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class ViewState extends com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSViewState {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language> languages;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String title;

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @kotlin.Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$ButtonState;", "", "enabled", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class ButtonState {
            private final boolean enabled;

            @org.jetbrains.annotations.Nullable
            private final java.lang.String text;

            public ButtonState(boolean r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.enabled = r1
                    r0.text = r2
                    return
            }

            public static /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.ButtonState copy$default(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.ButtonState r0, boolean r1, java.lang.String r2, int r3, java.lang.Object r4) {
                    r4 = r3 & 1
                    if (r4 == 0) goto L6
                    boolean r1 = r0.enabled
                L6:
                    r3 = r3 & 2
                    if (r3 == 0) goto Lc
                    java.lang.String r2 = r0.text
                Lc:
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$ButtonState r0 = r0.copy(r1, r2)
                    return r0
            }

            public final boolean component1() {
                    r1 = this;
                    boolean r0 = r1.enabled
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                    r1 = this;
                    java.lang.String r0 = r1.text
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.ButtonState copy(boolean r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                    r1 = this;
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$ButtonState r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$ButtonState
                    r0.<init>(r2, r3)
                    return r0
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.ButtonState
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$ButtonState r5 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.ButtonState) r5
                    boolean r1 = r4.enabled
                    boolean r3 = r5.enabled
                    if (r1 == r3) goto L13
                    return r2
                L13:
                    java.lang.String r1 = r4.text
                    java.lang.String r5 = r5.text
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                    if (r5 != 0) goto L1e
                    return r2
                L1e:
                    return r0
            }

            public final boolean getEnabled() {
                    r1 = this;
                    boolean r0 = r1.enabled
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getText() {
                    r1 = this;
                    java.lang.String r0 = r1.text
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    boolean r0 = r2.enabled
                    int r0 = java.lang.Boolean.hashCode(r0)
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.text
                    if (r1 != 0) goto Le
                    r1 = 0
                    goto L12
                Le:
                    int r1 = r1.hashCode()
                L12:
                    int r0 = r0 + r1
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                    r4 = this;
                    boolean r0 = r4.enabled
                    java.lang.String r1 = r4.text
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "ButtonState(enabled="
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = ", text="
                    r2.append(r0)
                    r2.append(r1)
                    java.lang.String r0 = ")"
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    return r0
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @kotlin.Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JT\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "", "id", "", "title", "status", "time", "selected", "", "waitTimeSec", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getTitle", "getStatus", "getTime", "getSelected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWaitTimeSec", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;J)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "equals", "other", "hashCode", "", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Language {

            /* JADX INFO: renamed from: id */
            @org.jetbrains.annotations.Nullable
            private final java.lang.String f67372id;

            @org.jetbrains.annotations.Nullable
            private final java.lang.Boolean selected;

            @org.jetbrains.annotations.Nullable
            private final java.lang.String status;

            @org.jetbrains.annotations.Nullable
            private final java.lang.String time;

            @org.jetbrains.annotations.Nullable
            private final java.lang.String title;
            private final long waitTimeSec;

            public Language(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Boolean r5, long r6) {
                    r0 = this;
                    r0.<init>()
                    r0.f67372id = r1
                    r0.title = r2
                    r0.status = r3
                    r0.time = r4
                    r0.selected = r5
                    r0.waitTimeSec = r6
                    return
            }

            public static /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language copy$default(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Boolean r5, long r6, int r8, java.lang.Object r9) {
                    r9 = r8 & 1
                    if (r9 == 0) goto L6
                    java.lang.String r1 = r0.f67372id
                L6:
                    r9 = r8 & 2
                    if (r9 == 0) goto Lc
                    java.lang.String r2 = r0.title
                Lc:
                    r9 = r8 & 4
                    if (r9 == 0) goto L12
                    java.lang.String r3 = r0.status
                L12:
                    r9 = r8 & 8
                    if (r9 == 0) goto L18
                    java.lang.String r4 = r0.time
                L18:
                    r9 = r8 & 16
                    if (r9 == 0) goto L1e
                    java.lang.Boolean r5 = r0.selected
                L1e:
                    r8 = r8 & 32
                    if (r8 == 0) goto L24
                    long r6 = r0.waitTimeSec
                L24:
                    r8 = r6
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r2 = r0
                    r3 = r1
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language r0 = r2.copy(r3, r4, r5, r6, r7, r8)
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String component1() {
                    r1 = this;
                    java.lang.String r0 = r1.f67372id
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String component3() {
                    r1 = this;
                    java.lang.String r0 = r1.status
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String component4() {
                    r1 = this;
                    java.lang.String r0 = r1.time
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Boolean component5() {
                    r1 = this;
                    java.lang.Boolean r0 = r1.selected
                    return r0
            }

            public final long component6() {
                    r2 = this;
                    long r0 = r2.waitTimeSec
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language copy(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.Boolean r13, long r14) {
                    r8 = this;
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language
                    r1 = r9
                    r2 = r10
                    r3 = r11
                    r4 = r12
                    r5 = r13
                    r6 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
                    r7 = this;
                    r0 = 1
                    if (r7 != r8) goto L4
                    return r0
                L4:
                    boolean r1 = r8 instanceof com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language r8 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language) r8
                    java.lang.String r1 = r7.f67372id
                    java.lang.String r3 = r8.f67372id
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    java.lang.String r1 = r7.title
                    java.lang.String r3 = r8.title
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L22
                    return r2
                L22:
                    java.lang.String r1 = r7.status
                    java.lang.String r3 = r8.status
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L2d
                    return r2
                L2d:
                    java.lang.String r1 = r7.time
                    java.lang.String r3 = r8.time
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L38
                    return r2
                L38:
                    java.lang.Boolean r1 = r7.selected
                    java.lang.Boolean r3 = r8.selected
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                    if (r1 != 0) goto L43
                    return r2
                L43:
                    long r3 = r7.waitTimeSec
                    long r5 = r8.waitTimeSec
                    int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r8 == 0) goto L4c
                    return r2
                L4c:
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getId() {
                    r1 = this;
                    java.lang.String r0 = r1.f67372id
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Boolean getSelected() {
                    r1 = this;
                    java.lang.Boolean r0 = r1.selected
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getStatus() {
                    r1 = this;
                    java.lang.String r0 = r1.status
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTime() {
                    r1 = this;
                    java.lang.String r0 = r1.time
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public final long getWaitTimeSec() {
                    r2 = this;
                    long r0 = r2.waitTimeSec
                    return r0
            }

            public int hashCode() {
                    r3 = this;
                    java.lang.String r0 = r3.f67372id
                    r1 = 0
                    if (r0 != 0) goto L7
                    r0 = r1
                    goto Lb
                L7:
                    int r0 = r0.hashCode()
                Lb:
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.title
                    if (r2 != 0) goto L13
                    r2 = r1
                    goto L17
                L13:
                    int r2 = r2.hashCode()
                L17:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.status
                    if (r2 != 0) goto L20
                    r2 = r1
                    goto L24
                L20:
                    int r2 = r2.hashCode()
                L24:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.time
                    if (r2 != 0) goto L2d
                    r2 = r1
                    goto L31
                L2d:
                    int r2 = r2.hashCode()
                L31:
                    int r0 = r0 + r2
                    int r0 = r0 * 31
                    java.lang.Boolean r2 = r3.selected
                    if (r2 != 0) goto L39
                    goto L3d
                L39:
                    int r1 = r2.hashCode()
                L3d:
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    long r1 = r3.waitTimeSec
                    int r1 = java.lang.Long.hashCode(r1)
                    int r1 = r1 + r0
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                    r9 = this;
                    java.lang.String r0 = r9.f67372id
                    java.lang.String r1 = r9.title
                    java.lang.String r2 = r9.status
                    java.lang.String r3 = r9.time
                    java.lang.Boolean r4 = r9.selected
                    long r5 = r9.waitTimeSec
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "Language(id="
                    r7.append(r8)
                    r7.append(r0)
                    java.lang.String r0 = ", title="
                    r7.append(r0)
                    r7.append(r1)
                    java.lang.String r0 = ", status="
                    r7.append(r0)
                    r7.append(r2)
                    java.lang.String r0 = ", time="
                    r7.append(r0)
                    r7.append(r3)
                    java.lang.String r0 = ", selected="
                    r7.append(r0)
                    r7.append(r4)
                    java.lang.String r0 = ", waitTimeSec="
                    r7.append(r0)
                    r7.append(r5)
                    java.lang.String r0 = ")"
                    r7.append(r0)
                    java.lang.String r0 = r7.toString()
                    return r0
            }
        }

        public ViewState(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.title = r2
                r1.languages = r3
                return
        }

        public static /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState copy$default(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.title
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r2 = r0.languages
            Lc:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language> component2() {
                r1 = this;
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r0 = r1.languages
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language> r3) {
                r1 = this;
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r5 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r5
                java.lang.String r1 = r4.title
                java.lang.String r3 = r5.title
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r1 = r4.languages
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r5 = r5.languages
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language> getLanguages() {
                r1 = this;
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r0 = r1.languages
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.title
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 * 31
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r1 = r2.languages
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = r4.title
                java.util.List<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language> r1 = r4.languages
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "ViewState(title="
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ", languages="
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$onPrepare$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel", m90122f = "LanguageSelectionViewModel.kt", m90123i = {}, m90124l = {38}, m90125m = "onPrepare", m90126n = {}, m90127s = {})
    public static final class C329281 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel this$0;

        public C329281(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r1, kotlin.coroutines.Continuation<? super com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329281> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r2 = r1.this$0
                java.lang.Object r2 = r2.onPrepare(r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1", m90122f = "LanguageSelectionViewModel.kt", m90123i = {0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {66, 72, 73}, m90125m = "invokeSuspend", m90126n = {"currentLanguage", "currentLanguage", "destination$iv$iv", "l", "time", "currentLanguage", "destination$iv$iv", "l", "time"}, m90127s = {"L$0", "L$0", "L$3", "L$5", "J$0", "L$0", "L$3", "L$5", "J$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLanguageSelectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$updateViewState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1563#2:132\n1634#2,3:133\n*S KotlinDebug\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$updateViewState$1\n*L\n67#1:132\n67#1:133,3\n*E\n"})
    public static final class C329291 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState, kotlin.coroutines.Continuation<? super com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState>, java.lang.Object> {
        final /* synthetic */ com.sumsub.sns.internal.features.data.model.common.C29124h $config;
        long J$0;
        /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        java.lang.Object L$7;
        java.lang.Object L$8;
        java.lang.Object L$9;
        int label;
        final /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel this$0;

        public C329291(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r1, com.sumsub.sns.internal.features.data.model.common.C29124h r2, kotlin.coroutines.Continuation<? super com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329291> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$config = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1 r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r1 = r3.this$0
                com.sumsub.sns.internal.features.data.model.common.h r2 = r3.$config
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState r1, kotlin.coroutines.Continuation<? super com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1 r1 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329291) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState r1, kotlin.coroutines.Continuation<? super com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState> r2) {
                r0 = this;
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r1 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
                r26 = this;
                r0 = r26
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r5 = 3
                r6 = 2
                r8 = 1
                if (r2 == 0) goto Lb7
                if (r2 == r8) goto La9
                if (r2 == r6) goto L63
                if (r2 != r5) goto L5b
                long r9 = r0.J$0
                java.lang.Object r2 = r0.L$11
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r11 = r0.L$10
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r0.L$9
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r12 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r12
                java.lang.Object r13 = r0.L$8
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r14 = r0.L$7
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r15 = r0.L$6
                java.lang.String r15 = (java.lang.String) r15
                java.lang.Object r3 = r0.L$5
                com.sumsub.sns.internal.features.data.model.common.remote.b0 r3 = (com.sumsub.sns.internal.features.data.model.common.remote.C29325b0) r3
                java.lang.Object r4 = r0.L$4
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.L$3
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r0.L$2
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r6 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel) r6
                java.lang.Object r8 = r0.L$1
                com.sumsub.sns.internal.features.data.model.common.h r8 = (com.sumsub.sns.internal.features.data.model.common.C29124h) r8
                java.lang.Object r7 = r0.L$0
                java.lang.String r7 = (java.lang.String) r7
                kotlin.ResultKt.throwOnFailure(r27)
                r17 = r8
                r8 = r6
                r6 = r17
                r19 = r13
                r17 = r14
                r13 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r27
            L57:
                r18 = r15
                goto L1a8
            L5b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L63:
                long r2 = r0.J$0
                java.lang.Object r4 = r0.L$10
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$9
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r0.L$8
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r6 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r6
                java.lang.Object r7 = r0.L$7
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r0.L$6
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r0.L$5
                com.sumsub.sns.internal.features.data.model.common.remote.b0 r9 = (com.sumsub.sns.internal.features.data.model.common.remote.C29325b0) r9
                java.lang.Object r10 = r0.L$4
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.L$3
                java.util.Collection r11 = (java.util.Collection) r11
                java.lang.Object r12 = r0.L$2
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r12 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel) r12
                java.lang.Object r13 = r0.L$1
                com.sumsub.sns.internal.features.data.model.common.h r13 = (com.sumsub.sns.internal.features.data.model.common.C29124h) r13
                java.lang.Object r14 = r0.L$0
                java.lang.String r14 = (java.lang.String) r14
                kotlin.ResultKt.throwOnFailure(r27)
                r15 = r11
                r11 = r5
                r5 = r15
                r15 = r12
                r12 = r6
                r6 = r15
                r15 = r8
                r8 = r13
                r13 = r7
                r7 = r14
                r14 = r27
                r24 = r2
                r2 = r4
                r3 = r9
                r4 = r10
                r9 = r24
                goto L16d
            La9:
                java.lang.Object r2 = r0.L$1
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r2 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r2
                java.lang.Object r3 = r0.L$0
                java.lang.String r3 = (java.lang.String) r3
                kotlin.ResultKt.throwOnFailure(r27)
                r4 = r27
                goto Le7
            Lb7:
                kotlin.ResultKt.throwOnFailure(r27)
                java.lang.Object r2 = r0.L$0
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r2 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState) r2
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r3 = r0.this$0
                java.lang.String r3 = com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.access$getSelectedLanguage(r3)
                if (r3 != 0) goto Ld3
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r3 = r0.this$0
                android.os.Bundle r3 = r3.getArgs()
                java.lang.String r4 = "lang"
                r5 = 0
                java.lang.String r3 = r3.getString(r4, r5)
            Ld3:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r4 = r0.this$0
                r0.L$0 = r3
                r0.L$1 = r2
                r5 = 1
                r0.label = r5
                java.lang.String r5 = "sns_videoident_langSelector_title"
                java.lang.Object r4 = r4.getString(r5, r0)
                if (r4 != r1) goto Le7
                goto L197
            Le7:
                java.lang.String r4 = (java.lang.String) r4
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r5 = r0.this$0
                java.util.List r5 = com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.access$getAvailableLanguages(r5)
                com.sumsub.sns.internal.features.data.model.common.h r6 = r0.$config
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r7 = r0.this$0
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r9)
                r8.<init>(r9)
                java.util.Iterator r5 = r5.iterator()
            L102:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L1e6
                java.lang.Object r9 = r5.next()
                com.sumsub.sns.internal.features.data.model.common.remote.b0 r9 = (com.sumsub.sns.internal.features.data.model.common.remote.C29325b0) r9
                java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                java.lang.Long r11 = r9.f59336c
                if (r11 == 0) goto L119
                long r11 = r11.longValue()
                goto L11b
            L119:
                r11 = 0
            L11b:
                long r10 = r10.toMinutes(r11)
                r12 = 1
                long r10 = kotlin.ranges.RangesKt.coerceAtLeast(r10, r12)
                java.lang.String r12 = r9.f59334a
                java.util.Map r13 = com.sumsub.sns.internal.features.data.model.common.AbstractC29130i.m69782h(r6)
                if (r13 == 0) goto L137
                java.lang.String r14 = r9.f59334a
                java.lang.Object r13 = r13.get(r14)
                java.lang.String r13 = (java.lang.String) r13
                if (r13 != 0) goto L139
            L137:
                java.lang.String r13 = r9.f59334a
            L139:
                r0.L$0 = r3
                r0.L$1 = r6
                r0.L$2 = r7
                r0.L$3 = r8
                r0.L$4 = r5
                r0.L$5 = r9
                r0.L$6 = r13
                r0.L$7 = r12
                r0.L$8 = r2
                r0.L$9 = r4
                r0.L$10 = r8
                r14 = 0
                r0.L$11 = r14
                r0.J$0 = r10
                r15 = 2
                r0.label = r15
                java.lang.String r14 = "sns_videoident_langSelector_waitTime_prefix"
                java.lang.Object r14 = r7.getString(r14, r0)
                if (r14 != r1) goto L161
                goto L197
            L161:
                r15 = r13
                r13 = r12
                r12 = r2
                r2 = r8
                r8 = r6
                r6 = r7
                r7 = r3
                r3 = r9
                r9 = r10
                r11 = r4
                r4 = r5
                r5 = r2
            L16d:
                java.lang.String r14 = (java.lang.String) r14
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r6
                r0.L$3 = r5
                r0.L$4 = r4
                r0.L$5 = r3
                r0.L$6 = r15
                r0.L$7 = r13
                r0.L$8 = r14
                r0.L$9 = r12
                r0.L$10 = r11
                r0.L$11 = r2
                r0.J$0 = r9
                r27 = r3
                r3 = 3
                r0.label = r3
                java.lang.String r3 = "sns_videoident_langSelector_waitTime_text"
                java.lang.Object r3 = r6.getString(r3, r0)
                if (r3 != r1) goto L198
            L197:
                return r1
            L198:
                r17 = r8
                r8 = r6
                r6 = r17
                r17 = r13
                r19 = r14
                r13 = r9
                r9 = r5
                r5 = r4
                r4 = r27
                goto L57
            L1a8:
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L1bb
                java.lang.String r10 = java.lang.String.valueOf(r13)
                java.lang.String r13 = "{timeInMinutes}"
                r14 = 1
                java.lang.String r3 = kotlin.text.StringsKt.replace(r3, r13, r10, r14)
                r20 = r3
                goto L1be
            L1bb:
                r14 = 1
                r20 = 0
            L1be:
                java.lang.String r3 = r4.f59334a
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
                java.lang.Boolean r21 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                java.lang.Long r3 = r4.f59336c
                if (r3 == 0) goto L1d3
                long r3 = r3.longValue()
                r22 = r3
                goto L1d5
            L1d3:
                r22 = 0
            L1d5:
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language r16 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState$Language
                r16.<init>(r17, r18, r19, r20, r21, r22)
                r3 = r16
                r2.add(r3)
                r3 = r7
                r7 = r8
                r8 = r9
                r4 = r11
                r2 = r12
                goto L102
            L1e6:
                java.util.List r8 = (java.util.List) r8
                com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r1 = r2.copy(r4, r8)
                return r1
        }
    }

    static {
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$Companion r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$Companion
            r1 = 0
            r0.<init>(r1)
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.Companion = r0
            return
    }

    public LanguageSelectionViewModel(@org.jetbrains.annotations.NotNull android.os.Bundle r1, @org.jetbrains.annotations.NotNull com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a r2, @org.jetbrains.annotations.NotNull com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.args = r1
            r0.dataRepository = r3
            return
    }

    public static final /* synthetic */ java.util.List access$getAvailableLanguages(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r0) {
            java.util.List r0 = r0.getAvailableLanguages()
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getSelectedLanguage(com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel r0) {
            java.lang.String r0 = r0.getSelectedLanguage()
            return r0
    }

    private final java.util.List<com.sumsub.sns.internal.features.data.model.common.remote.C29325b0> getAvailableLanguages() {
            r4 = this;
            android.os.Bundle r0 = r4.args
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.String r3 = "languages"
            if (r1 < r2) goto L11
            java.lang.Class<com.sumsub.sns.internal.features.data.model.common.remote.b0> r1 = com.sumsub.sns.internal.features.data.model.common.remote.C29325b0.class
            java.util.ArrayList r0 = com.sumsub.sns.internal.features.presentation.videoident.presentation.C33008h.m71423a(r0, r3, r1)
            goto L15
        L11:
            java.util.ArrayList r0 = r0.getParcelableArrayList(r3)
        L15:
            if (r0 != 0) goto L1b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L1b:
            return r0
    }

    private final java.lang.String getSelectedLanguage() {
            r3 = this;
            android.os.Bundle r0 = r3.args
            java.lang.String r1 = "lang"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    private final void updateViewState(com.sumsub.sns.internal.features.data.model.common.C29124h r4) {
            r3 = this;
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1 r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1
            r1 = 0
            r0.<init>(r3, r4, r1)
            r4 = 0
            r2 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r3, r4, r0, r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.os.Bundle getArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.args
            return r0
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public /* bridge */ /* synthetic */ com.sumsub.sns.core.presentation.base.InterfaceC28147s getDefaultState() {
            r1 = this;
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r0 = r1.getDefaultState()
            return r0
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @org.jetbrains.annotations.NotNull
    public com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState getDefaultState() {
            r3 = this;
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$ViewState
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.lang.String r2 = ""
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIdDocSetType() {
            r3 = this;
            android.os.Bundle r0 = r3.args
            java.lang.String r1 = "id_doc_set_type"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public final void onItemSelected(@org.jetbrains.annotations.NotNull com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.ViewState.Language r5) {
            r4 = this;
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$FinishWithLanguage
            java.lang.String r1 = r5.getId()
            if (r1 != 0) goto La
            java.lang.String r1 = "en"
        La:
            long r2 = r5.getWaitTimeSec()
            r0.<init>(r1, r2)
            r4.fireEvent(r0)
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onPrepare(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329281
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$onPrepare$1 r0 = (com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$onPrepare$1 r0 = new com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$onPrepare$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.sumsub.sns.internal.features.data.repository.dynamic.m r5 = r4.dataRepository
            r0.label = r3
            com.sumsub.sns.internal.features.data.repository.dynamic.J r5 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29967J) r5
            r2 = 0
            java.lang.Object r5 = r5.m70045b(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.sumsub.sns.internal.features.data.repository.dynamic.N r5 = (com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N) r5
            java.lang.Object r5 = r5.m70051c()
            com.sumsub.sns.internal.features.data.model.common.h r5 = (com.sumsub.sns.internal.features.data.model.common.C29124h) r5
            if (r5 != 0) goto L5e
            com.sumsub.sns.internal.log.a r5 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r5 = r5.f67810a
            java.lang.String r0 = "LanguageSelectionViewModel"
            r1 = 0
            java.lang.String r2 = "Language selection prepare error. Config missing"
            r5.mo68956e(r0, r2, r1)
            r4.finishAbnormal(r2)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5e:
            r4.updateViewState(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
