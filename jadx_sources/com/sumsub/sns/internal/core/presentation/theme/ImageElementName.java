package com.sumsub.sns.internal.core.presentation.theme;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, m90084d2 = {"Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/sumsub/sns/internal/core/presentation/theme/k", "ICON_CLOSE", "ICON_SEARCH", "ICON_DISCLOSURE", "ICON_DROPDOWN", "ICON_TORCH_ON", "ICON_TORCH_OFF", "ICON_GALLERY", "ICON_MAIL", "ICON_SUCCESS", "ICON_WARNING", "ICON_FAILURE", "ICON_SUBMITTED", "ICON_ROTATE_CW", "ICON_ROTATE_CCW", "ICON_BIN", "ICON_CALENDAR", "PICTURE_SUCCESS", "PICTURE_WARNING", "PICTURE_FAILURE", "PICTURE_SUBMITTED", "VERIFICATION_STEP_ICONS", "DOCUMENT_TYPE_ICONS", "INSTRUCTIONS_IMAGES", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageElementName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageElementName.kt\ncom/sumsub/sns/internal/core/presentation/theme/ImageElementName\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n11228#2:36\n11563#2,3:37\n*S KotlinDebug\n*F\n+ 1 ImageElementName.kt\ncom/sumsub/sns/internal/core/presentation/theme/ImageElementName\n*L\n31#1:36\n31#1:37,3\n*E\n"})
public enum ImageElementName {
    ICON_CLOSE("iconClose"),
    ICON_SEARCH("iconSearch"),
    ICON_DISCLOSURE("iconDisclosure"),
    ICON_DROPDOWN("iconDropdown"),
    ICON_TORCH_ON("iconTorchOn"),
    ICON_TORCH_OFF("iconTorchOff"),
    ICON_GALLERY("iconGallery"),
    ICON_MAIL("iconMail"),
    ICON_SUCCESS("iconSuccess"),
    ICON_WARNING("iconWarning"),
    ICON_FAILURE("iconFailure"),
    ICON_SUBMITTED("iconSubmitted"),
    ICON_ROTATE_CW("iconRotateCW"),
    ICON_ROTATE_CCW("iconRotateCCW"),
    ICON_BIN("iconBin"),
    ICON_CALENDAR("iconCalendar"),
    PICTURE_SUCCESS("pictureSuccess"),
    PICTURE_WARNING("pictureWarning"),
    PICTURE_FAILURE("pictureFailure"),
    PICTURE_SUBMITTED("pictureSubmitted"),
    VERIFICATION_STEP_ICONS("verificationStepIcons"),
    DOCUMENT_TYPE_ICONS("documentTypeIcons"),
    INSTRUCTIONS_IMAGES("instructionsImages");


    @NotNull
    private static final List<String> names;

    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C28963k Companion = new Object() { // from class: com.sumsub.sns.internal.core.presentation.theme.k
    };

    /* JADX WARN: Type inference failed for: r0v25, types: [com.sumsub.sns.internal.core.presentation.theme.k] */
    static {
        ImageElementName[] imageElementNameArrValues = values();
        ArrayList arrayList = new ArrayList(imageElementNameArrValues.length);
        for (ImageElementName imageElementName : imageElementNameArrValues) {
            arrayList.add(imageElementName.value);
        }
        names = arrayList;
    }

    @NotNull
    public static EnumEntries<ImageElementName> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    ImageElementName(String str) {
        this.value = str;
    }
}
