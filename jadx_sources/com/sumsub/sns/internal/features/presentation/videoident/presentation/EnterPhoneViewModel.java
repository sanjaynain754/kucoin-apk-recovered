package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.text.Spanned;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28082W;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30069C;
import com.sumsub.sns.internal.features.domain.C30093a0;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32849a;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32851b;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32853c;
import com.sumsub.sns.internal.features.presentation.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00046789B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u0006:"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;", "Lcom/sumsub/sns/core/presentation/base/p0;", "Lcom/sumsub/sns/internal/features/domain/e;", "countriesUseCase", "Lcom/sumsub/sns/internal/features/domain/a0;", "setApplicantPhoneUseCase", "Lcom/sumsub/sns/internal/features/data/repository/common/a;", "commonRepository", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;", "dataRepository", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/sumsub/sns/internal/features/data/repository/extensions/a;", "extensionProvider", "<init>", "(Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/a0;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V", "Lcom/sumsub/sns/internal/features/data/model/common/p;", "applicant", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "strings", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;", "input", "Lcom/sumsub/sns/internal/features/domain/n;", "countryData", "", "submitInProgress", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "buildViewState", "(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "", "loadCountries", "()V", "Lcom/sumsub/sns/core/presentation/base/O;", "data", "Lkotlinx/coroutines/flow/e;", "Lcom/sumsub/sns/core/presentation/base/W;", "buildViewStateFlow", "(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;", "onSubmit", "", "getDocumentType", "()Ljava/lang/String;", "Lcom/sumsub/sns/internal/features/domain/e;", "Lcom/sumsub/sns/internal/features/domain/a0;", "Lcom/sumsub/sns/internal/features/data/repository/extensions/a;", "Lkotlinx/coroutines/flow/n;", "_submitInProgress", "Lkotlinx/coroutines/flow/n;", "_countryData", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;", "phoneNumberController", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;", "getPhoneNumberController$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;", "Companion", "SetResult", "ButtonState", "ViewState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEnterPhoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterPhoneViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel\n+ 2 SNSViewModel.kt\ncom/sumsub/sns/core/presentation/base/SNSViewModel\n*L\n1#1,161:1\n169#2,9:162\n*S KotlinDebug\n*F\n+ 1 EnterPhoneViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel\n*L\n98#1:162,9\n*E\n"})
public final class EnterPhoneViewModel extends AbstractC28142p0 {

    @NotNull
    private static final String STR_ACTION_CONTINUE = "sns_confirmation_contact_phone_beforeVideoIdent_action_continue";

    @NotNull
    private static final String STR_LOCKED_ACTION_CONTINUE = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_action_continue";

    @NotNull
    private static final String STR_LOCKED_SUBTITLE = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_subtitle";

    @NotNull
    private static final String STR_LOCKED_TITLE = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_title";

    @NotNull
    private static final String STR_SUBTITLE = "sns_confirmation_contact_phone_beforeVideoIdent_subtitle";

    @NotNull
    private static final String STR_TITLE = "sns_confirmation_contact_phone_beforeVideoIdent_title";

    @NotNull
    private final InterfaceC41669n<C30270n> _countryData;

    @NotNull
    private final InterfaceC41669n<Boolean> _submitInProgress;

    @NotNull
    private final C30156e countriesUseCase;

    @NotNull
    private final InterfaceC30000a extensionProvider;

    @NotNull
    private final C32853c phoneNumberController;

    @NotNull
    private final C30093a0 setApplicantPhoneUseCase;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;", "", "text", "", "enabled", "", "<init>", "(Ljava/lang/CharSequence;Z)V", "getText", "()Ljava/lang/CharSequence;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class ButtonState {
        private final boolean enabled;

        @Nullable
        private final CharSequence text;

        /* JADX WARN: Multi-variable type inference failed */
        public ButtonState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return Intrinsics.areEqual(this.text, buttonState.text) && this.enabled == buttonState.enabled;
        }

        public ButtonState(@Nullable CharSequence charSequence, boolean z11) {
            this.text = charSequence;
            this.enabled = z11;
        }

        public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, CharSequence charSequence, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = buttonState.text;
            }
            if ((i11 & 2) != 0) {
                z11 = buttonState.enabled;
            }
            return buttonState.copy(charSequence, z11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final ButtonState copy(@Nullable CharSequence text, boolean enabled) {
            return new ButtonState(text, enabled);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final CharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            CharSequence charSequence = this.text;
            return Boolean.hashCode(this.enabled) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            CharSequence charSequence = this.text;
            return "ButtonState(text=" + ((Object) charSequence) + ", enabled=" + this.enabled + ")";
        }

        public /* synthetic */ ButtonState(CharSequence charSequence, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : charSequence, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$SetResult;", "Lcom/sumsub/sns/core/presentation/base/r;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class SetResult implements InterfaceC28145r {

        @NotNull
        public static final SetResult INSTANCE = new SetResult();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SetResult);
        }

        @NotNull
        public String toString() {
            return "SetResult";
        }

        private SetResult() {
        }

        public int hashCode() {
            return -1778672430;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "Lcom/sumsub/sns/core/presentation/base/V;", "", "title", "subtitle", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;", "primaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;)V", "component1", "()Ljava/lang/CharSequence;", "component2", "component3", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getTitle", "getSubtitle", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;", "getPrimaryButton", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class ViewState extends AbstractC28081V {

        @Nullable
        private final ButtonState primaryButton;

        @Nullable
        private final CharSequence subtitle;

        @Nullable
        private final CharSequence title;

        public ViewState() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.areEqual(this.title, viewState.title) && Intrinsics.areEqual(this.subtitle, viewState.subtitle) && Intrinsics.areEqual(this.primaryButton, viewState.primaryButton);
        }

        public /* synthetic */ ViewState(CharSequence charSequence, CharSequence charSequence2, ButtonState buttonState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : charSequence, (i11 & 2) != 0 ? null : charSequence2, (i11 & 4) != 0 ? null : buttonState);
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, CharSequence charSequence, CharSequence charSequence2, ButtonState buttonState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = viewState.title;
            }
            if ((i11 & 2) != 0) {
                charSequence2 = viewState.subtitle;
            }
            if ((i11 & 4) != 0) {
                buttonState = viewState.primaryButton;
            }
            return viewState.copy(charSequence, charSequence2, buttonState);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ButtonState getPrimaryButton() {
            return this.primaryButton;
        }

        @NotNull
        public final ViewState copy(@Nullable CharSequence title, @Nullable CharSequence subtitle, @Nullable ButtonState primaryButton) {
            return new ViewState(title, subtitle, primaryButton);
        }

        @Nullable
        public final ButtonState getPrimaryButton() {
            return this.primaryButton;
        }

        @Nullable
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.subtitle;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            ButtonState buttonState = this.primaryButton;
            return iHashCode2 + (buttonState != null ? buttonState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CharSequence charSequence = this.title;
            CharSequence charSequence2 = this.subtitle;
            return "ViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", primaryButton=" + this.primaryButton + ")";
        }

        public ViewState(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable ButtonState buttonState) {
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.primaryButton = buttonState;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneViewModel$buildViewStateFlow$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;", "input", "Lcom/sumsub/sns/internal/features/domain/n;", "countryData", "", "submitInProgress", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "<anonymous>", "(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneViewModel$buildViewStateFlow$1", m90122f = "EnterPhoneViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329261 extends SuspendLambda implements Function4<C32849a, C30270n, Boolean, Continuation<? super ViewState>, Object> {
        final /* synthetic */ AbstractC29172p $applicant;
        final /* synthetic */ C29983l $strings;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        public final Object invoke(C32849a c32849a, C30270n c30270n, boolean z11, Continuation<? super ViewState> continuation) {
            C329261 c329261 = EnterPhoneViewModel.this.new C329261(this.$applicant, this.$strings, continuation);
            c329261.L$0 = c32849a;
            c329261.L$1 = c30270n;
            c329261.Z$0 = z11;
            return c329261.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329261(AbstractC29172p abstractC29172p, C29983l c29983l, Continuation<? super C329261> continuation) {
            super(4, continuation);
            this.$applicant = abstractC29172p;
            this.$strings = c29983l;
        }

        @Override // p852kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(C32849a c32849a, C30270n c30270n, Boolean bool, Continuation<? super ViewState> continuation) {
            return invoke(c32849a, c30270n, bool.booleanValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return EnterPhoneViewModel.this.buildViewState(this.$applicant, this.$strings, (C32849a) this.L$0, (C30270n) this.L$1, this.Z$0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneViewModel$loadCountries$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneViewModel$loadCountries$1", m90122f = "EnterPhoneViewModel.kt", m90123i = {}, m90124l = {125, 130}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329271 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C329271(Continuation<? super C329271> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EnterPhoneViewModel.this.new C329271(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329271) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        
            if (r13 == r0) goto L24;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractC29172p abstractC29172p;
            boolean zM69789c;
            Object objM70120a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        objM70120a = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                EnterPhoneViewModel enterPhoneViewModel = EnterPhoneViewModel.this;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70120a);
                if (thM103847exceptionOrNullimpl == null) {
                    EnterPhoneViewModel.this._countryData.setValue((C30270n) objM70120a);
                    return Unit.INSTANCE;
                }
                AbstractC28052C.throwError$default(enterPhoneViewModel, new C29107e0(thM103847exceptionOrNullimpl, null, null, 6), enterPhoneViewModel.getDocumentType(), false, null, 12, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EnterPhoneViewModel enterPhoneViewModel2 = EnterPhoneViewModel.this;
            this.label = 1;
            obj = enterPhoneViewModel2.getData(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            C28075O c28075o = (C28075O) obj;
            if (c28075o != null) {
                abstractC29172p = c28075o.f57269a;
            } else {
                abstractC29172p = null;
            }
            if (abstractC29172p != null) {
                C29070X.Companion.getClass();
                C29154m c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a("PHONE_VERIFICATION"));
                if (c29154mM69794a != null) {
                    zM69789c = c29154mM69794a.m69789c();
                } else {
                    zM69789c = false;
                }
            } else {
                zM69789c = false;
            }
            C30156e c30156e = EnterPhoneViewModel.this.countriesUseCase;
            this.label = 2;
            objM70120a = c30156e.m70120a(zM69789c, this);
        }
    }

    public EnterPhoneViewModel(@NotNull C30156e c30156e, @NotNull C30093a0 c30093a0, @NotNull InterfaceC29953a interfaceC29953a, @NotNull InterfaceC29984m interfaceC29984m, @NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC30000a interfaceC30000a) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.countriesUseCase = c30156e;
        this.setApplicantPhoneUseCase = c30093a0;
        this.extensionProvider = interfaceC30000a;
        this._submitInProgress = C41679x.m91009a(Boolean.FALSE);
        this._countryData = C41679x.m91009a(null);
        C29070X.Companion.getClass();
        this.phoneNumberController = new C32853c(this, savedStateHandle, C29062V.m69739a("VIDEO_IDENT"), SNSVideoIdent.logTag, new C30069C());
        loadCountries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewState buildViewState(AbstractC29172p applicant, C29983l strings, C32849a input, C30270n countryData, boolean submitInProgress) {
        this.phoneNumberController.m71352a(applicant, countryData, (CharSequence) null);
        C32851b c32851b = (C32851b) this.phoneNumberController.f57261i.getValue();
        boolean z11 = false;
        boolean z12 = c32851b != null ? c32851b.f67219c : false;
        String strM70061a = strings.m70061a(z12 ? STR_LOCKED_TITLE : STR_TITLE);
        Spanned spannedM69364a = strM70061a != null ? AbstractC28462i0.m69364a(strM70061a, ((C28547d) this.extensionProvider).f58099a.f58163a) : null;
        String strM70061a2 = strings.m70061a(z12 ? STR_LOCKED_SUBTITLE : STR_SUBTITLE);
        Spanned spannedM69364a2 = strM70061a2 != null ? AbstractC28462i0.m69364a(strM70061a2, ((C28547d) this.extensionProvider).f58099a.f58163a) : null;
        String strM70061a3 = strings.m70061a(z12 ? STR_LOCKED_ACTION_CONTINUE : STR_ACTION_CONTINUE);
        if ((input != null ? input.f67215b : false) && !submitInProgress) {
            z11 = true;
        }
        return new ViewState(spannedM69364a, spannedM69364a2, new ButtonState(strM70061a3, z11));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    @NotNull
    public InterfaceC41634e<AbstractC28082W> buildViewStateFlow(@NotNull C28075O data) {
        AbstractC29172p abstractC29172p = data.f57269a;
        if (abstractC29172p == null) {
            return C41636g.m90889M(new ViewState(null, null, null, 7, null));
        }
        C29983l c29983l = data.f57271c;
        if (c29983l != null) {
            return C41636g.m90929n(this.phoneNumberController.f67225k, this._countryData, this._submitInProgress, new C329261(abstractC29172p, c29983l, null));
        }
        return C41636g.m90889M(new ViewState(null, null, null, 7, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @NotNull
    public String getDocumentType() {
        return "VIDEO_IDENT";
    }

    @NotNull
    /* JADX INFO: renamed from: getPhoneNumberController$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final C32853c getPhoneNumberController() {
        return this.phoneNumberController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSubmit() {
        String str;
        C32849a c32849a = (C32849a) this.phoneNumberController.f67225k.getValue();
        if (c32849a == null || (str = c32849a.f67214a) == null) {
            return;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, "EnterPhoneViewModel", "Phone entered, trying to save it in applicant...", null, 4, null);
        showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1(this, null, this, str), 2, null);
    }

    private final void loadCountries() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C329271(null), 3, null);
    }
}
