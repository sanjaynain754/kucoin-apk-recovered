package com.jumio.core.processor.challenge;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.ExposureLevel;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.LensDistance;
import com.jumio.commons.camera.Size;
import com.jumio.commons.camera.WhiteBalance;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.processor.MultiImageProcessorBase;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.toolkit.DefaultToolkitProvider;
import com.jumio.core.toolkit.ToolkitInterface;
import com.jumio.core.toolkit.ToolkitProviderInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import jumio.core.AbstractC40615X;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\fH\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;", "Lcom/jumio/core/processor/MultiImageProcessorBase;", "Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;", "config", "toolkitProvider", "Lcom/jumio/core/toolkit/ToolkitProviderInterface;", "<init>", "(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;)V", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/core/processor/challenge/CameraChallengeResult;", "baseline", "Lcom/jumio/core/processor/challenge/CameraChallengeFrame;", "getBaseline", "()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;", "checkRequirements", "", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "parameterInterface", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "reset", "", "processInternal", "currentData", "processFrame", "shouldSkipHoldStill", "shouldSkipCoolDown", "createCoolDownSettings", "Lcom/jumio/commons/camera/CaptureSettings;", "brightnessSetupAchieved", "brightnessCoolDownAchieved", "focusSetupAchieved", "focusCoolDownAchieved", "whiteBalanceSetupAchieved", "whiteBalanceCoolDownAchieved", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraChallengeImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraChallengeImageProcessor.kt\ncom/jumio/core/processor/challenge/CameraChallengeImageProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,267:1\n1#2:268\n29#3,3:269\n29#3,3:272\n*S KotlinDebug\n*F\n+ 1 CameraChallengeImageProcessor.kt\ncom/jumio/core/processor/challenge/CameraChallengeImageProcessor\n*L\n117#1:269,3\n120#1:272,3\n*E\n"})
public final class CameraChallengeImageProcessor extends MultiImageProcessorBase<CameraChallengeProcessorConfig, ProcessorImage.ChallengeImage> {

    @NotNull
    public static final String BATCH_ID = "CAMERA_CHALLENGE";

    /* JADX INFO: renamed from: c */
    public final ToolkitProviderInterface f14506c;

    /* JADX INFO: renamed from: d */
    public final CameraChallengeResult f14507d;

    public /* synthetic */ CameraChallengeImageProcessor(CameraChallengeProcessorConfig cameraChallengeProcessorConfig, ToolkitProviderInterface toolkitProviderInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraChallengeProcessorConfig, (i11 & 2) != 0 ? new DefaultToolkitProvider() : toolkitProviderInterface);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0428  */
    /* JADX WARN: Code duplicated, block: B:132:0x042e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0444  */
    /* JADX WARN: Code duplicated, block: B:135:0x0457  */
    /* JADX WARN: Code duplicated, block: B:136:0x045a  */
    /* JADX WARN: Code duplicated, block: B:137:0x045d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0463  */
    /* JADX WARN: Code duplicated, block: B:142:0x0484  */
    /* JADX WARN: Code duplicated, block: B:30:0x00da  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0141  */
    /* JADX WARN: Code duplicated, block: B:78:0x027d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ab  */
    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface parameterInterface) {
        int iAverageColor$default;
        CameraChallengeFrame cameraChallengeFrame;
        float f11;
        ProcessorState applyCaptureSettings;
        CameraChallengeFrame cameraChallengeFrameM14580b;
        CameraChallengeFrame cameraChallengeFrameM14580b2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.LongRef longRef2 = new Ref.LongRef();
        double dStandardDeviationFast$default = 0.0d;
        try {
            ToolkitInterface toolkitInterfaceCreate = this.f14506c.create();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                iAverageColor$default = ToolkitInterface.averageColor$default(toolkitInterfaceCreate, bitmap, null, 2, null);
                try {
                    longRef.element = System.currentTimeMillis() - jCurrentTimeMillis;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    dStandardDeviationFast$default = ToolkitInterface.standardDeviationFast$default(toolkitInterfaceCreate, bitmap, null, 2, null);
                    longRef2.element = System.currentTimeMillis() - jCurrentTimeMillis2;
                    Unit unit = Unit.INSTANCE;
                    try {
                        AutoCloseableKt.closeFinally(toolkitInterfaceCreate, null);
                    } catch (Exception e11) {
                        e = e11;
                        Log.printStackTrace(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    double d11 = dStandardDeviationFast$default;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            AutoCloseableKt.closeFinally(toolkitInterfaceCreate, th3);
                            throw th4;
                        } catch (Exception e12) {
                            e = e12;
                            dStandardDeviationFast$default = d11;
                            Log.printStackTrace(e);
                            cameraChallengeFrame = new CameraChallengeFrame(getImage().getClassifier(), iAverageColor$default, longRef.element, dStandardDeviationFast$default, longRef2.element, getImage().getSettings(), metadata, CameraChallengeState.SETUP);
                            this.f14507d.getFrames().add(cameraChallengeFrame);
                            if (!getImageStarted()) {
                                if (getImageStarted()) {
                                    f11 = 1.0f;
                                    if (!getImageStarted()) {
                                        if (getImageStarted()) {
                                            if (!getImageStarted()) {
                                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                                cameraChallengeFrame.setSettings(m14579a());
                                                moveToNextImage();
                                            }
                                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                                getImage().getSettings().setStartChallenge(true);
                                            }
                                            startHoldStill();
                                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                        } else {
                                            if (!getImageStarted()) {
                                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                                cameraChallengeFrame.setSettings(m14579a());
                                                moveToNextImage();
                                            }
                                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                                getImage().getSettings().setStartChallenge(true);
                                            }
                                            startHoldStill();
                                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                        }
                                    } else if (getImageStarted()) {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    } else {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    }
                                } else {
                                    f11 = 1.0f;
                                    if (!getImageStarted()) {
                                        if (getImageStarted()) {
                                            if (!getImageStarted()) {
                                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                                cameraChallengeFrame.setSettings(m14579a());
                                                moveToNextImage();
                                            }
                                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                                getImage().getSettings().setStartChallenge(true);
                                            }
                                            startHoldStill();
                                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                        } else {
                                            if (!getImageStarted()) {
                                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                                cameraChallengeFrame.setSettings(m14579a());
                                                moveToNextImage();
                                            }
                                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                                getImage().getSettings().setStartChallenge(true);
                                            }
                                            startHoldStill();
                                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                        }
                                    } else if (getImageStarted()) {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    } else {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    }
                                }
                            } else if (getImageStarted()) {
                                f11 = 1.0f;
                                if (!getImageStarted()) {
                                    if (getImageStarted()) {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    } else {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    }
                                } else if (getImageStarted()) {
                                    if (!getImageStarted()) {
                                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                        cameraChallengeFrame.setSettings(m14579a());
                                        moveToNextImage();
                                    }
                                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                        getImage().getSettings().setStartChallenge(true);
                                    }
                                    startHoldStill();
                                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                } else {
                                    if (!getImageStarted()) {
                                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                        cameraChallengeFrame.setSettings(m14579a());
                                        moveToNextImage();
                                    }
                                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                        getImage().getSettings().setStartChallenge(true);
                                    }
                                    startHoldStill();
                                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                }
                            } else {
                                f11 = 1.0f;
                                if (!getImageStarted()) {
                                    if (getImageStarted()) {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    } else {
                                        if (!getImageStarted()) {
                                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                            cameraChallengeFrame.setSettings(m14579a());
                                            moveToNextImage();
                                        }
                                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                            getImage().getSettings().setStartChallenge(true);
                                        }
                                        startHoldStill();
                                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                    }
                                } else if (getImageStarted()) {
                                    if (!getImageStarted()) {
                                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                        cameraChallengeFrame.setSettings(m14579a());
                                        moveToNextImage();
                                    }
                                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                        getImage().getSettings().setStartChallenge(true);
                                    }
                                    startHoldStill();
                                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                } else {
                                    if (!getImageStarted()) {
                                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                        cameraChallengeFrame.setSettings(m14579a());
                                        moveToNextImage();
                                    }
                                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                        getImage().getSettings().setStartChallenge(true);
                                    }
                                    startHoldStill();
                                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                                }
                            }
                            setCurrentState(applyCaptureSettings);
                            return applyCaptureSettings;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                iAverageColor$default = 0;
            }
        } catch (Exception e13) {
            e = e13;
            iAverageColor$default = 0;
        }
        cameraChallengeFrame = new CameraChallengeFrame(getImage().getClassifier(), iAverageColor$default, longRef.element, dStandardDeviationFast$default, longRef2.element, getImage().getSettings(), metadata, CameraChallengeState.SETUP);
        this.f14507d.getFrames().add(cameraChallengeFrame);
        if (!getImageStarted() && ((getCurrentState() instanceof ProcessorState.TakePicture) || (getCurrentState() instanceof ProcessorState.Skip))) {
            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
            cameraChallengeFrame.setSettings(m14579a());
            startCoolDown();
            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(m14579a());
        } else if (getImageStarted() || !shouldCoolDown(getImage().getHoldStillTime())) {
            f11 = 1.0f;
            if (!getImageStarted() && getNextImage() == null) {
                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                cameraChallengeFrame.setSettings(m14579a());
                Intrinsics.checkNotNullParameter(this.f14507d, "<this>");
                Log log = Log.INSTANCE;
                LogLevel logLevel = LogLevel.OFF;
                applyCaptureSettings = new ProcessorState.Finished(BATCH_ID, this.f14507d);
            } else if (getImageStarted() || shouldStart()) {
                if (!getImageStarted()) {
                    cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                    cameraChallengeFrame.setSettings(m14579a());
                    moveToNextImage();
                }
                if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                    getImage().getSettings().setStartChallenge(true);
                }
                startHoldStill();
                applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
            } else if (shouldHoldStill(getImage().getHoldStillTime())) {
                if (getImage().getSettings().getLevel() != ExposureLevel.AUTO) {
                    CameraChallengeFrame cameraChallengeFrameM14580b3 = m14580b();
                    if (cameraChallengeFrameM14580b3 != null) {
                        int color = cameraChallengeFrameM14580b3.getColor();
                        int iBlue = (Color.blue(color) + (Color.green(color) + Color.red(color))) / 3;
                        int color2 = cameraChallengeFrame.getColor();
                        int iBlue2 = (Color.blue(color2) + (Color.green(color2) + Color.red(color2))) / 3;
                        if (this.f14507d.getCapabilities().getCanAdjustExposure()) {
                            int i11 = AbstractC40615X.f90173a[getImage().getSettings().getLevel().ordinal()];
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    if (iBlue2 < (1.0d - ((double) getImage().getSetupThreshold())) * ((double) iBlue)) {
                                    }
                                }
                            } else if (iBlue2 > (((double) getImage().getSetupThreshold()) + 1.0d) * ((double) iBlue)) {
                            }
                        }
                        if (shouldTakePicture()) {
                            setImageStarted(false);
                            cameraChallengeFrame.setState(CameraChallengeState.IMAGE_TAKEN);
                            if (((CameraChallengeProcessorConfig) getConfig()).getCameraChallengeData().f90152b) {
                                applyCaptureSettings = new ProcessorState.TakePicture(BATCH_ID, null, new Size(64, 64), 2, null);
                            } else {
                                applyCaptureSettings = ProcessorState.Skip.INSTANCE;
                            }
                        } else {
                            applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                        }
                    }
                    applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                } else if (getImage().getSettings().getDistance() != LensDistance.AUTO) {
                    CameraChallengeFrame cameraChallengeFrameM14580b4 = m14580b();
                    if (cameraChallengeFrameM14580b4 != null) {
                        double deviation = cameraChallengeFrameM14580b4.getDeviation();
                        double deviation2 = cameraChallengeFrame.getDeviation();
                        if (!this.f14507d.getCapabilities().getCanAdjustFocus() || deviation2 < (1.0d - ((double) getImage().getSetupThreshold())) * deviation) {
                            if (shouldTakePicture()) {
                                setImageStarted(false);
                                cameraChallengeFrame.setState(CameraChallengeState.IMAGE_TAKEN);
                                if (((CameraChallengeProcessorConfig) getConfig()).getCameraChallengeData().f90152b) {
                                    applyCaptureSettings = new ProcessorState.TakePicture(BATCH_ID, null, new Size(64, 64), 2, null);
                                } else {
                                    applyCaptureSettings = ProcessorState.Skip.INSTANCE;
                                }
                            } else {
                                applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                            }
                        }
                    }
                    applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                } else {
                    if (getImage().getSettings().getWhiteBalance() != WhiteBalance.AUTO && (cameraChallengeFrameM14580b = m14580b()) != null) {
                        int color3 = cameraChallengeFrameM14580b.getColor();
                        int color4 = cameraChallengeFrame.getColor();
                        if (this.f14507d.getCapabilities().getCanAdjustWhiteBalance()) {
                            float setupThreshold = getImage().getSetupThreshold();
                            int iRed = Color.red(color3);
                            int iGreen = Color.green(color3);
                            int iBlue3 = Color.blue(color3);
                            float fRed = Color.red(color4);
                            float fGreen = Color.green(color4);
                            float fBlue = Color.blue(color4);
                            float f12 = iRed;
                            float f13 = f11 - setupThreshold;
                            float f14 = setupThreshold + f11;
                            if (RangesKt.rangeTo(f12 * f13, f12 * f14).contains(Float.valueOf(fRed))) {
                                float f15 = iGreen;
                                if (RangesKt.rangeTo(f15 * f13, f15 * f14).contains(Float.valueOf(fGreen))) {
                                    float f16 = iBlue3;
                                    if (!RangesKt.rangeTo(f13 * f16, f16 * f14).contains(Float.valueOf(fBlue))) {
                                    }
                                }
                            }
                        }
                        if (shouldTakePicture()) {
                            setImageStarted(false);
                            cameraChallengeFrame.setState(CameraChallengeState.IMAGE_TAKEN);
                            if (((CameraChallengeProcessorConfig) getConfig()).getCameraChallengeData().f90152b) {
                                applyCaptureSettings = new ProcessorState.TakePicture(BATCH_ID, null, new Size(64, 64), 2, null);
                            } else {
                                applyCaptureSettings = ProcessorState.Skip.INSTANCE;
                            }
                        } else {
                            applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                        }
                    }
                    applyCaptureSettings = ProcessorState.Processing.INSTANCE;
                }
            } else if (shouldTakePicture()) {
                setImageStarted(false);
                cameraChallengeFrame.setState(CameraChallengeState.IMAGE_TAKEN);
                if (((CameraChallengeProcessorConfig) getConfig()).getCameraChallengeData().f90152b) {
                    applyCaptureSettings = new ProcessorState.TakePicture(BATCH_ID, null, new Size(64, 64), 2, null);
                } else {
                    applyCaptureSettings = ProcessorState.Skip.INSTANCE;
                }
            } else {
                applyCaptureSettings = ProcessorState.Processing.INSTANCE;
            }
        } else if (getImage().getSettings().getLevel() != ExposureLevel.AUTO) {
            CameraChallengeFrame cameraChallengeFrameM14580b5 = m14580b();
            if (cameraChallengeFrameM14580b5 != null) {
                int color5 = cameraChallengeFrameM14580b5.getColor();
                int iBlue4 = (Color.blue(color5) + (Color.green(color5) + Color.red(color5))) / 3;
                int color6 = cameraChallengeFrame.getColor();
                int iBlue5 = (Color.blue(color6) + (Color.green(color6) + Color.red(color6))) / 3;
                if (this.f14507d.getCapabilities().getCanAdjustExposure()) {
                    int i12 = AbstractC40615X.f90173a[getImage().getSettings().getLevel().ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            if (iBlue5 >= (1.0d - ((double) getImage().getCoolDownThreshold())) * ((double) iBlue4)) {
                            }
                        }
                    } else if (iBlue5 <= (((double) getImage().getCoolDownThreshold()) + 1.0d) * ((double) iBlue4)) {
                    }
                }
                f11 = 1.0f;
                if (!getImageStarted()) {
                    if (getImageStarted()) {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    } else {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    }
                } else if (getImageStarted()) {
                    if (!getImageStarted()) {
                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                        cameraChallengeFrame.setSettings(m14579a());
                        moveToNextImage();
                    }
                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                        getImage().getSettings().setStartChallenge(true);
                    }
                    startHoldStill();
                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                } else {
                    if (!getImageStarted()) {
                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                        cameraChallengeFrame.setSettings(m14579a());
                        moveToNextImage();
                    }
                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                        getImage().getSettings().setStartChallenge(true);
                    }
                    startHoldStill();
                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                }
            }
            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
            cameraChallengeFrame.setSettings(m14579a());
            applyCaptureSettings = new ProcessorState.CoolDown(getImage().getHoldStillTime());
        } else if (getImage().getSettings().getDistance() != LensDistance.AUTO) {
            CameraChallengeFrame cameraChallengeFrameM14580b6 = m14580b();
            if (cameraChallengeFrameM14580b6 != null) {
                double deviation3 = cameraChallengeFrameM14580b6.getDeviation();
                double deviation4 = cameraChallengeFrame.getDeviation();
                if (!this.f14507d.getCapabilities().getCanAdjustFocus() || deviation4 >= (1.0d - ((double) getImage().getCoolDownThreshold())) * deviation3) {
                    f11 = 1.0f;
                    if (!getImageStarted()) {
                        if (getImageStarted()) {
                            if (!getImageStarted()) {
                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                cameraChallengeFrame.setSettings(m14579a());
                                moveToNextImage();
                            }
                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                getImage().getSettings().setStartChallenge(true);
                            }
                            startHoldStill();
                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                        } else {
                            if (!getImageStarted()) {
                                cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                                cameraChallengeFrame.setSettings(m14579a());
                                moveToNextImage();
                            }
                            if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                                getImage().getSettings().setStartChallenge(true);
                            }
                            startHoldStill();
                            applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                        }
                    } else if (getImageStarted()) {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    } else {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    }
                }
            }
            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
            cameraChallengeFrame.setSettings(m14579a());
            applyCaptureSettings = new ProcessorState.CoolDown(getImage().getHoldStillTime());
        } else {
            if (getImage().getSettings().getWhiteBalance() != WhiteBalance.AUTO && (cameraChallengeFrameM14580b2 = m14580b()) != null) {
                int color7 = cameraChallengeFrameM14580b2.getColor();
                int color8 = cameraChallengeFrame.getColor();
                if (this.f14507d.getCapabilities().getCanAdjustWhiteBalance()) {
                    float coolDownThreshold = getImage().getCoolDownThreshold();
                    int iRed2 = Color.red(color7);
                    int iGreen2 = Color.green(color7);
                    int iBlue6 = Color.blue(color7);
                    float fRed2 = Color.red(color8);
                    float fGreen2 = Color.green(color8);
                    float fBlue2 = Color.blue(color8);
                    float f17 = iRed2;
                    float f18 = 1.0f - coolDownThreshold;
                    f11 = 1.0f;
                    float f19 = coolDownThreshold + 1.0f;
                    if (RangesKt.rangeTo(f17 * f18, f17 * f19).contains(Float.valueOf(fRed2))) {
                        float f21 = iGreen2;
                        if (RangesKt.rangeTo(f21 * f18, f21 * f19).contains(Float.valueOf(fGreen2))) {
                            float f22 = iBlue6;
                            if (RangesKt.rangeTo(f18 * f22, f22 * f19).contains(Float.valueOf(fBlue2))) {
                            }
                        }
                    }
                } else {
                    f11 = 1.0f;
                }
                if (!getImageStarted()) {
                    if (getImageStarted()) {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    } else {
                        if (!getImageStarted()) {
                            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                            cameraChallengeFrame.setSettings(m14579a());
                            moveToNextImage();
                        }
                        if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                            getImage().getSettings().setStartChallenge(true);
                        }
                        startHoldStill();
                        applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                    }
                } else if (getImageStarted()) {
                    if (!getImageStarted()) {
                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                        cameraChallengeFrame.setSettings(m14579a());
                        moveToNextImage();
                    }
                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                        getImage().getSettings().setStartChallenge(true);
                    }
                    startHoldStill();
                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                } else {
                    if (!getImageStarted()) {
                        cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
                        cameraChallengeFrame.setSettings(m14579a());
                        moveToNextImage();
                    }
                    if (Intrinsics.areEqual(getImage(), CollectionsKt.firstOrNull((List) getImages()))) {
                        getImage().getSettings().setStartChallenge(true);
                    }
                    startHoldStill();
                    applyCaptureSettings = new CameraChallengeProcessorState.ApplyCaptureSettings(getImage().getSettings());
                }
            }
            cameraChallengeFrame.setState(CameraChallengeState.COOL_DOWN);
            cameraChallengeFrame.setSettings(m14579a());
            applyCaptureSettings = new ProcessorState.CoolDown(getImage().getHoldStillTime());
        }
        setCurrentState(applyCaptureSettings);
        return applyCaptureSettings;
    }

    /* JADX INFO: renamed from: b */
    public final CameraChallengeFrame m14580b() {
        return (CameraChallengeFrame) CollectionsKt.getOrNull(this.f14507d.getFrames(), 0);
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public boolean checkRequirements(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        this.f14507d.setCapabilities(cameraSettings.getF13520f().copy());
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraChallengeImageProcessor(@NotNull CameraChallengeProcessorConfig config, @NotNull ToolkitProviderInterface toolkitProvider) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(toolkitProvider, "toolkitProvider");
        this.f14506c = toolkitProvider;
        this.f14507d = new CameraChallengeResult(config.getCameraChallengeData().f90153c, null, null, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final CaptureSettings m14579a() {
        if (getImage().getSettings().getLevel() != ExposureLevel.AUTO) {
            return new CaptureSettings(ExposureLevel.DEFAULT, null, null, 6, null);
        }
        if (getImage().getSettings().getDistance() != LensDistance.AUTO) {
            return new CaptureSettings(null, null, LensDistance.DEFAULT, 3, null);
        }
        if (getImage().getSettings().getWhiteBalance() != WhiteBalance.AUTO) {
            return new CaptureSettings(null, WhiteBalance.DEFAULT, null, 5, null);
        }
        return new CaptureSettings(null, null, null, 7, null);
    }

    @Override // com.jumio.core.processor.MultiImageProcessorBase, com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public void reset() {
        super.reset();
        this.f14507d.getFrames().clear();
    }
}
