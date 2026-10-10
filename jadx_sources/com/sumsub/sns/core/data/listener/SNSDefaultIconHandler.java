package com.sumsub.sns.core.data.listener;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.common.AbstractC28025a;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.internal.core.common.AbstractC28420T0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28957e;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.theme.ImageElementName;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "<init>", "()V", "Lcom/sumsub/sns/internal/features/data/model/common/X;", "", "stepIcon", "(Lcom/sumsub/sns/internal/features/data/model/common/X;)I", "Landroid/content/Context;", "context", "", "key", "Landroid/graphics/drawable/Drawable;", "onResolveIcon", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDefaultIconHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDefaultIconHandler.kt\ncom/sumsub/sns/core/data/listener/SNSDefaultIconHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public class SNSDefaultIconHandler implements SNSIconHandler {
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    @Override // com.sumsub.sns.core.data.listener.SNSIconHandler
    @Nullable
    public Drawable onResolveIcon(@NotNull Context context, @NotNull String key) {
        BitmapDrawable bitmapDrawable;
        int iStepIcon;
        Drawable drawable;
        Bitmap bitmap;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a == null) {
            bitmapDrawable = null;
        } else if (StringsKt.startsWith$default(key, "DocType/", false, 2, (Object) null)) {
            bitmapDrawable = AbstractC28233a.m69168a(c28966pM69169a, AbstractC28420T0.m69301a(StringsKt.split$default((CharSequence) StringsKt.substringAfter$default(key, "/", (String) null, 2, (Object) null), new char[]{'_'}, false, 0, 6, (Object) null)), ImageElementName.VERIFICATION_STEP_ICONS.getValue());
        } else if (StringsKt.startsWith$default(key, "default/", false, 2, (Object) null)) {
            bitmapDrawable = AbstractC28233a.m69168a(c28966pM69169a, key, ImageElementName.INSTRUCTIONS_IMAGES.getValue());
        } else if (StringsKt.startsWith$default(key, SNSIconHandler.SNSIdentityTypeIcons.IDENTITY_TYPE_PREFIX, false, 2, (Object) null)) {
            bitmapDrawable = AbstractC28233a.m69168a(c28966pM69169a, StringsKt.substringAfter$default(key, "/", (String) null, 2, (Object) null), ImageElementName.DOCUMENT_TYPE_ICONS.getValue());
        } else {
            Map map = c28966pM69169a.f58879e;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(key) : null;
            C28957e c28957e = abstractC28962j instanceof C28957e ? (C28957e) abstractC28962j : null;
            if (c28957e == null || (bitmap = c28957e.f58864d) == null) {
                bitmapDrawable = null;
            } else {
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
        }
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        if (Intrinsics.areEqual(key, "default/videoident")) {
            iStepIcon = R$drawable.sns_ic_videoident_intro_face;
        } else if (Intrinsics.areEqual(key, "default/do_idCard")) {
            iStepIcon = R$drawable.sns_ic_intro_do;
        } else if (Intrinsics.areEqual(key, "default/do_passport")) {
            iStepIcon = R$drawable.sns_ic_intro_do_passport;
        } else if (Intrinsics.areEqual(key, "default/dont_idCard")) {
            iStepIcon = R$drawable.sns_ic_intro_dont;
        } else if (Intrinsics.areEqual(key, "default/dont_passport")) {
            iStepIcon = R$drawable.sns_ic_intro_dont_passport;
        } else if (Intrinsics.areEqual(key, "default/facescan")) {
            iStepIcon = R$drawable.sns_ic_intro_liveness;
        } else if (Intrinsics.areEqual(key, "default/do_idCard_backSide")) {
            iStepIcon = R$drawable.sns_ic_intro_do_back;
        } else if (Intrinsics.areEqual(key, "default/dont_idCard_backSide")) {
            iStepIcon = R$drawable.sns_ic_intro_dont_back;
        } else {
            SNSIconHandler.SNSIdentityTypeIcons.Companion companion = SNSIconHandler.SNSIdentityTypeIcons.INSTANCE;
            if (Intrinsics.areEqual(key, companion.imageKey(SNSIconHandler.SNSIdentityTypeIcons.PASSPORT))) {
                iStepIcon = R$drawable.sns_ic_iddoc_passport;
            } else if (Intrinsics.areEqual(key, companion.imageKey(SNSIconHandler.SNSIdentityTypeIcons.DRIVERS))) {
                iStepIcon = R$drawable.sns_ic_iddoc_driving_license;
            } else if (Intrinsics.areEqual(key, companion.imageKey(SNSIconHandler.SNSIdentityTypeIcons.RESIDENCE_PERMIT))) {
                iStepIcon = R$drawable.sns_ic_iddoc_residence_permit;
            } else if (Intrinsics.areEqual(key, companion.imageKey(SNSIconHandler.SNSIdentityTypeIcons.ID_CARD))) {
                iStepIcon = R$drawable.sns_ic_iddoc_id_card;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ADD.getImageName())) {
                iStepIcon = R$drawable.sns_ic_add;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSResultIcons.SUCCESS.getImageName())) {
                iStepIcon = R$drawable.sns_ic_success;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSResultIcons.FAILURE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_fatal;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSResultIcons.SUBMITTED.getImageName())) {
                iStepIcon = R$drawable.sns_ic_submitted;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSResultIcons.WARNING.getImageName())) {
                iStepIcon = R$drawable.sns_ic_warning;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSResultIcons.INFO.getImageName())) {
                iStepIcon = R$drawable.sns_ic_info_circle;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.WARNING_OUTLINE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_warning_outline;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.CLOSE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_close;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.BACK.getImageName())) {
                iStepIcon = R$drawable.sns_ic_back;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_step_open;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.DROPDOWN.getImageName())) {
                iStepIcon = R$drawable.sns_ic_arrown_down;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.TORCH_ON.getImageName())) {
                iStepIcon = R$drawable.sns_ic_flash_on;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.INSTANT_ACTION.getImageName())) {
                iStepIcon = R$drawable.sns_ic_flash_on_filled;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName())) {
                iStepIcon = R$drawable.sns_ic_flash_off;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.GALLERY.getImageName())) {
                iStepIcon = R$drawable.sns_ic_gallery;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.INFO.getImageName())) {
                iStepIcon = R$drawable.sns_ic_info;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.MAIL.getImageName())) {
                iStepIcon = R$drawable.sns_ic_email;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.BIN.getImageName())) {
                iStepIcon = R$drawable.sns_ic_delete;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName())) {
                iStepIcon = R$drawable.sns_ic_calendar;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ATTACHMENT.getImageName())) {
                iStepIcon = R$drawable.sns_ic_add_image;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.IMAGE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_image;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.SEARCH.getImageName())) {
                iStepIcon = R$drawable.sns_ic_search;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName())) {
                iStepIcon = R$drawable.sns_ic_notify;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.TAKE_PHOTO.getImageName())) {
                iStepIcon = R$drawable.sns_ic_capture;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.LOCATION_ON.getImageName())) {
                iStepIcon = R$drawable.sns_ic_location_on_outline;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.LOCATION_OFF.getImageName())) {
                iStepIcon = R$drawable.sns_ic_location_off_outline;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.COUNTRY_OTHER.getImageName())) {
                iStepIcon = R$drawable.sns_ic_flag_placeholder;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.PICTURE_AGREEMENT.getImageName())) {
                iStepIcon = R$drawable.sns_ic_earth;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_ID.getImageName())) {
                iStepIcon = R$drawable.sns_ic_iddoc_id_card;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_HOME.getImageName())) {
                iStepIcon = R$drawable.sns_ic_iddoc_residence_permit;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_PERSONS.getImageName())) {
                iStepIcon = R$drawable.sns_ic_persons;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_LIGHT.getImageName())) {
                iStepIcon = R$drawable.sns_ic_light;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_CAMERA.getImageName())) {
                iStepIcon = R$drawable.sns_ic_camera;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_WIFI.getImageName())) {
                iStepIcon = R$drawable.sns_ic_wifi;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.WARNING.getImageName())) {
                iStepIcon = R$drawable.sns_ic_warning_triangle;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ROTATE_CW.getImageName())) {
                iStepIcon = R$drawable.sns_ic_rotate_cw;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ROTATE_CCW.getImageName())) {
                iStepIcon = R$drawable.sns_ic_rotate_ccw;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.FLIP.getImageName())) {
                iStepIcon = R$drawable.sns_flip;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.SUCCESS_CHECK.getImageName())) {
                iStepIcon = R$drawable.sns_ic_success_check;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_LAUNCH.getImageName())) {
                iStepIcon = R$drawable.sns_ic_launch;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_WORDLESS_FAILURE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_error_robot;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName())) {
                iStepIcon = R$drawable.sns_ic_success_filled;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName())) {
                iStepIcon = R$drawable.sns_ic_failure_filled;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.LOCK.getImageName())) {
                iStepIcon = R$drawable.sns_ic_lock;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.ICON_PERSON.getImageName())) {
                iStepIcon = R$drawable.sns_ic_person;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSCommonIcons.GALLERY_SMALL.getImageName())) {
                iStepIcon = R$drawable.sns_ic_gallery_small;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSEidIcons.PIN.getImageName())) {
                iStepIcon = R$drawable.sns_ic_pin;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSEidIcons.DONE.getImageName())) {
                iStepIcon = R$drawable.sns_ic_success;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSEidIcons.ID_CARD.getImageName())) {
                iStepIcon = R$drawable.sns_ic_id_hand;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSEidIcons.CAN.getImageName())) {
                iStepIcon = R$drawable.sns_ic_eid_can;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSRestrictionsIcons.VPN.getImageName())) {
                iStepIcon = R$drawable.sns_ic_restriction_vpn;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSRestrictionsIcons.DEFAULT.getImageName())) {
                iStepIcon = R$drawable.sns_ic_fatal;
            } else if (Intrinsics.areEqual(key, SNSIconHandler.SNSPaymentMethodIcons.BANK_CARD.getImageName())) {
                iStepIcon = R$drawable.sns_ic_intro_payment_methods_bank_card;
            } else if (StringsKt.startsWith$default(key, SNSIconHandler.SNSIdentityTypeIcons.IDENTITY_TYPE_PREFIX, false, 2, (Object) null)) {
                iStepIcon = R$drawable.sns_ic_iddoc_id_card;
            } else if (StringsKt.startsWith$default(key, "Flag/", false, 2, (Object) null)) {
                String strSubstringAfter$default = StringsKt.substringAfter$default(key, "/", (String) null, 2, (Object) null);
                Integer num = (Integer) AbstractC28025a.f57186a.get(strSubstringAfter$default);
                if (num != null) {
                    iStepIcon = num.intValue();
                } else {
                    int i11 = AbstractC28025a.f57187b;
                    Logger.DefaultImpls.e$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Unknown flag: " + strSubstringAfter$default, null, 4, null);
                    iStepIcon = i11;
                }
            } else {
                iStepIcon = StringsKt.startsWith$default(key, "DocType/", false, 2, (Object) null) ? stepIcon(new C29070X(StringsKt.substringAfter$default(key, "/", (String) null, 2, (Object) null))) : -1;
            }
        }
        Integer numValueOf = Integer.valueOf(iStepIcon);
        if (iStepIcon == -1) {
            numValueOf = null;
        }
        if (numValueOf == null || (drawable = ResourcesCompat.getDrawable(context.getResources(), numValueOf.intValue(), context.getTheme())) == null) {
            return null;
        }
        DrawableCompat.applyTheme(drawable, context.getTheme());
        return drawable;
    }

    private final int stepIcon(C29070X c29070x) {
        if (c29070x.m69747d()) {
            return R$drawable.sns_ic_step_identity;
        }
        if (c29070x.m69748e()) {
            return R$drawable.sns_ic_step_poa;
        }
        if (c29070x.m69749f()) {
            return R$drawable.sns_ic_step_selfie;
        }
        if (c29070x.m69746c()) {
            return R$drawable.sns_ic_step_applicant_data;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "QUESTIONNAIRE", false, 2, (Object) null)) {
            return R$drawable.sns_ic_step_questionnaire;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "PHONE_VERIFICATION", false, 2, (Object) null)) {
            return R$drawable.sns_ic_step_phone;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "EMAIL_VERIFICATION", false, 2, (Object) null)) {
            return R$drawable.sns_ic_step_email;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "E_KYC", false, 2, (Object) null)) {
            return R$drawable.sns_ic_step_ekyc;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "VIDEO_IDENT", false, 2, (Object) null)) {
            return R$drawable.sns_ic_step_video_ident;
        }
        if (StringsKt.startsWith$default(c29070x.f59014a, "E_SIGN", false, 2, (Object) null)) {
            return R$drawable.sns_ic_sign;
        }
        return R$drawable.sns_ic_step_identity;
    }
}
