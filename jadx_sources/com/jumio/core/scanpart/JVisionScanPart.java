package com.jumio.core.scanpart;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.CameraCapabilities;
import com.jumio.commons.camera.CameraManagerInterface;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageDataInterface;
import com.jumio.commons.camera.MeteringConfig;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.C9301R;
import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.ServiceLocator;
import com.jumio.core.api.calls.UploadCall;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.camera.CameraDataInterface;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.camera.CameraDataResult;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.camera.DefaultCameraData;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.error.Error;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.gui.DrawView;
import com.jumio.core.handler.CheckHandler;
import com.jumio.core.interfaces.ConfirmationInterface;
import com.jumio.core.interfaces.UsabilityInterface;
import com.jumio.core.model.InvokeOnUiThread;
import com.jumio.core.model.StaticModel;
import com.jumio.core.model.SubscriberWithUpdate;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.network.ApiCall;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.ExtractionPlugin;
import com.jumio.core.scanpart.JVisionScanPart;
import com.jumio.core.views.CameraScanView;
import com.jumio.core.views.EnumC9313a;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.enums.JumioFlashState;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import com.jumio.sdk.handler.JumioRejectHandler;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.views.JumioAnimationView;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jumio.core.AbstractC40513C1;
import jumio.core.AbstractC40612W1;
import jumio.core.AbstractC40755y2;
import jumio.core.C40617X1;
import jumio.core.C40622Y1;
import jumio.core.C40627Z1;
import jumio.core.C40633a2;
import jumio.core.C40635a4;
import jumio.core.C40639b2;
import jumio.core.C40645c2;
import jumio.core.C40650d2;
import jumio.core.C40655e2;
import jumio.core.C40711p3;
import jumio.core.C40726s3;
import jumio.core.C40754y1;
import jumio.core.InterfaceC40643c0;
import jumio.core.InterfaceC40671h3;
import jumio.core.InterfaceC40702o;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b2\u00020\u000bB-\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010u\u001a\u0004\u0018\u00010!2\u0006\u0010X\u001a\u00020vH\u0016J\b\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u00020{H\u0016J\b\u0010|\u001a\u00020xH\u0016J\b\u0010}\u001a\u00020xH\u0016J\b\u0010~\u001a\u00020xH\u0016J\u0011\u0010\u007f\u001a\u00020x2\u0007\u0010\u0080\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u0081\u0001\u001a\u00020xH\u0002J\t\u0010\u0082\u0001\u001a\u00020xH\u0002J\u0013\u0010\u0083\u0001\u001a\u00020x2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\u0013\u0010\u0086\u0001\u001a\u00020x2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020x2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020x2\u0007\u0010\u008d\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u000207H\u0016J\t\u0010\u008f\u0001\u001a\u000207H\u0016J\u0012\u0010\u0090\u0001\u001a\u00020x2\u0007\u0010\u0091\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u0092\u0001\u001a\u00020x2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0016J\u0015\u0010\u0095\u0001\u001a\u00020x2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0016J\t\u0010\u0096\u0001\u001a\u00020xH\u0016J\u0015\u0010\u0097\u0001\u001a\u00020x2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\u0013\u0010\u009a\u0001\u001a\u00020x2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0016J\t\u0010\u009d\u0001\u001a\u00020xH\u0016J\u0011\u0010\u009e\u0001\u001a\u00020x2\u0006\u0010r\u001a\u00020\u001fH\u0016J\u0016\u0010\u009f\u0001\u001a\u00020x2\u000b\u0010 \u0001\u001a\u0006\u0012\u0002\b\u00030=H\u0016J\u0016\u0010¡\u0001\u001a\u00020\u00172\u000b\u0010 \u0001\u001a\u0006\u0012\u0002\b\u00030=H\u0016J&\u0010¢\u0001\u001a\u00020x2\u001b\u0010£\u0001\u001a\u0016\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020x0¤\u0001H\u0016J\t\u0010¦\u0001\u001a\u00020xH\u0016J\u0014\u0010§\u0001\u001a\u00020x2\t\u0010¨\u0001\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010©\u0001\u001a\u00020x2\t\b\u0002\u0010ª\u0001\u001a\u00020\u0017H\u0004J\u0013\u0010«\u0001\u001a\u00020x2\b\u0010¬\u0001\u001a\u00030\u0099\u0001H\u0017J\u0016\u0010\u00ad\u0001\u001a\u00020x2\u000b\u0010®\u0001\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\u001e\u0010¯\u0001\u001a\u00020x2\b\u0010°\u0001\u001a\u00030±\u00012\t\b\u0002\u0010²\u0001\u001a\u00020\u0017H\u0014J\u0013\u0010³\u0001\u001a\u00020x2\b\u0010´\u0001\u001a\u00030µ\u0001H\u0014J\u0013\u0010¶\u0001\u001a\u00020x2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0014J\u0013\u0010¹\u0001\u001a\u00020x2\b\u0010º\u0001\u001a\u00030»\u0001H\u0002J\u0013\u0010¼\u0001\u001a\u00020x2\b\u0010º\u0001\u001a\u00030»\u0001H\u0002J-\u0010½\u0001\u001a\u00030¾\u00012\u0007\u0010¿\u0001\u001a\u00028\u00002\b\u0010¨\u0001\u001a\u00030À\u00012\b\u0010Á\u0001\u001a\u00030Â\u0001H\u0014¢\u0006\u0003\u0010Ã\u0001J\u0016\u0010Ä\u0001\u001a\u00020x2\u000b\u0010®\u0001\u001a\u0006\u0012\u0002\b\u00030\tH\u0004J.\u0010Å\u0001\u001a\u00020x2\n\u0010¨\u0001\u001a\u0005\u0018\u00010Æ\u00012\f\b\u0002\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u00012\t\b\u0002\u0010ª\u0001\u001a\u00020\u0017H\u0014J\t\u0010É\u0001\u001a\u00020xH\u0014J\t\u0010Ê\u0001\u001a\u00020xH\u0002J\u0014\u0010Ë\u0001\u001a\u00030Ì\u00012\b\u0010¨\u0001\u001a\u00030Æ\u0001H\u0002J\u0013\u0010Í\u0001\u001a\u00020x2\b\u0010¨\u0001\u001a\u00030Æ\u0001H\u0014J\u0013\u0010Î\u0001\u001a\u00020x2\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0004J\u001d\u0010Ñ\u0001\u001a\u00020x2\b\u0010Ò\u0001\u001a\u00030À\u00012\b\u0010Á\u0001\u001a\u00030Â\u0001H\u0002J\t\u0010Ó\u0001\u001a\u00020xH\u0014J!\u0010Ô\u0001\u001a\u00020x2\f\u0010Õ\u0001\u001a\u0007\u0012\u0002\b\u00030Ö\u00012\b\u0010×\u0001\u001a\u00030Ø\u0001H\u0014J#\u0010§\u0001\u001a\u00020x2\f\u0010Õ\u0001\u001a\u0007\u0012\u0002\b\u00030Ö\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010Ù\u0001H\u0016J*\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Û\u00010\u00112\f\u0010Õ\u0001\u001a\u0007\u0012\u0002\b\u00030Ö\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010Ü\u0001H\u0004J\u0018\u0010Ý\u0001\u001a\u0011\u0012\u0005\u0012\u00030¥\u0001\u0012\u0005\u0012\u00030Ø\u00010Þ\u0001H\u0014J\u0018\u0010ß\u0001\u001a\u0011\u0012\u0005\u0012\u00030¥\u0001\u0012\u0005\u0012\u00030Ð\u00010Þ\u0001H\u0014J\t\u0010à\u0001\u001a\u00020xH\u0004J!\u0010á\u0001\u001a\u00020x2\u0016\u0010â\u0001\u001a\u0011\u0012\u0005\u0012\u00030¥\u0001\u0012\u0005\u0012\u00030Ø\u00010Þ\u0001H\u0014J#\u0010«\u0001\u001a\u00020x2\f\u0010Õ\u0001\u001a\u0007\u0012\u0002\b\u00030Ö\u00012\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\t\u0010ã\u0001\u001a\u00020xH\u0002J\t\u0010ä\u0001\u001a\u00020xH\u0014J\t\u0010å\u0001\u001a\u00020xH\u0002J\u0011\u0010æ\u0001\u001a\u00020x2\u0006\u0010&\u001a\u00020'H\u0014J\n\u0010ç\u0001\u001a\u00030è\u0001H\u0002J\u000b\u0010é\u0001\u001a\u0004\u0018\u00010'H\u0002J\t\u0010ê\u0001\u001a\u00020xH\u0004J\t\u0010ë\u0001\u001a\u00020xH\u0004J\u000b\u0010ì\u0001\u001a\u0004\u0018\u00010-H\u0002J\u000b\u0010í\u0001\u001a\u0004\u0018\u00010-H\u0002J\t\u0010î\u0001\u001a\u00020xH\u0004R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0002038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010=X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR&\u0010B\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0CX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR&\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030R0Q0P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u001aR\u0014\u0010V\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u001aR\u0014\u0010X\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010\u001a\"\u0004\b^\u0010\u001cR\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020`0PX\u0096\u0004¢\u0006\n\n\u0002\u0010c\u001a\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020`X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u001aR\u0016\u0010i\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u001aR\u0014\u0010o\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u001aR\u0014\u0010p\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bq\u0010\u001aR\u0016\u0010r\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006ï\u0001"}, m90084d2 = {"Lcom/jumio/core/scanpart/JVisionScanPart;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/models/ScanPartModel;", "Lcom/jumio/core/scanpart/MultiScanPart;", "Lcom/jumio/core/interfaces/CameraScanPartInterface;", "Lcom/jumio/core/gui/DrawView$DrawViewInterface;", "Lcom/jumio/core/interfaces/BrandColorInterface;", "Lcom/jumio/core/interfaces/RejectInterface;", "Lcom/jumio/core/model/SubscriberWithUpdate;", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "Lcom/jumio/core/model/StaticModel;", "Lcom/jumio/core/network/ApiBinding;", "controller", "Lcom/jumio/core/Controller;", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPartModelList", "", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Ljava/util/List;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V", "value", "", "previewPaused", "getPreviewPaused", "()Z", "setPreviewPaused", "(Z)V", "scanViewReference", "Ljava/lang/ref/WeakReference;", "Lcom/jumio/core/views/CameraScanView;", "plugin", "Lcom/jumio/core/plugins/ExtractionPlugin;", "getPlugin", "()Lcom/jumio/core/plugins/ExtractionPlugin;", "setPlugin", "(Lcom/jumio/core/plugins/ExtractionPlugin;)V", "extractionClient", "Lcom/jumio/core/extraction/ExtractionClient;", "getExtractionClient", "()Lcom/jumio/core/extraction/ExtractionClient;", "setExtractionClient", "(Lcom/jumio/core/extraction/ExtractionClient;)V", "overlay", "Lcom/jumio/core/overlay/Overlay;", "getOverlay", "()Lcom/jumio/core/overlay/Overlay;", "setOverlay", "(Lcom/jumio/core/overlay/Overlay;)V", "settingsModel", "Lcom/jumio/core/models/SettingsModel;", "getSettingsModel", "()Lcom/jumio/core/models/SettingsModel;", "numOfRetries", "", "getNumOfRetries", "()I", "setNumOfRetries", "(I)V", "internalCheckHandler", "Lcom/jumio/core/handler/CheckHandler;", "getInternalCheckHandler", "()Lcom/jumio/core/handler/CheckHandler;", "setInternalCheckHandler", "(Lcom/jumio/core/handler/CheckHandler;)V", "savedImages", "", "", "", "Lcom/jumio/core/scanpart/SaveImageJob;", "getSavedImages", "()Ljava/util/Map;", "cameraData", "Lcom/jumio/core/camera/CameraDataInterface;", "getCameraData", "()Lcom/jumio/core/camera/CameraDataInterface;", "setCameraData", "(Lcom/jumio/core/camera/CameraDataInterface;)V", "bindingClasses", "", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiCall;", "getBindingClasses", "()[Ljava/lang/Class;", "isCancelable", "hasFallback", "getHasFallback", "scanMode", "Lcom/jumio/sdk/enums/JumioScanMode;", "getScanMode", "()Lcom/jumio/sdk/enums/JumioScanMode;", "enableExtraction", "getEnableExtraction", "setEnableExtraction", "supportedFacing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "getSupportedFacing", "()[Lcom/jumio/sdk/enums/JumioCameraFacing;", "[Lcom/jumio/sdk/enums/JumioCameraFacing;", "defaultFacing", "getDefaultFacing", "()Lcom/jumio/sdk/enums/JumioCameraFacing;", "extraction", "getExtraction", "previewSize", "Lcom/jumio/commons/camera/Size;", "getPreviewSize", "()Lcom/jumio/commons/camera/Size;", "showShutterButton", "getShowShutterButton", "isBrandingEnabled", "shouldUseShader", "getShouldUseShader", "scanView", "getScanView", "()Lcom/jumio/core/views/CameraScanView;", "getExtractionPlugin", "Lcom/jumio/core/data/ScanMode;", "start", "", "retry", "reason", "Lcom/jumio/sdk/retry/JumioRetryReason;", "finish", "cancel", "restore", "persist", InterfaceC33730j9.f70350a, "configure", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getHelpAnimation", "animationView", "Lcom/jumio/sdk/views/JumioAnimationView;", "addChildren", "rootview", "Landroid/view/ViewGroup;", "onDrawViewDraw", "canvas", "Landroid/graphics/Canvas;", "onDrawViewMeasure", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "getPreferredBrandTextColor", "isPresented", "presented", "feedFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "captureFrame", "cameraAvailable", "cameraError", "t", "", "onPreviewAvailable", "properties", "Lcom/jumio/commons/camera/CameraSettings;", "takePicture", "setScanView", "setCheckHandler", "checkHandler", "isSupportedCheckHandler", "fillCheckHandler", "addImagePath", "Lkotlin/Function2;", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "reject", "onResult", DbParams.KEY_CHANNEL_RESULT, "nextPartOrProcess", "vibrate", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onUpdate", "update", "handleFlash", "flashState", "Lcom/jumio/sdk/enums/JumioFlashState;", "blockSwitchCamera", "triggerMetering", "meteringConfig", "Lcom/jumio/commons/camera/MeteringConfig;", "handleChallenge", "captureSettings", "Lcom/jumio/commons/camera/CaptureSettings;", "onEnable", "program", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "onRender", "getFileDataForResolution", "Lcom/jumio/core/data/scan/FileDataInterface;", "scanPartModel", "Lcom/jumio/core/extraction/result/ImageExtractionResult;", "uploadResolution", "Lcom/jumio/core/enums/UploadResolution;", "(Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/core/extraction/result/ImageExtractionResult;Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/core/data/scan/FileDataInterface;", "handleFallback", "handleShotTaken", "Lcom/jumio/core/extraction/result/ExtractionResult;", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "initCameraData", "clearPendingUserActionOverrides", "launchUploadForClassifier", "Lkotlinx/coroutines/Job;", "uploadExtractionResult", "addCameraData", "imageData", "Lcom/jumio/commons/camera/ImageDataInterface;", "handleSaveImage", "imageResult", "handleProcessing", "handleUploadOrUsabilityResult", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "", "getUsabilityResultKeys", "Lcom/jumio/core/scanpart/ResultKeyItem;", "Lorg/json/JSONObject;", "getRejectedModels", "", "getRejectedImages", "processUsabilityResults", "handleUsabilityReject", "rejectedModels", "reportFramePerformance", "retryScanParts", "getExtractionClientAndOverlayFromPlugin", "configureExtractionClient", "checkHighResolutionSupport", "Lcom/jumio/core/models/UploadSettingsModel;", "initExtractionClient", "destroyExtractionClient", "destroyOverlay", "configureOverlay", "drawOverlay", "initExtractionAndOverlay", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJVisionScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JVisionScanPart.kt\ncom/jumio/core/scanpart/JVisionScanPart\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,925:1\n381#2,7:926\n381#2,7:936\n462#2:984\n412#2:985\n477#2:990\n423#2:991\n216#3,2:933\n1#4:935\n1#4:955\n1#4:968\n1#4:981\n1863#5,2:943\n1611#5,9:945\n1863#5:954\n1864#5:956\n1620#5:957\n1611#5,9:958\n1863#5:967\n1864#5:969\n1620#5:970\n1611#5,9:971\n1863#5:980\n1864#5:982\n1620#5:983\n1246#5,4:986\n1246#5,4:992\n774#5:996\n865#5,2:997\n1863#5,2:999\n*S KotlinDebug\n*F\n+ 1 JVisionScanPart.kt\ncom/jumio/core/scanpart/JVisionScanPart\n*L\n112#1:926,7\n694#1:936,7\n802#1:984\n802#1:985\n803#1:990\n803#1:991\n386#1:933,2\n754#1:955\n765#1:968\n773#1:981\n728#1:943,2\n754#1:945,9\n754#1:954\n754#1:956\n754#1:957\n765#1:958,9\n765#1:967\n765#1:969\n765#1:970\n773#1:971,9\n773#1:980\n773#1:982\n773#1:983\n802#1:986,4\n803#1:992,4\n828#1:996\n828#1:997,2\n829#1:999,2\n*E\n"})
public abstract class JVisionScanPart<T extends ScanPartModel> extends AbstractC40755y2 implements InterfaceC40643c0, DrawView.DrawViewInterface, InterfaceC40702o, InterfaceC40671h3, SubscriberWithUpdate<ExtractionUpdateInterface<?>, StaticModel>, ApiBinding {

    /* JADX INFO: renamed from: j */
    public WeakReference f14531j;

    /* JADX INFO: renamed from: k */
    public ExtractionPlugin f14532k;

    /* JADX INFO: renamed from: l */
    public ExtractionClient f14533l;

    /* JADX INFO: renamed from: m */
    public Overlay f14534m;

    /* JADX INFO: renamed from: n */
    public int f14535n;

    /* JADX INFO: renamed from: o */
    public CheckHandler f14536o;

    /* JADX INFO: renamed from: p */
    public final LinkedHashMap f14537p;

    /* JADX INFO: renamed from: q */
    public CameraDataInterface f14538q;

    /* JADX INFO: renamed from: r */
    public final JumioCameraFacing[] f14539r;

    /* JADX INFO: renamed from: s */
    public final JumioCameraFacing f14540s;

    /* JADX INFO: renamed from: a */
    public final void m14584a() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient == null || !extractionClient.getF13859q()) {
            return;
        }
        ScanPart.sendScanStep$default(this, JumioScanStep.SCAN_VIEW, null, null, 6, null);
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            overlay.setVisible(0);
        }
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public boolean getHasFallback() {
        return false;
    }

    @Override // jumio.core.InterfaceC40643c0
    public boolean getShouldUseShader() {
        return false;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public boolean isCancelable() {
        return true;
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    @InvokeOnUiThread(true)
    public void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.cancel();
        }
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.stopPreview$jumio_core_release(true);
        }
        getModelData().put("previewPaused", Boolean.TRUE);
        Controller.onError$default(getF14541a(), error, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVisionScanPart(@NotNull Controller controller, @NotNull JumioCredential credential, @NotNull List<? extends T> scanPartModelList, @NotNull JumioScanPartInterface scanPartInterface) {
        super(controller, credential, scanPartModelList, scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModelList, "scanPartModelList");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f14537p = new LinkedHashMap();
        JumioCameraFacing jumioCameraFacing = JumioCameraFacing.BACK;
        this.f14539r = new JumioCameraFacing[]{jumioCameraFacing, JumioCameraFacing.FRONT};
        this.f14540s = jumioCameraFacing;
        Log.m14461d("init called");
        ExtractionPlugin extractionPlugin = getExtractionPlugin(getScanPartModel().getF14313b());
        if (extractionPlugin != null) {
            Overlay overlay = extractionPlugin.getOverlay(getF14541a().getF13601b());
            overlay.setScanPart(getScanPartModel());
            this.f14534m = overlay;
            ExtractionClient extractionClient = extractionPlugin.getExtractionClient(getF14541a());
            configureExtractionClient(extractionClient);
            this.f14533l = extractionClient;
        } else {
            extractionPlugin = null;
        }
        this.f14532k = extractionPlugin;
    }

    /* JADX INFO: renamed from: d */
    public static final CameraDataInterface m14583d() {
        return new DefaultCameraData();
    }

    public static /* synthetic */ void handleFlash$default(JVisionScanPart jVisionScanPart, JumioFlashState jumioFlashState, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleFlash");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        jVisionScanPart.handleFlash(jumioFlashState, z11);
    }

    public static /* synthetic */ void handleShotTaken$default(JVisionScanPart jVisionScanPart, ExtractionResult extractionResult, MetaInfo metaInfo, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleShotTaken");
        }
        if ((i11 & 2) != 0) {
            metaInfo = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        jVisionScanPart.handleShotTaken(extractionResult, metaInfo, z11);
    }

    public static /* synthetic */ void nextPartOrProcess$default(JVisionScanPart jVisionScanPart, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextPartOrProcess");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        jVisionScanPart.nextPartOrProcess(z11);
    }

    public final void addCameraData(@NotNull ImageDataInterface imageData) {
        CameraDataModel model;
        CameraDataResult result;
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        CameraDataInterface cameraDataInterface = this.f14538q;
        if (cameraDataInterface == null || (result = cameraDataInterface.getResult()) == null) {
            model = null;
        } else {
            Long timestamp = imageData.getTimestamp();
            model = result.getModel(timestamp != null ? timestamp.longValue() : 0L);
        }
        imageData.setCameraDataModel(model);
    }

    @Override // com.jumio.core.gui.DrawView.DrawViewInterface
    public void addChildren(@NotNull ViewGroup rootview) {
        Intrinsics.checkNotNullParameter(rootview, "rootview");
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            overlay.addViews(rootview);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14586b() {
        CameraScanView scanView;
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            ExtractionClient extractionClient = this.f14533l;
            if (extractionClient != null) {
                Rect rect = extractionClient.getF13860r().getF13516b().toRect();
                if (!extractionClient.getF13861s().isEmpty() && !rect.isEmpty()) {
                    overlay.calculate(extractionClient.getF13860r(), extractionClient.getF13861s());
                }
            }
            CameraScanView scanView2 = getScanView();
            if (scanView2 == null) {
                return;
            }
            DrawView f14586c = scanView2.getF14586c();
            if (f14586c != null) {
                overlay.addViews(f14586c);
            }
            Overlay overlay2 = this.f14534m;
            if (overlay2 == null || (scanView = getScanView()) == null) {
                return;
            }
            overlay2.prepareDraw(scanView.getCameraFacing() == JumioCameraFacing.FRONT);
            getF14541a().getF13607h().postOnMain(new C40617X1(scanView, null));
        }
    }

    @Override // jumio.core.InterfaceC40643c0
    public void captureFrame(@Nullable Frame frame) {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.capture(frame);
        }
    }

    public void configureExtractionClient(@NotNull ExtractionClient extractionClient) {
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        extractionClient.subscribe(this);
        extractionClient.configure(getF14541a().getF13603d(), getScanPartModel());
    }

    public final void destroyExtractionClient() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.setDataExtraction(false);
            extractionClient.unsubscribe(this);
            extractionClient.destroy();
        }
    }

    public final void destroyOverlay() {
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            overlay.destroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14588e() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.cancel();
            if (!extractionClient.getF13859q()) {
                onError(new Error(ErrorCase.OCR_LOADING_FAILED, 0, 0, 6, null));
                return;
            }
            CameraScanView scanView = getScanView();
            if (scanView != null) {
                extractionClient.setCameraSettings(scanView.getF14591h());
                extractionClient.setExtractionArea(scanView.getF14591h().getF13516b().toRect());
            }
            extractionClient.reinit();
            extractionClient.setDataExtraction(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14589f() {
        C40754y1 framePerformance;
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            String simpleName = extractionClient.getClass().getSimpleName();
            ExtractionClient extractionClient2 = this.f14533l;
            if (extractionClient2 == null || (framePerformance = extractionClient2.getFramePerformance()) == null) {
                return;
            }
            MetaInfo metaInfo = new MetaInfo();
            metaInfo.put("frameRate", MapsKt.mapOf(TuplesKt.m90091to("min", Integer.valueOf(framePerformance.f90483b)), TuplesKt.m90091to("mean", Integer.valueOf(framePerformance.f90482a))));
            Analytics.INSTANCE.add(MobileEvents.performance(simpleName, metaInfo));
        }
    }

    @Override // jumio.core.InterfaceC40643c0
    public void feedFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        CameraDataInterface cameraDataInterface = this.f14538q;
        if (cameraDataInterface != null) {
            cameraDataInterface.sendFrame(frame);
        }
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.feed(frame);
        }
    }

    public void fillCheckHandler(@NotNull Function2<? super JumioCredentialPart, ? super String, Unit> addImagePath) {
        Intrinsics.checkNotNullParameter(addImagePath, "addImagePath");
        for (Map.Entry<JumioCredentialPart, ImageDataInterface> entry : getRejectedImages().entrySet()) {
            addImagePath.invoke(entry.getKey(), entry.getValue().getData());
        }
    }

    @NotNull
    public Class<? extends ApiCall<?>>[] getBindingClasses() {
        return new Class[]{UploadCall.class, UsabilityCall.class};
    }

    @Nullable
    /* JADX INFO: renamed from: getCameraData, reason: from getter */
    public final CameraDataInterface getF14538q() {
        return this.f14538q;
    }

    @NotNull
    /* JADX INFO: renamed from: getDefaultFacing, reason: from getter */
    public JumioCameraFacing getF14540s() {
        return this.f14540s;
    }

    @Override // jumio.core.InterfaceC40643c0
    public boolean getEnableExtraction() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            return extractionClient.getDataExtraction();
        }
        return false;
    }

    public boolean getExtraction() {
        ExtractionClient extractionClient = this.f14533l;
        return extractionClient != null && extractionClient.getDataExtraction();
    }

    @Nullable
    /* JADX INFO: renamed from: getExtractionClient, reason: from getter */
    public final ExtractionClient getF14533l() {
        return this.f14533l;
    }

    @Nullable
    public ExtractionPlugin getExtractionPlugin(@NotNull ScanMode scanMode) {
        Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        return (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode));
    }

    @NotNull
    public FileDataInterface getFileDataForResolution(@NotNull T scanPartModel, @NotNull ImageExtractionResult result, @NotNull UploadResolution uploadResolution) {
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(uploadResolution, "uploadResolution");
        return scanPartModel.getF14314c();
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void getHelpAnimation(@NotNull JumioAnimationView animationView) {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
    }

    @Nullable
    public final CheckHandler<?> getInternalCheckHandler() {
        return this.f14536o;
    }

    /* JADX INFO: renamed from: getNumOfRetries, reason: from getter */
    public final int getF14535n() {
        return this.f14535n;
    }

    @Nullable
    /* JADX INFO: renamed from: getOverlay, reason: from getter */
    public final Overlay getF14534m() {
        return this.f14534m;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlugin, reason: from getter */
    public final ExtractionPlugin getF14532k() {
        return this.f14532k;
    }

    public int getPreferredBrandTextColor() {
        return C9301R.color.jumio_white_alpha50;
    }

    @Override // jumio.core.InterfaceC40643c0
    @Nullable
    public Size getPreviewSize() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            return extractionClient.getPreferredPreviewSize();
        }
        return null;
    }

    @NotNull
    public final Map<String, List<C40726s3>> getSavedImages() {
        return this.f14537p;
    }

    @Nullable
    public CameraScanView getScanView() {
        WeakReference weakReference = this.f14531j;
        if (weakReference != null) {
            return (CameraScanView) weakReference.get();
        }
        return null;
    }

    @Override // jumio.core.InterfaceC40643c0
    public boolean getShowShutterButton() {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            return extractionClient.takePictureManually();
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getSupportedFacing, reason: from getter */
    public JumioCameraFacing[] getF14539r() {
        return this.f14539r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<C40711p3> getUsabilityResultKeys(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable JSONObject result) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!(this instanceof UsabilityInterface)) {
            return CollectionsKt.emptyList();
        }
        if (result == null) {
            return CollectionsKt.emptyList();
        }
        JSONObject jSONObjectOptJSONObject = result.optJSONObject("usabilityResultKeys");
        if (jSONObjectOptJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        List<C40635a4> multipartItemsForResultKeys = ((UsabilityInterface) this).getMultipartItemsForResultKeys(apiCallDataModel);
        ArrayList arrayList = new ArrayList();
        for (C40635a4 c40635a4 : multipartItemsForResultKeys) {
            String strOptString = jSONObjectOptJSONObject.optString(c40635a4.f90217a);
            if (strOptString == null || strOptString.length() == 0) {
                strOptString = null;
            }
            C40711p3 c40711p3 = strOptString != null ? new C40711p3(strOptString, c40635a4.f90218b) : null;
            if (c40711p3 != null) {
                arrayList.add(c40711p3);
            }
        }
        return arrayList;
    }

    public void handleChallenge(@NotNull CaptureSettings captureSettings) {
        Intrinsics.checkNotNullParameter(captureSettings, "captureSettings");
        ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.IMAGE_ANALYSIS, null, 2, null);
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            if (captureSettings.getF13525d()) {
                scanView.enableShader$jumio_core_release(true, new C40622Y1(this), new C40627Z1(this));
                scanView.registerUserActionOverride$jumio_core_release(EnumC9313a.FOCUS);
                scanView.registerUserActionOverride$jumio_core_release(EnumC9313a.FLASH);
                scanView.registerUserActionOverride$jumio_core_release(EnumC9313a.SWITCH_CAMERA);
            }
            scanView.adjustCameraSettings$jumio_core_release(captureSettings);
        }
    }

    public final void handleFallback(@NotNull ExtractionUpdateInterface<?> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        m14589f();
        Object data = update.getData();
        JumioFallbackReason jumioFallbackReason = data instanceof JumioFallbackReason ? (JumioFallbackReason) data : null;
        if (jumioFallbackReason == null) {
            jumioFallbackReason = JumioFallbackReason.LOW_PERFORMANCE;
        }
        fallback(jumioFallbackReason);
    }

    public void handleFlash(@NotNull JumioFlashState flashState, boolean blockSwitchCamera) {
        Intrinsics.checkNotNullParameter(flashState, "flashState");
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            if (!scanView.getHasFlash()) {
                scanView = null;
            }
            if (scanView == null) {
                return;
            }
            scanView.registerUserActionOverride$jumio_core_release(EnumC9313a.FLASH);
            if (blockSwitchCamera) {
                scanView.registerUserActionOverride$jumio_core_release(EnumC9313a.SWITCH_CAMERA);
            }
            boolean z11 = flashState == JumioFlashState.ON;
            if (z11 && scanView.isFlashOn$jumio_core_release()) {
                return;
            }
            if (z11 || scanView.isFlashOn$jumio_core_release()) {
                sendUpdate(JumioScanUpdate.FLASH, flashState);
                scanView.setFlash$jumio_core_release(z11, false, true);
            }
        }
    }

    public void handleUploadOrUsabilityResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @NotNull AutomationModel automationModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Intrinsics.checkNotNullParameter(automationModel, "automationModel");
        ScanPartModel partForId = getPartForId(apiCallDataModel.getF14174b());
        if (partForId != null) {
            if (!Intrinsics.areEqual(apiCallDataModel.getF14175c(), partForId.getF14312a().name())) {
                partForId = null;
            }
            if (partForId == null) {
                return;
            }
            partForId.setAutomationModel(automationModel);
            partForId.setDataState(apiCallDataModel.getF14175c(), DataState.UPLOADED);
        }
    }

    public void handleUsabilityReject(@NotNull Map<JumioCredentialPart, AutomationModel> rejectedModels) {
        Intrinsics.checkNotNullParameter(rejectedModels, "rejectedModels");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(rejectedModels.size()));
        Iterator<T> it = rejectedModels.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AutomationModel) entry.getValue()).getRejectReason().getCode());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((JumioCredentialPart) entry2.getKey()).name(), entry2.getValue());
        }
        sendScanStep(JumioScanStep.REJECT_VIEW, linkedHashMap, linkedHashMap2);
    }

    public void initCameraData() {
        if (this.f14538q != null) {
            return;
        }
        CameraDataInterface cameraDataInterface = (CameraDataInterface) ServiceLocator.INSTANCE.getServiceImplementation(CameraDataInterface.class, new Function0() { // from class: u9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JVisionScanPart.m14583d();
            }
        });
        Controller f14541a = getF14541a();
        cameraDataInterface.init(f14541a.getF13601b(), (CameraDataSettingsModel) f14541a.getF13603d().get(CameraDataSettingsModel.class), f14541a.getF13607h());
        this.f14538q = cameraDataInterface;
    }

    public boolean isSupportedCheckHandler(@NotNull CheckHandler<?> checkHandler) {
        Intrinsics.checkNotNullParameter(checkHandler, "checkHandler");
        return checkHandler instanceof JumioRejectHandler;
    }

    @Override // com.jumio.core.gui.DrawView.DrawViewInterface
    public void onDrawViewDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            overlay.doDraw(canvas);
        }
    }

    @Override // com.jumio.core.gui.DrawView.DrawViewInterface
    public void onDrawViewMeasure(int w11, int h11) {
        CameraScanView scanView;
        Overlay overlay = this.f14534m;
        if (overlay == null || (scanView = getScanView()) == null) {
            return;
        }
        overlay.prepareDraw(scanView.getCameraFacing() == JumioCameraFacing.FRONT);
        getF14541a().getF13607h().postOnMain(new C40617X1(scanView, null));
    }

    @Override // jumio.core.InterfaceC40643c0
    public void onPreviewAvailable(@NotNull CameraSettings properties) {
        CameraScanView scanView;
        CameraCapabilities cameraCapabilities$jumio_core_release;
        Intrinsics.checkNotNullParameter(properties, "properties");
        ScanPart.sendUpdate$default(this, JumioScanUpdate.CAMERA_AVAILABLE, null, 2, null);
        UploadSettingsModel uploadSettingsModel = (UploadSettingsModel) getF14541a().getF13603d().get(UploadSettingsModel.class);
        if (uploadSettingsModel.getF14381b() == UploadResolution.UHD && (scanView = getScanView()) != null && (cameraCapabilities$jumio_core_release = scanView.getCameraCapabilities$jumio_core_release()) != null && !cameraCapabilities$jumio_core_release.getHasHighResolutionSupport()) {
            Log.m14461d("UHD requested but not supported by Camera - fallback to FHD");
            uploadSettingsModel.setUploadImageResolution(UploadResolution.FHD);
        }
        m14588e();
        m14586b();
        CameraDataInterface cameraDataInterface = this.f14538q;
        if (cameraDataInterface != null) {
            cameraDataInterface.start();
        }
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onResult(@Nullable StaticModel result) {
        getF14541a().getF13607h().postOnMain(new C40650d2(this, null));
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate
    public void onUpdate(@NotNull ExtractionUpdateInterface<?> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Integer f13842a = update.getF13842a();
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        int shotTaken = companion.getShotTaken();
        if (f13842a != null && f13842a.intValue() == shotTaken) {
            handleShotTaken$default(this, (ExtractionResult) update.getData(), update.getF13844c(), false, 4, null);
            return;
        }
        int saveImage = companion.getSaveImage();
        if (f13842a != null && f13842a.intValue() == saveImage) {
            Object data = update.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.jumio.core.extraction.result.ImageExtractionResult");
            m14585a((ImageExtractionResult) data, UploadResolution.FHD);
            return;
        }
        int saveHighResolutionImage = companion.getSaveHighResolutionImage();
        if (f13842a != null && f13842a.intValue() == saveHighResolutionImage) {
            Object data2 = update.getData();
            Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.jumio.core.extraction.result.ImageExtractionResult");
            m14585a((ImageExtractionResult) data2, UploadResolution.UHD);
            return;
        }
        int saveDebugImage = companion.getSaveDebugImage();
        if (f13842a != null && f13842a.intValue() == saveDebugImage) {
            Object data3 = update.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.jumio.core.extraction.result.ImageExtractionResult");
            m14585a((ImageExtractionResult) data3, UploadResolution.DEBUG);
            return;
        }
        int centerId = companion.getCenterId();
        if (f13842a != null && f13842a.intValue() == centerId) {
            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.CENTER_ID, null, 2, null);
            return;
        }
        int moveCloser = companion.getMoveCloser();
        if (f13842a != null && f13842a.intValue() == moveCloser) {
            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.MOVE_CLOSER, null, 2, null);
            return;
        }
        int tooClose = companion.getTooClose();
        if (f13842a != null && f13842a.intValue() == tooClose) {
            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.TOO_CLOSE, null, 2, null);
            return;
        }
        int holdStraight = companion.getHoldStraight();
        if (f13842a != null && f13842a.intValue() == holdStraight) {
            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.HOLD_STRAIGHT, null, 2, null);
            return;
        }
        int holdStill = companion.getHoldStill();
        if (f13842a != null && f13842a.intValue() == holdStill) {
            JumioScanUpdate jumioScanUpdate = JumioScanUpdate.HOLD_STILL;
            Object data4 = update.getData();
            Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type kotlin.Long");
            sendUpdateFiltered(jumioScanUpdate, (Long) data4);
            return;
        }
        int fallbackRequired = companion.getFallbackRequired();
        if (f13842a != null && f13842a.intValue() == fallbackRequired) {
            handleFallback(update);
            return;
        }
        int captureHighResolutionImage = companion.getCaptureHighResolutionImage();
        if (f13842a != null && f13842a.intValue() == captureHighResolutionImage) {
            CameraScanView scanView = getScanView();
            if (scanView != null) {
                scanView.captureImage$jumio_core_release();
                return;
            }
            return;
        }
        int flash = companion.getFlash();
        if (f13842a != null && f13842a.intValue() == flash) {
            Object data5 = update.getData();
            Intrinsics.checkNotNull(data5, "null cannot be cast to non-null type com.jumio.sdk.enums.JumioFlashState");
            handleFlash((JumioFlashState) data5, true);
            return;
        }
        int lockExposureAndWhiteBalance = companion.getLockExposureAndWhiteBalance();
        if (f13842a != null && f13842a.intValue() == lockExposureAndWhiteBalance) {
            CameraScanView scanView2 = getScanView();
            if (scanView2 != null) {
                Object data6 = update.getData();
                Intrinsics.checkNotNull(data6, "null cannot be cast to non-null type kotlin.Boolean");
                scanView2.setExposureAndWhiteBalanceLock$jumio_core_release(((Boolean) data6).booleanValue());
                return;
            }
            return;
        }
        int setChallenge = companion.getSetChallenge();
        if (f13842a != null && f13842a.intValue() == setChallenge) {
            Object data7 = update.getData();
            Intrinsics.checkNotNull(data7, "null cannot be cast to non-null type com.jumio.commons.camera.CaptureSettings");
            handleChallenge((CaptureSettings) data7);
            return;
        }
        int rotate = companion.getRotate();
        if (f13842a != null && f13842a.intValue() == rotate) {
            ScanPart.sendUpdateFiltered$default(this, JumioScanUpdate.ROTATE, null, 2, null);
            return;
        }
        int metering = companion.getMetering();
        if (f13842a != null && f13842a.intValue() == metering) {
            Object data8 = update.getData();
            Intrinsics.checkNotNull(data8, "null cannot be cast to non-null type com.jumio.commons.camera.MeteringConfig");
            triggerMetering((MeteringConfig) data8);
        } else {
            Overlay overlay = this.f14534m;
            if (overlay != null) {
                getF14541a().getF13607h().postOnMain(new C40655e2(overlay, update, this, null));
            }
        }
    }

    @Override // jumio.core.InterfaceC40671h3
    public void reject() {
        if (this.f14536o == null) {
            return;
        }
        MobileContext context = getF14541a().getF13601b();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        int i11 = context.getSharedPreferences("Jumio01", 0).getInt("Jumio03", 0) + 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("Jumio03", i11);
        editorEdit.apply();
        this.f14535n++;
        retryScanParts();
        initExtractionAndOverlay();
        getModelData().put("previewPaused", Boolean.FALSE);
        m14584a();
        CheckHandler checkHandler = this.f14536o;
        if (checkHandler != null) {
            checkHandler.detach$jumio_core_release();
        }
        this.f14536o = null;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void retry(@NotNull JumioRetryReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.retry(reason);
        getModelData().put("previewPaused", Boolean.FALSE);
        m14588e();
        m14586b();
        m14584a();
    }

    public final void setCameraData(@Nullable CameraDataInterface cameraDataInterface) {
        this.f14538q = cameraDataInterface;
    }

    @Override // jumio.core.InterfaceC40668h0
    public void setCheckHandler(@NotNull final CheckHandler<?> checkHandler) {
        Intrinsics.checkNotNullParameter(checkHandler, "checkHandler");
        if (checkHandler.isValidForScanStep$jumio_core_release(getScanPartModel().getF14316e()) && isSupportedCheckHandler(checkHandler)) {
            CheckHandler<?> checkHandler2 = this.f14536o;
            if (checkHandler2 != checkHandler) {
                if (checkHandler2 != null) {
                    checkHandler2.detach$jumio_core_release();
                }
                this.f14536o = checkHandler;
            }
            fillCheckHandler(new Function2() { // from class: u9.c
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JVisionScanPart.m14582a(this.f101581b, checkHandler, (JumioCredentialPart) obj, (String) obj2);
                }
            });
        }
    }

    @Override // jumio.core.InterfaceC40643c0
    public void setEnableExtraction(boolean z11) {
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.setDataExtraction(z11);
        }
        if (z11) {
            return;
        }
        onUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getResetOverlay(), null, null, 4, null));
    }

    public final void setExtractionClient(@Nullable ExtractionClient extractionClient) {
        this.f14533l = extractionClient;
    }

    public final void setInternalCheckHandler(@Nullable CheckHandler<?> checkHandler) {
        this.f14536o = checkHandler;
    }

    public final void setNumOfRetries(int i11) {
        this.f14535n = i11;
    }

    public final void setOverlay(@Nullable Overlay overlay) {
        this.f14534m = overlay;
    }

    public final void setPlugin(@Nullable ExtractionPlugin extractionPlugin) {
        this.f14532k = extractionPlugin;
    }

    @Override // jumio.core.InterfaceC40643c0
    public void setScanView(@NotNull CameraScanView scanView) {
        CameraScanView cameraScanView;
        Intrinsics.checkNotNullParameter(scanView, "scanView");
        WeakReference weakReference = this.f14531j;
        if (weakReference != null && (cameraScanView = (CameraScanView) weakReference.get()) != null) {
            scanView.setCameraManager$jumio_core_release(cameraScanView.getF14592i());
        }
        this.f14531j = new WeakReference(scanView);
    }

    @Override // jumio.core.InterfaceC40643c0
    public void takePicture() {
        ExtractionClient extractionClient;
        ExtractionClient extractionClient2 = this.f14533l;
        if (extractionClient2 == null || !extractionClient2.takePictureManually() || (extractionClient = this.f14533l) == null) {
            return;
        }
        extractionClient.takePicture();
    }

    public void triggerMetering(@NotNull MeteringConfig meteringConfig) {
        CameraManagerInterface f14592i;
        Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
        CameraScanView scanView = getScanView();
        if (scanView == null || (f14592i = scanView.getF14592i()) == null) {
            return;
        }
        f14592i.requestMetering(meteringConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void uploadExtractionResult(@NotNull ExtractionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ScanPartModel partForSide = getPartForSide(result.getF14141b());
        if (partForSide == null) {
            return;
        }
        partForSide.setDataState(result.getF14141b(), DataState.SAVED);
        partForSide.setUsability((this instanceof UsabilityInterface) && ((UsabilityInterface) this).getShouldEnableUsability());
        if (partForSide.getF14314c() instanceof ImageDataInterface) {
            FileDataInterface f14314c = partForSide.getF14314c();
            Intrinsics.checkNotNull(f14314c, "null cannot be cast to non-null type com.jumio.commons.camera.ImageDataInterface");
            addCameraData((ImageDataInterface) f14314c);
        }
        getF14541a().getF13604e().uploadPart(getF14542b(), partForSide);
    }

    public static final void access$onEnable(JVisionScanPart jVisionScanPart, AbstractC40513C1 abstractC40513C1) {
        CameraCapabilities cameraCapabilities$jumio_core_release;
        CameraScanView scanView = jVisionScanPart.getScanView();
        if (scanView != null && (cameraCapabilities$jumio_core_release = scanView.getCameraCapabilities$jumio_core_release()) != null && !cameraCapabilities$jumio_core_release.getCanAdjustFocus()) {
            abstractC40513C1.m89154b(4.0f);
            abstractC40513C1.m89152a(1);
        }
    }

    public static final void access$onRender(JVisionScanPart jVisionScanPart, AbstractC40513C1 abstractC40513C1) {
        jVisionScanPart.getClass();
        float fCurrentTimeMillis = ((System.currentTimeMillis() % ((long) 2666)) * 1.5f) / 1000;
        int i11 = ((int) fCurrentTimeMillis) % 4;
        float fAbs = 1.0f;
        if (i11 != 0) {
            if (i11 == 2) {
                double dAbs = ((double) 1.0f) - Math.abs(Math.sin(((double) fCurrentTimeMillis) * 3.141592653589793d));
                fAbs = (float) (dAbs * dAbs);
            }
        } else {
            fAbs = 1.0f + ((float) Math.abs(Math.sin(((double) fCurrentTimeMillis) * 3.141592653589793d) * ((double) 3)));
        }
        abstractC40513C1.m89150a(fAbs);
    }

    /* JADX INFO: renamed from: c */
    public final void m14587c() {
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.detach();
        }
        WeakReference weakReference = this.f14531j;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14531j = null;
        CheckHandler checkHandler = this.f14536o;
        if (checkHandler != null) {
            checkHandler.detach$jumio_core_release();
        }
        CameraDataInterface cameraDataInterface = this.f14538q;
        if (cameraDataInterface != null) {
            cameraDataInterface.stop();
            cameraDataInterface.destroy();
        }
        this.f14538q = null;
        getModelData().put("previewPaused", Boolean.FALSE);
        System.gc();
        destroyExtractionClient();
        destroyOverlay();
    }

    @Override // jumio.core.InterfaceC40643c0
    public void cameraAvailable() {
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.setCollectCameraConnection$jumio_core_release(getSettingsModel().getCameraConnection());
        }
        HashMap<String, Serializable> modelData = getModelData();
        Serializable serializable = modelData.get("previewPaused");
        if (serializable == null) {
            serializable = Boolean.FALSE;
            modelData.put("previewPaused", serializable);
        }
        if (((Boolean) serializable).booleanValue()) {
            CameraScanView scanView2 = getScanView();
            if (scanView2 != null) {
                scanView2.stopPreview$jumio_core_release(true);
            }
        } else {
            JumioScanStep jumioScanStep = JumioScanStep.STARTED;
            if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new JumioScanStep[]{jumioScanStep, JumioScanStep.NEXT_PART}), getScanPartModel().getF14316e())) {
                sendScanStep(jumioScanStep, getScanPartModel().getF14312a(), getAnalyticsScanData());
            }
        }
        CameraScanView scanView3 = getScanView();
        if (scanView3 != null) {
            scanView3.clearUserActionOverrides$jumio_core_release();
        }
    }

    @Override // jumio.core.InterfaceC40643c0
    public void cameraError(@Nullable Throwable t11) {
        Log.printStackTrace(t11);
        onError(new Error(ErrorCase.NO_CAMERA_CONNECTION, 0, 0, 6, null));
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void cancel() {
        super.cancel();
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.clearUserActionOverrides$jumio_core_release();
        }
        CameraScanView scanView2 = getScanView();
        if (scanView2 != null) {
            scanView2.setFlash$jumio_core_release(false, false, true);
        }
        ExtractionClient extractionClient = this.f14533l;
        if (extractionClient != null) {
            extractionClient.cancel();
        }
        getF14541a().getF13604e().cancelCall(true);
        m14589f();
        reset();
        m14587c();
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void finish() {
        m14587c();
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @NotNull
    public Map<JumioCredentialPart, ImageDataInterface> getRejectedImages() {
        AutomationModel.DecisionType decisionType;
        List<ScanPartModel> scanPartModelList = getScanPartModelList();
        ArrayList arrayList = new ArrayList();
        for (ScanPartModel scanPartModel : scanPartModelList) {
            FileDataInterface f14314c = scanPartModel.getF14314c();
            Pair pairM90091to = null;
            if (f14314c instanceof ImageDataInterface) {
                AutomationModel f14319h = scanPartModel.getF14319h();
                if (f14319h != null) {
                    decisionType = f14319h.getDecisionType();
                } else {
                    decisionType = null;
                }
                if (decisionType != AutomationModel.DecisionType.REJECT) {
                    f14314c = null;
                }
            } else {
                f14314c = null;
            }
            if (f14314c != null) {
                pairM90091to = TuplesKt.m90091to(scanPartModel.getF14312a(), (ImageDataInterface) f14314c);
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @NotNull
    public Map<JumioCredentialPart, AutomationModel> getRejectedModels() {
        List<ScanPartModel> scanPartModelList = getScanPartModelList();
        ArrayList arrayList = new ArrayList();
        for (ScanPartModel scanPartModel : scanPartModelList) {
            AutomationModel f14319h = scanPartModel.getF14319h();
            Pair pairM90091to = null;
            if (f14319h != null) {
                if (f14319h.getDecisionType() != AutomationModel.DecisionType.REJECT) {
                    f14319h = null;
                }
                if (f14319h != null) {
                    pairM90091to = TuplesKt.m90091to(scanPartModel.getF14312a(), f14319h);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // com.jumio.core.scanpart.ScanPart
    @NotNull
    public JumioScanMode getScanMode() {
        switch (AbstractC40612W1.f90158a[getScanPartModel().getF14313b().ordinal()]) {
            case 1:
                return JumioScanMode.BARCODE;
            case 2:
                return JumioScanMode.DOCFINDER;
            case 3:
                return JumioScanMode.FACE_MANUAL;
            case 4:
                return JumioScanMode.JUMIO_LIVENESS;
            case 5:
                return JumioScanMode.JUMIO_PREMIUM;
            case 6:
                return JumioScanMode.MANUAL;
            case 7:
                return JumioScanMode.NFC;
            case 8:
                return JumioScanMode.FILE;
            case 9:
                return JumioScanMode.WEB;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final SettingsModel getSettingsModel() {
        return (SettingsModel) getF14541a().getF13603d().get(SettingsModel.class);
    }

    public void handleProcessing() {
        if (getHasNextPart()) {
            return;
        }
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.stopPreview$jumio_core_release(true);
        }
        getModelData().put("previewPaused", Boolean.TRUE);
        ScanPart.sendScanStep$default(this, JumioScanStep.PROCESSING, null, null, 6, null);
    }

    public void handleShotTaken(@Nullable ExtractionResult result, @Nullable MetaInfo metaInfo, boolean vibrate) {
        String f14141b;
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.adjustCameraSettings$jumio_core_release(new CaptureSettings(null, null, null, 7, null));
            CameraScanView.enableShader$jumio_core_release$default(scanView, false, null, null, 6, null);
        }
        CameraScanView scanView2 = getScanView();
        if (scanView2 != null) {
            scanView2.clearUserActionOverrides$jumio_core_release();
        }
        MetaInfo analyticsScanData = getAnalyticsScanData();
        if (metaInfo != null) {
            analyticsScanData.putAll(metaInfo);
        }
        if (result != null && (f14141b = result.getF14141b()) != null) {
            analyticsScanData.put(DocumentClassifier.KEY_SIDE, StringsKt.removeSuffix(f14141b, (CharSequence) "_GZIP"));
        }
        Analytics.INSTANCE.add(MobileEvents.misc("imageTaken", analyticsScanData));
        if (vibrate) {
            getF14547g().vibrate(getF14541a().getF13601b(), 100L);
        }
        if (result != null) {
            C41696j.m91104d(getF14541a().getF13607h().getIoScope(), null, null, new C40645c2(result, this, null), 3, null);
        }
    }

    public final void initExtractionAndOverlay() {
        destroyExtractionClient();
        destroyOverlay();
        Overlay overlay = this.f14534m;
        if (overlay != null) {
            overlay.setVisible(8);
        }
        ExtractionPlugin extractionPlugin = getExtractionPlugin(getScanPartModel().getF14313b());
        if (extractionPlugin != null) {
            Overlay overlay2 = extractionPlugin.getOverlay(getF14541a().getF13601b());
            overlay2.setScanPart(getScanPartModel());
            this.f14534m = overlay2;
            ExtractionClient extractionClient = extractionPlugin.getExtractionClient(getF14541a());
            configureExtractionClient(extractionClient);
            this.f14533l = extractionClient;
        } else {
            extractionPlugin = null;
        }
        this.f14532k = extractionPlugin;
        m14588e();
        m14586b();
        Overlay overlay3 = this.f14534m;
        if (overlay3 != null) {
            overlay3.setVisible(0);
        }
        getF14541a().getF13607h().postOnMain(new C40639b2(this, null));
    }

    @Override // jumio.core.InterfaceC40643c0
    public boolean isBrandingEnabled() {
        return getSettingsModel().isBrandingEnabled();
    }

    public final void nextPartOrProcess(boolean vibrate) {
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.clearUserActionOverrides$jumio_core_release();
        }
        CameraScanView scanView2 = getScanView();
        if (scanView2 != null) {
            scanView2.setFlash$jumio_core_release(false, false, true);
        }
        ScanPart.sendScanStep$default(this, JumioScanStep.IMAGE_TAKEN, null, getAnalyticsScanData(), 2, null);
        m14589f();
        if (vibrate) {
            getF14547g().vibrate(getF14541a().getF13601b(), 100L);
        }
        if (getHasNextPart()) {
            switchToNextPart();
            initExtractionAndOverlay();
            sendScanStep(JumioScanStep.NEXT_PART, getScanPartModel().getF14312a(), getAnalyticsScanData());
        } else {
            if (getAllPartsComplete()) {
                if (getScanPartModel().getF14316e() != JumioScanStep.PROCESSING) {
                    handleProcessing();
                }
                processUsabilityResults();
                return;
            }
            handleProcessing();
        }
    }

    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object result) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Class<?> call = apiCallDataModel.getCall();
        if (Intrinsics.areEqual(call, UploadCall.class)) {
            List<C40711p3> usabilityResultKeys = getUsabilityResultKeys(apiCallDataModel, result instanceof JSONObject ? (JSONObject) result : null);
            if (getSettingsModel().isInstantFeedbackEnabled() && !usabilityResultKeys.isEmpty()) {
                Iterator<T> it = usabilityResultKeys.iterator();
                while (it.hasNext()) {
                    getF14541a().getF13604e().usability(((C40711p3) it.next()).f90355a, apiCallDataModel.getF14174b(), apiCallDataModel.getF14175c());
                }
                return;
            } else {
                handleUploadOrUsabilityResult(apiCallDataModel, new AutomationModel(null, null, null, null, null, 31, null));
                if (getAllPartsComplete()) {
                    processUsabilityResults();
                    return;
                }
                return;
            }
        }
        if (Intrinsics.areEqual(call, UsabilityCall.class)) {
            Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel");
            handleUploadOrUsabilityResult(apiCallDataModel, (AutomationModel) result);
            if (getAllPartsComplete()) {
                processUsabilityResults();
            }
        }
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void persist(boolean stop) {
        super.persist(stop);
        if (stop) {
            destroyExtractionClient();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void processUsabilityResults() {
        Map<JumioCredentialPart, AutomationModel> rejectedModels = getRejectedModels();
        if (!rejectedModels.isEmpty()) {
            handleUsabilityReject(rejectedModels);
        } else if ((this instanceof ConfirmationInterface) && ((ConfirmationInterface) this).getShouldConfirm()) {
            ScanPart.sendScanStep$default(this, JumioScanStep.CONFIRMATION_VIEW, null, null, 6, null);
        } else {
            setComplete(true);
            ScanPart.sendScanStep$default(this, JumioScanStep.CAN_FINISH, null, null, 6, null);
        }
    }

    @Override // jumio.core.AbstractC40755y2, com.jumio.core.scanpart.ScanPart
    public void restore() {
        int i11;
        super.restore();
        JumioScanStep f14316e = getScanPartModel().getF14316e();
        if (f14316e == null) {
            i11 = -1;
        } else {
            i11 = AbstractC40612W1.f90159b[f14316e.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            setComplete(true);
        } else {
            getScanPartModel().setScanStep(JumioScanStep.SCAN_VIEW);
            getModelData().put("previewPaused", Boolean.FALSE);
        }
    }

    public void retryScanParts() {
        AutomationModel.DecisionType decisionType;
        getF14546f().m14565a(getF14542b().getF14676b().f14197a, getScanPartModel().getF14312a());
        List<ScanPartModel> scanPartModelList = getScanPartModelList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : scanPartModelList) {
            AutomationModel f14319h = ((ScanPartModel) obj).getF14319h();
            if (f14319h != null) {
                decisionType = f14319h.getDecisionType();
            } else {
                decisionType = null;
            }
            if (decisionType == AutomationModel.DecisionType.REJECT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScanPartModel) it.next()).clear();
        }
        setScanPartModel((ScanPartModel) CollectionsKt.first((List) arrayList));
        getF14546f().m14566b(getF14542b().getF14676b().f14197a, getScanPartModel().getF14312a());
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void start() {
        super.start();
        getModelData().put("previewPaused", Boolean.FALSE);
        initCameraData();
        m14584a();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14582a(JVisionScanPart jVisionScanPart, CheckHandler checkHandler, JumioCredentialPart credentialPart, String path) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(path, "path");
        Bitmap bitmap$default = BitmapUtilKt.readBitmap$default(path, jVisionScanPart.getF14541a().getF13600a().getF14185c(), null, 4, null);
        if (bitmap$default != null) {
            checkHandler.addBitmap$jumio_core_release(credentialPart, bitmap$default);
        }
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onError(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Throwable error) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (getAllPartsHaveImages()) {
            getF14541a().onError(error, apiCallDataModel.getCall());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14585a(ImageExtractionResult imageExtractionResult, UploadResolution uploadResolution) {
        ScanPartModel partForSide = getPartForSide(imageExtractionResult.getF14140a());
        if (partForSide == null) {
            partForSide = getScanPartModel();
        }
        partForSide.setDataState(imageExtractionResult.getF14141b(), DataState.SAVING);
        FileDataInterface fileDataForResolution = getFileDataForResolution(partForSide, imageExtractionResult, uploadResolution);
        fileDataForResolution.setMimeType("image/webp");
        fileDataForResolution.setFileType(ConstantsKt.FILE_TYPE_WEBP);
        if (fileDataForResolution instanceof ImageData) {
            CameraScanView scanView = getScanView();
            if (scanView != null) {
                scanView.fillImageData$jumio_core_release((ImageData) fileDataForResolution);
            }
            ImageData imageData = (ImageData) fileDataForResolution;
            imageData.getSize().setWidth(imageExtractionResult.getBitmap().getWidth());
            imageData.getSize().setHeight(imageExtractionResult.getBitmap().getHeight());
            imageData.setMetadata(imageExtractionResult.getImageMetadata());
            imageData.setCameraConnectionData(imageExtractionResult.getCameraConnectionData());
        }
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(getF14541a().getF13607h().getIoScope(), null, null, new C40633a2(imageExtractionResult, fileDataForResolution, this, null), 3, null);
        LinkedHashMap linkedHashMap = this.f14537p;
        String f14142c = imageExtractionResult.getF14142c();
        if (f14142c == null) {
            f14142c = imageExtractionResult.getF14141b();
        }
        Object arrayList = linkedHashMap.get(f14142c);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(f14142c, arrayList);
        }
        ((List) arrayList).add(new C40726s3(imageExtractionResult.getF14141b(), interfaceC41775x1M91104d));
    }

    @Override // jumio.core.InterfaceC40643c0
    public void isPresented(boolean presented) {
    }
}
