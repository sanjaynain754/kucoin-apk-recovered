package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29325b0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()'B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006*"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel;", "Lcom/sumsub/sns/core/presentation/base/M0;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Landroid/os/Bundle;", "args", "Lcom/sumsub/sns/internal/features/data/repository/common/a;", "commonRepository", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "dataRepository", "<init>", "(Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V", "Lcom/sumsub/sns/internal/features/data/model/common/h;", "config", "", "updateViewState", "(Lcom/sumsub/sns/internal/features/data/model/common/h;)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "language", "onItemSelected", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;)V", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/b0;", "getAvailableLanguages", "()Ljava/util/List;", "availableLanguages", "", "getSelectedLanguage", "()Ljava/lang/String;", "selectedLanguage", "getIdDocSetType", "idDocSetType", "Companion", "FinishWithLanguage", "ViewState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageSelectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel\n+ 2 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,131:1\n33#2,5:132\n*S KotlinDebug\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel\n*L\n34#1:132,5\n*E\n"})
public final class LanguageSelectionViewModel extends AbstractC28073M0 {

    @NotNull
    public static final String ARG_ID_DOC_SET_TYPE = "id_doc_set_type";

    @NotNull
    public static final String ARG_LANGS = "languages";

    @NotNull
    public static final String ARG_SELECTED_LANG = "lang";

    @NotNull
    private static final String STRING_LANG_ITEM_PREFIX = "sns_videoident_langSelector_waitTime_prefix";

    @NotNull
    private static final String STRING_LANG_ITEM_TEXT = "sns_videoident_langSelector_waitTime_text";

    @NotNull
    private static final String STRING_TITLE = "sns_videoident_langSelector_title";

    @NotNull
    private final Bundle args;

    @NotNull
    private final InterfaceC29984m dataRepository;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$FinishWithLanguage;", "Lcom/sumsub/sns/core/presentation/base/r;", "", "language", "", "waitTimeSec", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$FinishWithLanguage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLanguage", "J", "getWaitTimeSec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class FinishWithLanguage implements InterfaceC28145r {

        @NotNull
        private final String language;
        private final long waitTimeSec;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishWithLanguage)) {
                return false;
            }
            FinishWithLanguage finishWithLanguage = (FinishWithLanguage) other;
            return Intrinsics.areEqual(this.language, finishWithLanguage.language) && this.waitTimeSec == finishWithLanguage.waitTimeSec;
        }

        public static /* synthetic */ FinishWithLanguage copy$default(FinishWithLanguage finishWithLanguage, String str, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = finishWithLanguage.language;
            }
            if ((i11 & 2) != 0) {
                j11 = finishWithLanguage.waitTimeSec;
            }
            return finishWithLanguage.copy(str, j11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getWaitTimeSec() {
            return this.waitTimeSec;
        }

        @NotNull
        public final FinishWithLanguage copy(@NotNull String language, long waitTimeSec) {
            return new FinishWithLanguage(language, waitTimeSec);
        }

        @NotNull
        public final String getLanguage() {
            return this.language;
        }

        public final long getWaitTimeSec() {
            return this.waitTimeSec;
        }

        public int hashCode() {
            return Long.hashCode(this.waitTimeSec) + (this.language.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FinishWithLanguage(language=" + this.language + ", waitTimeSec=" + this.waitTimeSec + ")";
        }

        public FinishWithLanguage(@NotNull String str, long j11) {
            this.language = str;
            this.waitTimeSec = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "title", "", LanguageSelectionViewModel.ARG_LANGS, "", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getLanguages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ButtonState", "Language", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class ViewState extends SNSViewState {

        @NotNull
        private final List<Language> languages;

        @Nullable
        private final String title;

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$ButtonState;", "", "enabled", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final /* data */ class ButtonState {
            private final boolean enabled;

            @Nullable
            private final String text;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonState)) {
                    return false;
                }
                ButtonState buttonState = (ButtonState) other;
                return this.enabled == buttonState.enabled && Intrinsics.areEqual(this.text, buttonState.text);
            }

            public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, boolean z11, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = buttonState.enabled;
                }
                if ((i11 & 2) != 0) {
                    str = buttonState.text;
                }
                return buttonState.copy(z11, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final ButtonState copy(boolean enabled, @Nullable String text) {
                return new ButtonState(enabled, text);
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.enabled) * 31;
                String str = this.text;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "ButtonState(enabled=" + this.enabled + ", text=" + this.text + ")";
            }

            public ButtonState(boolean z11, @Nullable String str) {
                this.enabled = z11;
                this.text = str;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JT\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "", "id", "", "title", "status", "time", "selected", "", "waitTimeSec", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getTitle", "getStatus", "getTime", "getSelected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWaitTimeSec", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;J)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "equals", "other", "hashCode", "", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final /* data */ class Language {

            @Nullable
            private final String id;

            @Nullable
            private final Boolean selected;

            @Nullable
            private final String status;

            @Nullable
            private final String time;

            @Nullable
            private final String title;
            private final long waitTimeSec;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Language)) {
                    return false;
                }
                Language language = (Language) other;
                return Intrinsics.areEqual(this.id, language.id) && Intrinsics.areEqual(this.title, language.title) && Intrinsics.areEqual(this.status, language.status) && Intrinsics.areEqual(this.time, language.time) && Intrinsics.areEqual(this.selected, language.selected) && this.waitTimeSec == language.waitTimeSec;
            }

            public static /* synthetic */ Language copy$default(Language language, String str, String str2, String str3, String str4, Boolean bool, long j11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = language.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = language.title;
                }
                if ((i11 & 4) != 0) {
                    str3 = language.status;
                }
                if ((i11 & 8) != 0) {
                    str4 = language.time;
                }
                if ((i11 & 16) != 0) {
                    bool = language.selected;
                }
                if ((i11 & 32) != 0) {
                    j11 = language.waitTimeSec;
                }
                long j12 = j11;
                Boolean bool2 = bool;
                String str5 = str3;
                return language.copy(str, str2, str5, str4, bool2, j12);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getTime() {
                return this.time;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Boolean getSelected() {
                return this.selected;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final long getWaitTimeSec() {
                return this.waitTimeSec;
            }

            @NotNull
            public final Language copy(@Nullable String id2, @Nullable String title, @Nullable String status, @Nullable String time, @Nullable Boolean selected, long waitTimeSec) {
                return new Language(id2, title, status, time, selected, waitTimeSec);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final Boolean getSelected() {
                return this.selected;
            }

            @Nullable
            public final String getStatus() {
                return this.status;
            }

            @Nullable
            public final String getTime() {
                return this.time;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            public final long getWaitTimeSec() {
                return this.waitTimeSec;
            }

            public int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.title;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.status;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.time;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Boolean bool = this.selected;
                return Long.hashCode(this.waitTimeSec) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "Language(id=" + this.id + ", title=" + this.title + ", status=" + this.status + ", time=" + this.time + ", selected=" + this.selected + ", waitTimeSec=" + this.waitTimeSec + ")";
            }

            public Language(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, long j11) {
                this.id = str;
                this.title = str2;
                this.status = str3;
                this.time = str4;
                this.selected = bool;
                this.waitTimeSec = j11;
            }
        }

        public ViewState(@Nullable String str, @NotNull List<Language> list) {
            super(null);
            this.title = str;
            this.languages = list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.areEqual(this.title, viewState.title) && Intrinsics.areEqual(this.languages, viewState.languages);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState copy$default(ViewState viewState, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = viewState.title;
            }
            if ((i11 & 2) != 0) {
                list = viewState.languages;
            }
            return viewState.copy(str, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Language> component2() {
            return this.languages;
        }

        @NotNull
        public final ViewState copy(@Nullable String title, @NotNull List<Language> languages) {
            return new ViewState(title, languages);
        }

        @NotNull
        public final List<Language> getLanguages() {
            return this.languages;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return this.languages.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ViewState(title=" + this.title + ", languages=" + this.languages + ")";
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$onPrepare$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel", m90122f = "LanguageSelectionViewModel.kt", m90123i = {}, m90124l = {38}, m90125m = "onPrepare", m90126n = {}, m90127s = {})
    public static final class C329281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C329281(Continuation<? super C329281> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageSelectionViewModel.this.onPrepare(this);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel$updateViewState$1", m90122f = "LanguageSelectionViewModel.kt", m90123i = {0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {66, 72, 73}, m90125m = "invokeSuspend", m90126n = {"currentLanguage", "currentLanguage", "destination$iv$iv", CmcdData.Factory.STREAM_TYPE_LIVE, "time", "currentLanguage", "destination$iv$iv", CmcdData.Factory.STREAM_TYPE_LIVE, "time"}, m90127s = {"L$0", "L$0", "L$3", "L$5", "J$0", "L$0", "L$3", "L$5", "J$0"})
    @SourceDebugExtension({"SMAP\nLanguageSelectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$updateViewState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1563#2:132\n1634#2,3:133\n*S KotlinDebug\n*F\n+ 1 LanguageSelectionViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$updateViewState$1\n*L\n67#1:132\n67#1:133,3\n*E\n"})
    public static final class C329291 extends SuspendLambda implements Function2<ViewState, Continuation<? super ViewState>, Object> {
        final /* synthetic */ C29124h $config;
        long J$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ViewState viewState, Continuation<? super ViewState> continuation) {
            return ((C329291) create(viewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329291(C29124h c29124h, Continuation<? super C329291> continuation) {
            super(2, continuation);
            this.$config = c29124h;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329291 c329291 = LanguageSelectionViewModel.this.new C329291(this.$config, continuation);
            c329291.L$0 = obj;
            return c329291;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0108  */
        /* JADX WARN: Code duplicated, block: B:24:0x0114  */
        /* JADX WARN: Code duplicated, block: B:25:0x0119  */
        /* JADX WARN: Code duplicated, block: B:28:0x012d  */
        /* JADX WARN: Code duplicated, block: B:30:0x0137  */
        /* JADX WARN: Code duplicated, block: B:34:0x0161  */
        /* JADX WARN: Code duplicated, block: B:38:0x0198  */
        /* JADX WARN: Code duplicated, block: B:41:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:42:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:45:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:46:0x01d3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0198 -> B:8:0x0057). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel.C329291.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<C29325b0> getAvailableLanguages() {
        Bundle bundle = this.args;
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList(ARG_LANGS, C29325b0.class) : bundle.getParcelableArrayList(ARG_LANGS);
        return parcelableArrayList == null ? CollectionsKt.emptyList() : parcelableArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSelectedLanguage() {
        return this.args.getString("lang", null);
    }

    private final void updateViewState(C29124h config) {
        AbstractC28073M0.updateState$default(this, false, new C329291(config, null), 1, null);
    }

    @NotNull
    public final Bundle getArgs() {
        return this.args;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @NotNull
    public ViewState getDefaultState() {
        return new ViewState("", CollectionsKt.emptyList());
    }

    @Nullable
    public final String getIdDocSetType() {
        return this.args.getString(ARG_ID_DOC_SET_TYPE, null);
    }

    public final void onItemSelected(@NotNull ViewState.Language language) {
        String id2 = language.getId();
        if (id2 == null) {
            id2 = TUIThemeManager.LANGUAGE_EN;
        }
        fireEvent(new FinishWithLanguage(id2, language.getWaitTimeSec()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    @Nullable
    public Object onPrepare(@NotNull Continuation<? super Unit> continuation) {
        C329281 c329281;
        if (continuation instanceof C329281) {
            c329281 = (C329281) continuation;
            int i11 = c329281.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c329281.label = i11 - Integer.MIN_VALUE;
            } else {
                c329281 = new C329281(continuation);
            }
        } else {
            c329281 = new C329281(continuation);
        }
        Object objM70045b = c329281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c329281.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.dataRepository;
            c329281.label = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c329281);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h != null) {
            updateViewState(c29124h);
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68956e("LanguageSelectionViewModel", "Language selection prepare error. Config missing", null);
        finishAbnormal("Language selection prepare error. Config missing");
        return Unit.INSTANCE;
    }

    public LanguageSelectionViewModel(@NotNull Bundle bundle, @NotNull InterfaceC29953a interfaceC29953a, @NotNull InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.args = bundle;
        this.dataRepository = interfaceC29984m;
    }
}
