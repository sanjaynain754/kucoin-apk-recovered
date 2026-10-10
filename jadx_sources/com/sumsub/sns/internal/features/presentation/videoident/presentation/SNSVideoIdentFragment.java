package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.C0467R;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ServiceCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSVideoIdentDocumentView;
import com.sumsub.sns.core.widget.SNSWarningView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28449e;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.InterfaceC28439b1;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28637L;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28632G;
import com.sumsub.sns.internal.core.presentation.android.C28634I;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.android.C28710y;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29199C1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29239K1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29288U1;
import com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage$ClientMessage$Type;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.verification.C32709e;
import com.sumsub.sns.internal.features.presentation.verification.C32730p;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32840y;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.sumsub.sns.internal.features.presentation.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32901a;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32917q;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32921u;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32923x;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatController$CameraId;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService;
import com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatServiceLauncher;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.AbstractC33047g;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.C33046f;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.CameraCapturerCompat$Source;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.twilio.video.LocalParticipant;
import com.twilio.video.LocalVideoTrack;
import com.twilio.video.RemoteVideoTrack;
import com.twilio.video.TwilioException;
import com.twilio.video.VideoTextureView;
import com.twilio.video.VideoView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import tvi.webrtc.VideoSource;
import xg0.AbstractC46162a;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Ë\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n*\u0003x\u009d\u0001\u0018\u0000 ï\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004ð\u0001ï\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0005J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020(H\u0002¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020(H\u0002¢\u0006\u0004\b5\u0010*J\u0017\u00107\u001a\u00020(2\u0006\u00106\u001a\u00020\u0002H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b=\u0010;J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>2\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020\t2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010\u0005J%\u0010V\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0SH\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\bY\u00103J!\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020F2\b\u0010X\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010\u0005J\u000f\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\u0005J\u000f\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010\u0005J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u000200H\u0016¢\u0006\u0004\ba\u00103J\u000f\u0010b\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010\u0005J\u000f\u0010c\u001a\u00020\tH\u0014¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020(2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ!\u0010i\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u00060nR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001d\u0010\u0081\u0001\u001a\u00020\u00038PX\u0090\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u0087\u0001\u001a\u00020\u00118\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0088\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010\u009b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\"\u0010¥\u0001\u001a\r ¤\u0001*\u0005\u0018\u00010£\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010±\u0001\u001a\u0005\u0018\u00010®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010·\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010©\u0001R\u001a\u0010¹\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010©\u0001R\u001a\u0010»\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010©\u0001R\u0019\u0010½\u0001\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010¬\u0001R\u0019\u0010À\u0001\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010Â\u0001\u001a\u0005\u0018\u00010®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010°\u0001R\u001a\u0010Ä\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010©\u0001R\u001a\u0010Æ\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010©\u0001R\u0019\u0010É\u0001\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010Ë\u0001\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010È\u0001R\u0019\u0010Í\u0001\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010È\u0001R\u0019\u0010Ï\u0001\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010¬\u0001R\u001a\u0010Ñ\u0001\u001a\u0005\u0018\u00010²\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010´\u0001R\u001a\u0010Õ\u0001\u001a\u0005\u0018\u00010Ò\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010×\u0001\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010¿\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010¿\u0001R\u001a\u0010Ý\u0001\u001a\u0005\u0018\u00010Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001a\u0010ß\u0001\u001a\u0005\u0018\u00010§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010©\u0001R\u0018\u0010R\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010¬\u0001R\u001d\u0010U\u001a\t\u0012\u0005\u0012\u00030á\u00010S8BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010å\u0001\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010¬\u0001R%\u0010ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030ç\u00010æ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R%\u0010ì\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030ç\u00010æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010é\u0001R%\u0010î\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030ç\u00010æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010é\u0001¨\u0006ñ\u0001"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel;", "<init>", "()V", "", "showPhoneVerificationFragment", "listenPhoneVerificationResult", "", "code", "onPhoneVerificationResult", "(I)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "calculateExpandedOffset", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I", "", "docSetType", "Landroid/net/Uri;", "uri", "handleFileSelectedForDocSetType", "(Ljava/lang/String;Landroid/net/Uri;)V", "switchCameraAndUpdateMirroring", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;", "videoChatController", "attachChatControllerListeners", "(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)V", "detachChatControllerListeners", "Lkotlin/Function0;", "finishCallback", "showPhotoMadeAnimation", "(Lkotlin/jvm/functions/Function0;)V", "accessToken", "roomName", "doStartServiceAndConnectToRoom", "(Ljava/lang/String;Ljava/lang/String;)V", "handleEnterPhone", "listenEnterPhoneResult", "handleEnterPhoneResult", "", "hideEnterPhone", "()Z", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;", "state", "handleSelectLanguage", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;)V", "listenSelectLanguageResult", "Landroid/os/Bundle;", DbParams.KEY_CHANNEL_RESULT, "handleLanguageSelectionResult", "(Landroid/os/Bundle;)V", "hideLanguageSelection", "hidePhoneVerification", "newState", "releaseCurrentStatePreviewIfChanged", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;)Z", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "updateLanguageSection", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;)V", "showExitConfirmationState", "startBottomAnimation", "Landroid/widget/Button;", "button", "updateBottomPrimaryButton", "(Landroid/widget/Button;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;", "remoteVideoState", "updateRemoteVideoView", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;)V", "Landroid/view/View;", "videoView", "", ViewProps.ASPECT_RATIO, "applyVideoViewSize", "(Landroid/view/View;F)V", "maxSideSize", "Landroid/graphics/Rect;", "calcRectSize", "(IF)Landroid/graphics/Rect;", "updateRecordTimerText", "Landroid/view/ViewGroup;", "documentList", "", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem;", "documents", "populateDocumentList", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "savedInstanceState", "onCreate", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroyView", "outState", "onSaveInstanceState", "onCloseButtonClick", "getLayoutId", "()Ljava/lang/Integer;", "Lcom/sumsub/sns/internal/core/common/w;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/w;)Z", "handleState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/presentation/android/y;", "pickerLifecycleObserver", "Lcom/sumsub/sns/internal/core/presentation/android/y;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "videoChatAdapter", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "Lkotlinx/coroutines/m0;", "fragmentScope", "Lkotlinx/coroutines/m0;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "phoneVerificationBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "com/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$uriContentLoader$1", "uriContentLoader", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$uriContentLoader$1;", "currentViewState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "idDocSetType", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "previousVolumeControlStream", "I", "currentCameraId", "Lkotlinx/coroutines/x1;", "chatMessagesCollectJob", "Lkotlinx/coroutines/x1;", "chatStateCollectJob", "Lcom/sumsub/sns/internal/core/presentation/android/v;", "permissionHandler", "Lcom/sumsub/sns/internal/core/presentation/android/v;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "callState", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "Landroidx/appcompat/app/AlertDialog;", "exitConfirmationDialog", "Landroidx/appcompat/app/AlertDialog;", "startServiceAndConnectToRoom", "Lkotlin/jvm/functions/Function0;", "com/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1", "serviceConnection", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1;", "Ljava/text/SimpleDateFormat;", "shortTimeFormat", "Ljava/text/SimpleDateFormat;", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "calendar", "Ljava/util/Calendar;", "Landroid/widget/TextView;", "getRecordTime", "()Landroid/widget/TextView;", "recordTime", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet", "Lcom/sumsub/sns/core/widget/SNSWarningView;", "getMessage", "()Lcom/sumsub/sns/core/widget/SNSWarningView;", "message", "Landroid/widget/ImageView;", "getSwitchCamera", "()Landroid/widget/ImageView;", "switchCamera", "getLanguageSectionTitle", "languageSectionTitle", "getLanguage", "language", "getChangeLanguage", "changeLanguage", "getLanguageSection", "languageSection", "getBottomProgressBar", "()Landroid/view/View;", "bottomProgressBar", "getBottomWarning", "bottomWarning", "getBottomText", "bottomText", "getBottomTitle", "bottomTitle", "getBottomPrimaryButton", "()Landroid/widget/Button;", "bottomPrimaryButton", "getBottomSecondaryButton", "bottomSecondaryButton", "getBottomTertiaryButton", "bottomTertiaryButton", "getPhotoPreviewContainer", "photoPreviewContainer", "getPhotoPreview", "photoPreview", "Lcom/twilio/video/VideoView;", "getLocalVideoView", "()Lcom/twilio/video/VideoView;", "localVideoView", "getPhotoMadeIndicator", "photoMadeIndicator", "getRemoteVideoContainer", "remoteVideoContainer", "Lcom/twilio/video/VideoTextureView;", "getRemoteVideoView", "()Lcom/twilio/video/VideoTextureView;", "remoteVideoView", "getOperatorName", "operatorName", "getDocumentList", "Lcom/sumsub/sns/internal/features/data/model/common/Document;", "getDocuments", "()Ljava/util/List;", "getPhoneVerificationBottomSheet", "phoneVerificationBottomSheet", "", "", "getCommonPayload", "()Ljava/util/Map;", "commonPayload", "getOpenPayload", "openPayload", "getClosePayload", "closePayload", "Companion", "SNSVideoChatAdapterImpl", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoIdentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoIdentFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1342:1\n106#2,15:1343\n1#3:1358\n254#4:1359\n254#4:1360\n256#4,2:1361\n256#4,2:1363\n256#4,2:1365\n254#4:1367\n256#4,2:1368\n256#4,2:1370\n254#4:1372\n254#4:1373\n256#4,2:1374\n256#4,2:1376\n256#4,2:1378\n256#4,2:1380\n256#4,2:1382\n256#4,2:1384\n256#4,2:1386\n256#4,2:1388\n254#4:1390\n256#4,2:1391\n256#4,2:1393\n256#4,2:1395\n310#4:1397\n326#4,4:1398\n311#4:1402\n93#4,13:1406\n93#4,13:1419\n1878#5,3:1403\n*S KotlinDebug\n*F\n+ 1 SNSVideoIdentFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment\n*L\n178#1:1343,15\n516#1:1359\n522#1:1360\n860#1:1361,2\n862#1:1363,2\n906#1:1365,2\n914#1:1367\n959#1:1368,2\n972#1:1370,2\n989#1:1372\n996#1:1373\n1001#1:1374,2\n1002#1:1376,2\n1013#1:1378,2\n1016#1:1380,2\n1017#1:1382,2\n1018#1:1384,2\n1019#1:1386,2\n1023#1:1388,2\n1185#1:1390\n1187#1:1391,2\n1206#1:1393,2\n1210#1:1395,2\n1218#1:1397\n1218#1:1398,4\n1218#1:1402\n326#1:1406,13\n335#1:1419,13\n1253#1:1403,3\n*E\n"})
public final class SNSVideoIdentFragment extends AbstractC28064I<SNSViewState, SNSVideoIdentViewModel> {

    @NotNull
    private static final String ARG_DOCS = "docs";

    @NotNull
    private static final String CALL_STATE = "call_state";

    @NotNull
    private static final String CAMERA_ID = "camera_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ENTER_PHONE_REQUEST_KEY = "enter_phone_request_key";

    @NotNull
    private static final String LANGUAGE_REQUEST_KEY = "language_request_key";

    @NotNull
    private static final String OBSERVER_ITEM_ID = "observer_item_id";

    @NotNull
    public static final String TAG = "SNSVideoIdentFragment";

    @NotNull
    private static final String VERIFICATION_REQUEST_KEY = "verification_request_key";

    @Nullable
    private BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
    private final Calendar calendar;

    @NotNull
    private AnalyticsCallState callState;

    @Nullable
    private InterfaceC41775x1 chatMessagesCollectJob;

    @Nullable
    private InterfaceC41775x1 chatStateCollectJob;

    @Nullable
    private String currentCameraId;

    @Nullable
    private SNSViewState currentViewState;

    @Nullable
    private AlertDialog exitConfirmationDialog;

    @NotNull
    private final String idDocSetType;

    @NotNull
    private final C28707v permissionHandler;

    @Nullable
    private BottomSheetBehavior<ViewGroup> phoneVerificationBottomSheetBehavior;
    private C28710y pickerLifecycleObserver;
    private int previousVolumeControlStream;

    @NotNull
    private final Screen screen;

    @NotNull
    private final SNSVideoIdentFragment$serviceConnection$1 serviceConnection;

    @NotNull
    private final SimpleDateFormat shortTimeFormat;

    @Nullable
    private Function0<Unit> startServiceAndConnectToRoom;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private final SNSVideoChatAdapterImpl videoChatAdapter = new SNSVideoChatAdapterImpl();

    @NotNull
    private final InterfaceC41709m0 fragmentScope = C41713n0.m91125a(C41782z0.m91393c());

    @NotNull
    private final SNSVideoIdentFragment$uriContentLoader$1 uriContentLoader = new InterfaceC28439b1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$uriContentLoader$1
        @Override // com.sumsub.sns.internal.core.common.InterfaceC28439b1
        public Object copyContentsToCacheFile(Uri uri, Continuation<? super String> continuation) {
            return C41686h.m91049g(C41782z0.m91392b(), new C28449e(this.this$0.getContext(), uri, null), continuation);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$Companion;", "", "<init>", "()V", "CALL_STATE", "", "ENTER_PHONE_REQUEST_KEY", "LANGUAGE_REQUEST_KEY", "VERIFICATION_REQUEST_KEY", "OBSERVER_ITEM_ID", "CAMERA_ID", "ARG_DOCS", "create", "Landroidx/fragment/app/Fragment;", "documents", "", "Lcom/sumsub/sns/internal/features/data/model/common/Document;", "TAG", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Fragment create(@NotNull List<Document> documents) {
            SNSVideoIdentFragment sNSVideoIdentFragment = new SNSVideoIdentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(SNSVideoIdentFragment.ARG_DOCS, new ArrayList<>(documents));
            sNSVideoIdentFragment.setArguments(bundle);
            return sNSVideoIdentFragment;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "<init>", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment;)V", "Lcom/sumsub/sns/internal/features/data/model/common/remote/U1;", "", "asJson", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/U1;)Ljava/lang/String;", "accessToken", "roomName", "", "connectToRoom", "(Ljava/lang/String;Ljava/lang/String;)V", "disconnect", "()V", "makePhoto", "message", TUIConstants.TUIChat.METHOD_SEND_MESSAGE, "(Lcom/sumsub/sns/internal/features/data/model/common/remote/U1;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "getState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "state", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSVideoIdentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoIdentFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,1342:1\n113#2:1343\n113#2:1344\n113#2:1345\n*S KotlinDebug\n*F\n+ 1 SNSVideoIdentFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl\n*L\n1305#1:1343\n1308#1:1344\n1310#1:1345\n*E\n"})
    public final class SNSVideoChatAdapterImpl implements SNSVideoChatAdapter {
        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit connectToRoom$lambda$0(SNSVideoIdentFragment sNSVideoIdentFragment, String str, String str2) {
            sNSVideoIdentFragment.startServiceAndConnectToRoom = null;
            sNSVideoIdentFragment.doStartServiceAndConnectToRoom(str, str2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SNSMessage$ClientMessage$Type.values().length];
                try {
                    iArr[SNSMessage$ClientMessage$Type.USER_VISIBILITY_STATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SNSMessage$ClientMessage$Type.SCREENSHOT_MADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SNSVideoChatAdapterImpl() {
        }

        private final String asJson(C29288U1 c29288u1) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[c29288u1.f59302a.ordinal()];
            if (i11 == 1) {
                AbstractC46162a abstractC46162a = SNSVideoIdentFragment.this.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58188z;
                abstractC46162a.getSerializersModule();
                return abstractC46162a.mo99409b(C29239K1.Companion.serializer(), (C29239K1) c29288u1);
            }
            if (i11 != 2) {
                AbstractC46162a abstractC46162a2 = SNSVideoIdentFragment.this.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58188z;
                abstractC46162a2.getSerializersModule();
                return abstractC46162a2.mo99409b(C29288U1.Companion.serializer(), c29288u1);
            }
            AbstractC46162a abstractC46162a3 = SNSVideoIdentFragment.this.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58188z;
            abstractC46162a3.getSerializersModule();
            return abstractC46162a3.mo99409b(C29199C1.Companion.serializer(), (C29199C1) c29288u1);
        }

        @Override // com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoChatAdapter
        public void connectToRoom(@NotNull final String accessToken, @NotNull final String roomName) {
            final SNSVideoIdentFragment sNSVideoIdentFragment = SNSVideoIdentFragment.this;
            Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SNSVideoIdentFragment.SNSVideoChatAdapterImpl.connectToRoom$lambda$0(sNSVideoIdentFragment, accessToken, roomName);
                }
            };
            if (SNSVideoIdentFragment.this.serviceConnection.getConnected()) {
                function0.invoke();
            } else {
                SNSVideoIdentFragment.this.startServiceAndConnectToRoom = function0;
            }
        }

        @Override // com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoChatAdapter
        public void disconnect() {
            C32917q videoChatController;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            videoChatController.m71371a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoChatAdapter
        @Nullable
        public SNSVideoChatState getState() {
            C32917q videoChatController;
            InterfaceC41669n interfaceC41669n;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null || (interfaceC41669n = videoChatController.f67342n) == null) {
                return null;
            }
            return (SNSVideoChatState) interfaceC41669n.getValue();
        }

        @Override // com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoChatAdapter
        public void makePhoto() {
            C32917q videoChatController;
            VideoSource videoSource;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            AbstractC32895a.m71366a("makePhoto");
            LocalVideoTrack localVideoTrack = videoChatController.f67338j;
            if (localVideoTrack != null && (videoSource = localVideoTrack.getVideoSource()) != null) {
                videoSource.setVideoProcessor(videoChatController.f67339k);
            }
            C32901a c32901a = videoChatController.f67339k;
            if (c32901a != null) {
                if (((Boolean) c32901a.f67303a.get()).booleanValue()) {
                    AbstractC32895a.m71366a("makePhoto: already making photo");
                } else {
                    c32901a.f67303a.set(Boolean.TRUE);
                }
            }
        }

        @Override // com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoChatAdapter
        public void sendMessage(@NotNull C29288U1 message) {
            C32917q videoChatController;
            if (SNSVideoIdentFragment.this.getServiceLocatorSafe() == null) {
                AbstractC32895a.m71366a("sendMessage failed. Detached from activity");
                return;
            }
            String strAsJson = asJson(message);
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            videoChatController.m71376a(strAsJson);
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$1", m90122f = "SNSVideoIdentFragment.kt", m90123i = {}, m90124l = {636}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329301 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C32917q $videoChatController;
        int label;
        final /* synthetic */ SNSVideoIdentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C329301(C32917q c32917q, SNSVideoIdentFragment sNSVideoIdentFragment, Continuation<? super C329301> continuation) {
            super(2, continuation);
            this.$videoChatController = c32917q;
            this.this$0 = sNSVideoIdentFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C329301(this.$videoChatController, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C329301) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41673r interfaceC41673r = this.$videoChatController.f67344p;
                final SNSVideoIdentFragment sNSVideoIdentFragment = this.this$0;
                InterfaceC41635f interfaceC41635f = new InterfaceC41635f() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment.attachChatControllerListeners.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        AbstractC32895a.m71366a("handling message: " + str);
                        Object objOnChatMessage = sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onChatMessage(str, continuation);
                        return objOnChatMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnChatMessage : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC41673r.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$2 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "state", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$2", m90122f = "SNSVideoIdentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C329312 extends SuspendLambda implements Function2<SNSVideoChatState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SNSVideoChatState sNSVideoChatState, Continuation<? super Unit> continuation) {
            return ((C329312) create(sNSVideoChatState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C329312(Continuation<? super C329312> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329312 c329312 = SNSVideoIdentFragment.this.new C329312(continuation);
            c329312.L$0 = obj;
            return c329312;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SNSVideoChatState sNSVideoChatState = (SNSVideoChatState) this.L$0;
                if (sNSVideoChatState instanceof C32923x) {
                    if (SNSVideoIdentFragment.this.serviceConnection.getConnected()) {
                        AbstractC32895a.m71366a("exiting foreground");
                        SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
                        if (service != null && service.getIsInForeground()) {
                            ServiceCompat.stopForeground(service, 1);
                        }
                        Boxing.boxBoolean(SNSVideoIdentFragment.this.requireActivity().stopService(new Intent(SNSVideoIdentFragment.this.requireContext(), (Class<?>) SNSVideoChatService.class)));
                    } else {
                        Logger.DefaultImpls.e$default(C33272c.f67812a, "SumSubVideoIdent", "SNSDisconnected but service is NOT connected", null, 4, null);
                    }
                }
                SNSVideoIdentFragment.this.getViewModel$idensic_mobile_sdk_aar_defaultRelease().handleVideoChatState(sNSVideoChatState);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doStartServiceAndConnectToRoom(String accessToken, String roomName) {
        C32917q videoChatController;
        AbstractC32895a.m71366a("doStartServiceAndConnectToRoom: token=" + accessToken.substring(0, 5) + ", room=" + roomName);
        SNSVideoChatService service = this.serviceConnection.getService();
        if (!(service != null ? service.getIsInForeground() : false)) {
            AbstractC32895a.m71366a("starting foreground");
            SNSVideoChatServiceLauncher sNSVideoChatServiceLauncher = SNSVideoChatServiceLauncher.INSTANCE;
            Context contextRequireContext = requireContext();
            if (!AbstractC28413P0.f57921a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            SNSSession sNSSession = AbstractC28413P0.f57923c;
            if (sNSSession == null) {
                sNSSession = null;
            }
            sNSVideoChatServiceLauncher.launch(contextRequireContext, sNSSession, getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58154K.f58215c);
        }
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 == null || (videoChatController = service2.getVideoChatController()) == null) {
            return;
        }
        videoChatController.m71373a(requireContext(), accessToken, roomName);
    }

    private final void applyVideoViewSize(View videoView, float aspectRatio) {
        AbstractC32895a.m71366a("applying video aspectRatio " + aspectRatio);
        Rect rectCalcRectSize = calcRectSize((getResources().getDisplayMetrics().widthPixels / 2) - (getResources().getDimensionPixelSize(R$dimen.sns_margin_medium) * 2), aspectRatio);
        ViewGroup.LayoutParams layoutParams = videoView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = rectCalcRectSize.width();
        layoutParams.height = rectCalcRectSize.height();
        videoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachChatControllerListeners(C32917q videoChatController) {
        this.chatMessagesCollectJob = C41696j.m91104d(this.fragmentScope, null, null, new C329301(videoChatController, this, null), 3, null);
        this.chatStateCollectJob = AbstractC28421U.m69305b(videoChatController.f67342n, this, new C329312(null));
        videoChatController.f67345q = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.attachChatControllerListeners$lambda$40(this.f67382b);
            }
        };
        videoChatController.f67347s = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.attachChatControllerListeners$lambda$41(this.f67385b);
            }
        };
        videoChatController.f67346r = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentFragment.attachChatControllerListeners$lambda$42(this.f67387b, (Bitmap) obj);
            }
        };
        videoChatController.f67343o = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentFragment.attachChatControllerListeners$lambda$43(this.f67389b, ((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachChatControllerListeners$lambda$40(final SNSVideoIdentFragment sNSVideoIdentFragment) {
        sNSVideoIdentFragment.showPhotoMadeAnimation(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.attachChatControllerListeners$lambda$40$lambda$39(this.f67390b);
            }
        });
        return Unit.INSTANCE;
    }

    private final Rect calcRectSize(int maxSideSize, float aspectRatio) {
        int i11;
        if (aspectRatio < 1.0f) {
            int i12 = (int) (maxSideSize * aspectRatio);
            i11 = maxSideSize;
            maxSideSize = i12;
        } else {
            i11 = (int) (maxSideSize / aspectRatio);
        }
        return new Rect(0, 0, maxSideSize, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachChatControllerListeners(C32917q videoChatController) {
        InterfaceC41775x1 interfaceC41775x1 = this.chatMessagesCollectJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            this.chatMessagesCollectJob = null;
        }
        videoChatController.f67347s = null;
        videoChatController.f67346r = null;
        videoChatController.f67343o = null;
    }

    private final Map<String, Object> getCommonPayload() {
        return MapsKt.mapOf(TuplesKt.m90091to("callState", this.callState.getValue()), TuplesKt.m90091to("shouldConfirmExit", Boolean.valueOf(this.exitConfirmationDialog != null)), TuplesKt.m90091to("fromScreen", getScreen().getText()));
    }

    private final void handleFileSelectedForDocSetType(String docSetType, Uri uri) {
        AbstractC32895a.m71366a("handleFileSelectedForDocSetType: " + docSetType + ", " + uri);
        if (uri == null) {
            return;
        }
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().handleFileSelectedForDocSetType(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenPhoneVerificationResult$lambda$33(SNSVideoIdentFragment sNSVideoIdentFragment, String str, Bundle bundle) {
        AbstractC28133l.Companion.getClass();
        sNSVideoIdentFragment.onPhoneVerificationResult(bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY));
    }

    private final void onPhoneVerificationResult(int code) {
        PhoneVerificationStatus phoneVerificationStatus;
        AbstractC32895a.m71366a("onPhoneVerificationResult: code=" + code);
        if (code == 1) {
            hidePhoneVerification();
            phoneVerificationStatus = PhoneVerificationStatus.SUCCESS;
        } else if (code == 2) {
            phoneVerificationStatus = PhoneVerificationStatus.REQUESTED;
        } else if (code == 4) {
            phoneVerificationStatus = PhoneVerificationStatus.RETRY_CODE;
        } else if (code != 5) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, "SumSubVideoIdent", "Unknown verification code " + code, null, 4, null);
            phoneVerificationStatus = null;
        } else {
            hidePhoneVerification();
            phoneVerificationStatus = PhoneVerificationStatus.CANCELED;
        }
        AbstractC32895a.m71366a("onPhoneVerificationResult: " + phoneVerificationStatus);
        if (phoneVerificationStatus != null) {
            getViewModel$idensic_mobile_sdk_aar_defaultRelease().handlePhoneVerificationStatus(phoneVerificationStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17(Context context, SNSVideoIdentFragment sNSVideoIdentFragment, boolean z11) {
        SNSVideoChatServiceLauncher.INSTANCE.stop(context);
        if (z11) {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(sNSVideoIdentFragment, new C28494t(false), null, null, 6, null);
        } else {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(sNSVideoIdentFragment, C28491s.f58027b, null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(SNSVideoIdentFragment sNSVideoIdentFragment, String str) {
        C28710y c28710y = sNSVideoIdentFragment.pickerLifecycleObserver;
        if (c28710y == null) {
            c28710y = null;
        }
        c28710y.m69536a(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionHandler$lambda$2(SNSVideoIdentFragment sNSVideoIdentFragment, AbstractC28637L abstractC28637L) {
        return (abstractC28637L instanceof C28634I) && sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().m71422x439e048a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permissionHandler$lambda$4(SNSVideoIdentFragment sNSVideoIdentFragment) {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(sNSVideoIdentFragment, C28491s.f58027b, null, null, 6, null);
        return Unit.INSTANCE;
    }

    private final boolean releaseCurrentStatePreviewIfChanged(SNSViewState newState) {
        Bitmap previewImage;
        SNSViewState sNSViewState = this.currentViewState;
        SNSViewState.StateWithVideo stateWithVideo = sNSViewState instanceof SNSViewState.StateWithVideo ? (SNSViewState.StateWithVideo) sNSViewState : null;
        if (stateWithVideo == null || (previewImage = stateWithVideo.getPreviewImage()) == null) {
            return false;
        }
        SNSViewState.StateWithVideo stateWithVideo2 = newState instanceof SNSViewState.StateWithVideo ? (SNSViewState.StateWithVideo) newState : null;
        if (stateWithVideo2 == null || Intrinsics.areEqual(stateWithVideo2.getPreviewImage(), previewImage)) {
            return false;
        }
        AbstractC32895a.m71366a("handleViewStateChange: releasing previewImage");
        previewImage.recycle();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmationState$lambda$69$lambda$68(SNSVideoIdentFragment sNSVideoIdentFragment, DialogInterface dialogInterface) {
        AlertDialog alertDialog = sNSVideoIdentFragment.exitConfirmationDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPhoneVerificationFragment() {
        AbstractC28133l c32840y;
        if (C33048a.f67476i.m71434a()) {
            ValidationIdentifierType validationIdentifierType = ValidationIdentifierType.PHONE;
            boolean zM71434a = C33048a.f67469c0.m71434a();
            c32840y = new C32840y();
            Bundle bundle = new Bundle();
            bundle.putParcelable("VerificationType", validationIdentifierType);
            bundle.putBoolean("VerificationEmbedded", true);
            bundle.putBoolean("SendPhoneCodeImmediately", zM71434a);
            c32840y.setArguments(bundle);
        } else {
            C32709e c32709e = C32730p.f66964p;
            ValidationIdentifierType validationIdentifierType2 = ValidationIdentifierType.PHONE;
            boolean zM71434a2 = C33048a.f67469c0.m71434a();
            c32709e.getClass();
            C32730p c32730p = new C32730p();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("ValidationIdentifier", validationIdentifierType2);
            bundle2.putBoolean("SendPhoneCodeImmediately", zM71434a2);
            c32730p.setArguments(bundle2);
            c32840y = c32730p;
        }
        getChildFragmentManager().beginTransaction().replace(R$id.phone_verification_fragment, c32840y.forResult(VERIFICATION_REQUEST_KEY)).addToBackStack("phone_verification_fragment").commitAllowingStateLoss();
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(true);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setState(3);
        }
    }

    private final void startBottomAnimation(SNSViewState.StateWithVideo state) {
        SNSViewState sNSViewState = this.currentViewState;
        SNSViewState.StateWithVideo stateWithVideo = sNSViewState instanceof SNSViewState.StateWithVideo ? (SNSViewState.StateWithVideo) sNSViewState : null;
        if (stateWithVideo == null) {
            return;
        }
        if (!stateWithVideo.getDocuments().isEmpty() && !state.getShowProgress()) {
            ViewGroup bottomSheet = getBottomSheet();
            if (bottomSheet != null) {
                TransitionManager.beginDelayedTransition(bottomSheet);
                return;
            }
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        Fade fade = new Fade(1);
        transitionSet.addTransition(fade);
        transitionSet.addTransition(new ChangeBounds());
        Fade fade2 = new Fade(2);
        fade2.setStartDelay(fade.getDuration());
        transitionSet.addTransition(fade2);
        ViewGroup bottomSheet2 = getBottomSheet();
        if (bottomSheet2 != null) {
            TransitionManager.beginDelayedTransition(bottomSheet2, transitionSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchCameraAndUpdateMirroring() {
        C32917q videoChatController;
        C33046f videoCapturer;
        SNSVideoChatService service = this.serviceConnection.getService();
        if (service == null || (videoChatController = service.getVideoChatController()) == null) {
            return;
        }
        LocalVideoTrack localVideoTrack = videoChatController.f67338j;
        SNSVideoChatController$CameraId sNSVideoChatController$CameraId = null;
        if (localVideoTrack != null && (videoCapturer = localVideoTrack.getVideoCapturer()) != null) {
            C33046f c33046f = videoCapturer instanceof C33046f ? videoCapturer : null;
            if (c33046f != null) {
                try {
                    CameraCapturerCompat$Source cameraCapturerCompat$SourceM71429b = c33046f.m71429b();
                    if (cameraCapturerCompat$SourceM71429b != null) {
                        sNSVideoChatController$CameraId = cameraCapturerCompat$SourceM71429b == CameraCapturerCompat$Source.FRONT_CAMERA ? SNSVideoChatController$CameraId.FRONT : SNSVideoChatController$CameraId.BACK;
                    }
                } catch (TwilioException e11) {
                    C33272c c33272c = C33272c.f67812a;
                    C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(SNSVideoIdent.logTag, "error switching camera", e11);
                    AbstractC32895a.m71366a(AbstractC33047g.m71430a(e11));
                }
            }
        }
        if (sNSVideoChatController$CameraId != null) {
            VideoView localVideoView = getLocalVideoView();
            if (localVideoView != null) {
                localVideoView.setMirror(sNSVideoChatController$CameraId == SNSVideoChatController$CameraId.FRONT);
            }
            AbstractC32895a.m71366a("switchCamera: " + sNSVideoChatController$CameraId);
        }
    }

    private final void updateRecordTimerText() {
        C32917q videoChatController;
        Calendar calendar = this.calendar;
        SNSVideoChatService service = this.serviceConnection.getService();
        long jCoerceAtLeast = 0;
        if (service != null && (videoChatController = service.getVideoChatController()) != null && videoChatController.f67332d) {
            jCoerceAtLeast = RangesKt.coerceAtLeast(System.currentTimeMillis() - videoChatController.f67331c, 0L);
        }
        calendar.setTimeInMillis(jCoerceAtLeast);
        TextView recordTime = getRecordTime();
        if (recordTime != null) {
            recordTime.setText(this.shortTimeFormat.format(this.calendar.getTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(SNSVideoIdentFragment sNSVideoIdentFragment) {
        return new SNSVideoIdentViewModelFactory(sNSVideoIdentFragment.getDocuments(), sNSVideoIdentFragment, sNSVideoIdentFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), sNSVideoIdentFragment.getArguments(), sNSVideoIdentFragment.videoChatAdapter, sNSVideoIdentFragment.uriContentLoader);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public String getF63684h() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_video_ident);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public SNSVideoIdentViewModel getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (SNSVideoIdentViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleState(@NotNull SNSViewState state, @Nullable Bundle savedInstanceState) {
        AnalyticsCallState analyticsState;
        Bitmap bitmap;
        VideoView localVideoView;
        Boolean boolValueOf;
        ViewGroup bottomSheet;
        AbstractC32895a.m71366a("handleState: " + state);
        boolean z11 = state instanceof SNSViewState.Loading;
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().showProgress(z11);
        View view = getView();
        if (view != null) {
            view.setVisibility((z11 || (state instanceof SNSViewState.Permissions)) ? 8 : 0);
        }
        ViewGroup languageSection = getLanguageSection();
        if (languageSection != null) {
            languageSection.setVisibility(state.isPreview() ? 0 : 8);
        }
        if (state instanceof SNSViewState.Permissions) {
            this.permissionHandler.m69523s();
        }
        if (state instanceof SNSViewState.EnterPhone) {
            handleEnterPhone();
        }
        if (state instanceof SNSViewState.LanguageSelection) {
            handleSelectLanguage((SNSViewState.LanguageSelection) state);
        }
        SNSViewState sNSViewState = this.currentViewState;
        boolean zReleaseCurrentStatePreviewIfChanged = releaseCurrentStatePreviewIfChanged(state);
        this.currentViewState = state;
        boolean z12 = state instanceof SNSViewState.StateWithVideo;
        SNSViewState.StateWithVideo stateWithVideo = z12 ? (SNSViewState.StateWithVideo) state : null;
        if (stateWithVideo == null || (analyticsState = stateWithVideo.getAnalyticsState()) == null) {
            analyticsState = AnalyticsCallState.PREPARING;
        }
        AnalyticsCallState analyticsCallState = this.callState;
        boolean z13 = analyticsCallState == AnalyticsCallState.COMPLETED && analyticsState == AnalyticsCallState.PREPARING;
        if (z11 || analyticsState == analyticsCallState || z13) {
            analyticsState = null;
        }
        if (analyticsState != null) {
            this.callState = analyticsState;
            AbstractC32895a.m71366a("handleViewStateChange: callState=" + analyticsState);
        }
        if (!z12) {
            ViewGroup bottomSheet2 = getBottomSheet();
            if (bottomSheet2 != null) {
                bottomSheet2.setVisibility(8);
            }
            TextView recordTime = getRecordTime();
            if (recordTime != null) {
                recordTime.setVisibility(8);
            }
            ImageView switchCamera = getSwitchCamera();
            if (switchCamera != null) {
                switchCamera.setVisibility(8);
            }
            View remoteVideoContainer = getRemoteVideoContainer();
            if (remoteVideoContainer != null) {
                remoteVideoContainer.setVisibility(8);
            }
            this.exitConfirmationDialog = null;
            return;
        }
        if (state.isPreview()) {
            updateLanguageSection((SNSViewState.StateWithVideo) state);
        }
        SNSWarningView message = getMessage();
        if (message != null) {
            CharSequence message2 = ((SNSViewState.StateWithVideo) state).getMessage();
            message.setVisibility((message2 == null || message2.length() == 0) ? 8 : 0);
        }
        SNSViewState.StateWithVideo stateWithVideo2 = (SNSViewState.StateWithVideo) state;
        if (stateWithVideo2.getShowBottomSheet() && (bottomSheet = getBottomSheet()) != null && bottomSheet.getVisibility() == 0 && (sNSViewState instanceof SNSViewState.StateWithVideo)) {
            SNSViewState.StateWithVideo stateWithVideo3 = (SNSViewState.StateWithVideo) sNSViewState;
            if (stateWithVideo2.getState() != stateWithVideo3.getState() || stateWithVideo2.getShowProgress() != stateWithVideo3.getShowProgress()) {
                startBottomAnimation(stateWithVideo2);
            }
        }
        updateRemoteVideoView(stateWithVideo2.getRemoteVideoState());
        Button bottomPrimaryButton = getBottomPrimaryButton();
        if (bottomPrimaryButton != null) {
            updateBottomPrimaryButton(bottomPrimaryButton, stateWithVideo2);
        }
        Button bottomSecondaryButton = getBottomSecondaryButton();
        if (bottomSecondaryButton != null) {
            CharSequence bottomSecondaryButtonText = stateWithVideo2.getBottomSecondaryButtonText();
            bottomSecondaryButton.setVisibility((bottomSecondaryButtonText == null || bottomSecondaryButtonText.length() == 0) ? 8 : 0);
            bottomSecondaryButton.setText(stateWithVideo2.getBottomSecondaryButtonText());
            bottomSecondaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SNSVideoIdentFragment.handleState$lambda$58$lambda$57(this.f67399b, view2);
                }
            });
        }
        Button bottomTertiaryButton = getBottomTertiaryButton();
        if (bottomTertiaryButton != null) {
            CharSequence bottomTertiaryButtonText = stateWithVideo2.getBottomTertiaryButtonText();
            bottomTertiaryButton.setVisibility((bottomTertiaryButtonText == null || bottomTertiaryButtonText.length() == 0) ? 8 : 0);
            bottomTertiaryButton.setText(stateWithVideo2.getBottomTertiaryButtonText());
            bottomTertiaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SNSVideoIdentFragment.handleState$lambda$60$lambda$59(this.f67424b, view2);
                }
            });
        }
        SNSWarningView message3 = getMessage();
        if (message3 != null) {
            message3.setSubtitle(stateWithVideo2.getMessage());
            message3.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
        }
        TextView recordTime2 = getRecordTime();
        if (recordTime2 != null) {
            recordTime2.setVisibility(stateWithVideo2.getShowRecordTimer() ? 0 : 8);
        }
        updateRecordTimerText();
        ViewGroup documentList = getDocumentList();
        if (documentList != null) {
            documentList.setVisibility(stateWithVideo2.getDocuments().isEmpty() ? 8 : 0);
        }
        ViewGroup documentList2 = getDocumentList();
        if (documentList2 != null) {
            documentList2.removeAllViews();
            if (stateWithVideo2.getDocuments().isEmpty()) {
                documentList2 = null;
            }
            if (documentList2 != null) {
                populateDocumentList(documentList2, stateWithVideo2.getDocuments());
            }
        }
        CharSequence bottomSheetText = stateWithVideo2.getBottomSheetText();
        boolean z14 = bottomSheetText == null || bottomSheetText.length() == 0;
        TextView bottomText = getBottomText();
        if (bottomText != null) {
            bottomText.setVisibility(!z14 ? 0 : 8);
        }
        TextView bottomText2 = getBottomText();
        if (bottomText2 != null) {
            CharSequence bottomSheetText2 = stateWithVideo2.getBottomSheetText();
            bottomText2.setText(bottomSheetText2 != null ? AbstractC28462i0.m69364a(bottomSheetText2, requireContext()) : null);
        }
        if (!z14) {
            CharSequence bottomSheetTitle = stateWithVideo2.getBottomSheetTitle();
            int dimensionPixelSize = (bottomSheetTitle == null || bottomSheetTitle.length() == 0) ? 0 : getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
            TextView bottomText3 = getBottomText();
            ViewGroup.LayoutParams layoutParams = bottomText3 != null ? bottomText3.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = dimensionPixelSize;
            }
        }
        TextView bottomTitle = getBottomTitle();
        if (bottomTitle != null) {
            CharSequence bottomSheetTitle2 = stateWithVideo2.getBottomSheetTitle();
            bottomTitle.setVisibility((bottomSheetTitle2 == null || bottomSheetTitle2.length() == 0) ? 8 : 0);
        }
        TextView bottomTitle2 = getBottomTitle();
        if (bottomTitle2 != null) {
            bottomTitle2.setText(stateWithVideo2.getBottomSheetTitle());
        }
        if (!this.serviceConnection.getConnected()) {
            VideoView localVideoView2 = getLocalVideoView();
            if (localVideoView2 != null) {
                boolValueOf = Boolean.valueOf(localVideoView2.getVisibility() == 0);
            } else {
                boolValueOf = null;
            }
            AbstractC32895a.m71366a("handleViewStateChange: localViewViewVisible=" + boolValueOf + ", serviceConnected=" + this.serviceConnection.getConnected());
        }
        if (state.getHasVideo() && ((((localVideoView = getLocalVideoView()) != null && localVideoView.getVisibility() != 0) || this.currentViewState == null) && !this.serviceConnection.getConnected())) {
            VideoView localVideoView3 = getLocalVideoView();
            if (localVideoView3 != null) {
                localVideoView3.setVisibility(8);
            }
            ImageView switchCamera2 = getSwitchCamera();
            if (switchCamera2 != null) {
                switchCamera2.setVisibility(8);
            }
            Intent intent = new Intent(requireContext(), (Class<?>) SNSVideoChatService.class);
            AbstractC32895a.m71366a("handleViewStateChange: connecting to service ...");
            requireActivity().bindService(intent, this.serviceConnection, 1);
            return;
        }
        ViewGroup photoPreviewContainer = getPhotoPreviewContainer();
        if (photoPreviewContainer != null) {
            photoPreviewContainer.setVisibility(stateWithVideo2.getPreviewImage() != null ? 0 : 8);
        }
        ImageView photoPreview = getPhotoPreview();
        if (photoPreview != null) {
            Bitmap previewImage = stateWithVideo2.getPreviewImage();
            Drawable drawable = photoPreview.getDrawable();
            if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                if (!zReleaseCurrentStatePreviewIfChanged) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            photoPreview.setImageBitmap(previewImage);
        }
        VideoView localVideoView4 = getLocalVideoView();
        if (localVideoView4 != null) {
            localVideoView4.setVisibility(stateWithVideo2.getShowLocalVideo() ? 0 : 8);
        }
        ImageView switchCamera3 = getSwitchCamera();
        if (switchCamera3 != null) {
            switchCamera3.setVisibility(stateWithVideo2.getShowSwitchCamera() ? 0 : 8);
        }
        ViewGroup bottomSheet3 = getBottomSheet();
        if (bottomSheet3 != null) {
            bottomSheet3.setVisibility(stateWithVideo2.getShowBottomSheet() ? 0 : 8);
        }
        ViewGroup bottomSheet4 = getBottomSheet();
        if (bottomSheet4 != null) {
            bottomSheet4.setVisibility(stateWithVideo2.getShowBottomSheet() ? 0 : 8);
        }
        View bottomProgressBar = getBottomProgressBar();
        if (bottomProgressBar != null) {
            bottomProgressBar.setVisibility(!stateWithVideo2.getShowProgress() ? 8 : 0);
        }
        SNSWarningView bottomWarning = getBottomWarning();
        if (bottomWarning != null) {
            bottomWarning.setVisibility(stateWithVideo2.getBottomWarning() != null ? 0 : 8);
        }
        SNSWarning bottomWarning2 = stateWithVideo2.getBottomWarning();
        if (bottomWarning2 != null) {
            SNSWarningView bottomWarning3 = getBottomWarning();
            if (bottomWarning3 != null) {
                bottomWarning3.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
            }
            SNSWarningView bottomWarning4 = getBottomWarning();
            if (bottomWarning4 != null) {
                bottomWarning4.setTitle(bottomWarning2.getTitle());
            }
            SNSWarningView bottomWarning5 = getBottomWarning();
            if (bottomWarning5 != null) {
                bottomWarning5.setSubtitle(bottomWarning2.getText());
            }
        }
        TypedArray typedArrayObtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{C0467R.attr.actionBarSize});
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.exitConfirmationDialog == null && stateWithVideo2.getConfirmExitDialog() != null) {
            showExitConfirmationState(stateWithVideo2);
        } else if (stateWithVideo2.getConfirmExitDialog() == null) {
            AlertDialog alertDialog = this.exitConfirmationDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.exitConfirmationDialog = null;
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C41713n0.m91129e(this.fragmentScope, null, 1, null);
        SNSVideoChatService service = this.serviceConnection.getService();
        if (service != null) {
            detachChatControllerListeners(service.getVideoChatController());
        }
        if (this.serviceConnection.getConnected()) {
            AbstractC32895a.m71366a("handleViewStateChange: disconnecting from service ...");
            requireActivity().unbindService(this.serviceConnection);
        }
        super.onDestroyView();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public boolean onFinishCalled(@NotNull AbstractC28503w finishReason) {
        boolean zAreEqual = Intrinsics.areEqual(finishReason, C28497u.f58029b);
        if (zAreEqual && hideLanguageSelection()) {
            getViewModel$idensic_mobile_sdk_aar_defaultRelease().handleLanguageSelectionResult(null);
            return false;
        }
        if (zAreEqual && hidePhoneVerification()) {
            getViewModel$idensic_mobile_sdk_aar_defaultRelease().handlePhoneVerificationStatus(PhoneVerificationStatus.CANCELED);
            return false;
        }
        if (!zAreEqual) {
            m69084e();
            return true;
        }
        AlertDialog alertDialog = this.exitConfirmationDialog;
        if (alertDialog != null) {
            SNSAlertDialogBuilder.INSTANCE.showWithThemeExtension(alertDialog);
        } else {
            getViewModel$idensic_mobile_sdk_aar_defaultRelease().onBackPressed();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$uriContentLoader$1] */
    public SNSVideoIdentFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.viewModel_delegate$lambda$0(this.f67394b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SNSVideoIdentViewModel.class), new Function0<ViewModelStore>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        this.screen = Screen.VideoidentScreen;
        this.idDocSetType = "VIDEO_IDENT";
        this.previousVolumeControlStream = Integer.MIN_VALUE;
        this.permissionHandler = new C28707v(this, SetsKt.setOf((Object[]) new AbstractC28637L[]{C28626A.f58259e, C28632G.f58262e, new C28634I(SNSVideoChatService.NOTIFICATION_CHANNEL_ID)}), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.permissionHandler$lambda$1(this.f67396b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SNSVideoIdentFragment.permissionHandler$lambda$2(this.f67398b, (AbstractC28637L) obj));
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.permissionHandler$lambda$3(this.f67400b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.permissionHandler$lambda$4(this.f67403b);
            }
        });
        this.callState = AnalyticsCallState.PREPARING;
        this.serviceConnection = new SNSVideoIdentFragment$serviceConnection$1(this);
        this.shortTimeFormat = new SimpleDateFormat("mm:ss", Locale.US);
        this.calendar = Calendar.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachChatControllerListeners$lambda$40$lambda$39(SNSVideoIdentFragment sNSVideoIdentFragment) {
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onDecodingPhotoFrame();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachChatControllerListeners$lambda$41(SNSVideoIdentFragment sNSVideoIdentFragment) {
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onPhotoMakeError();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachChatControllerListeners$lambda$42(SNSVideoIdentFragment sNSVideoIdentFragment, Bitmap bitmap) {
        AbstractC32895a.m71366a("onPhotoMade: w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight());
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onPhotoMade(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachChatControllerListeners$lambda$43(SNSVideoIdentFragment sNSVideoIdentFragment, long j11) {
        sNSVideoIdentFragment.updateRecordTimerText();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateExpandedOffset(CoordinatorLayout parent) {
        int dimensionPixelSize;
        int height = 0;
        if (getContext() instanceof Activity) {
            TypedArray typedArrayObtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{C0467R.attr.actionBarSize});
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0;
        }
        int measuredHeight = requireActivity().findViewById(R$id.above_bottom_sheet_container).getMeasuredHeight() + dimensionPixelSize;
        SNSWarningView message = getMessage();
        if (message != null && message.getVisibility() == 0) {
            measuredHeight += message.getHeight();
        }
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null && remoteVideoContainer.getVisibility() == 0) {
            measuredHeight += remoteVideoContainer.getHeight();
        }
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(parent.getHeight() - measuredHeight, Integer.MIN_VALUE));
            height = parent.getHeight() - bottomSheet.getMeasuredHeight();
        }
        return Math.max(height, measuredHeight);
    }

    private final Button getBottomPrimaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button1);
        }
        return null;
    }

    private final View getBottomProgressBar() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return bottomSheet.findViewById(R$id.sns_vi_bottom_progress_bar);
        }
        return null;
    }

    private final Button getBottomSecondaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button2);
        }
        return null;
    }

    private final ViewGroup getBottomSheet() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.sns_web_view_bottom_sheet);
        }
        return null;
    }

    private final Button getBottomTertiaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button3);
        }
        return null;
    }

    private final TextView getBottomText() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_text);
        }
        return null;
    }

    private final TextView getBottomTitle() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_title);
        }
        return null;
    }

    private final SNSWarningView getBottomWarning() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (SNSWarningView) bottomSheet.findViewById(R$id.sns_warning);
        }
        return null;
    }

    private final TextView getChangeLanguage() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_button);
        }
        return null;
    }

    private final ViewGroup getDocumentList() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.documents);
        }
        return null;
    }

    private final List<Document> getDocuments() {
        List<Document> list;
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(ARG_DOCS);
        if (parcelableArrayList != null && (list = CollectionsKt.toList(parcelableArrayList)) != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    private final TextView getLanguage() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_label);
        }
        return null;
    }

    private final ViewGroup getLanguageSection() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.language_section);
        }
        return null;
    }

    private final TextView getLanguageSectionTitle() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_language_section_title);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoView getLocalVideoView() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.local_video_view);
        }
        return null;
    }

    private final SNSWarningView getMessage() {
        View view = getView();
        if (view != null) {
            return (SNSWarningView) view.findViewById(R$id.message);
        }
        return null;
    }

    private final TextView getOperatorName() {
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null) {
            return (TextView) remoteVideoContainer.findViewById(R$id.title);
        }
        return null;
    }

    private final ViewGroup getPhoneVerificationBottomSheet() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.phone_verification_bottom_sheet);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getPhotoMadeIndicator() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.photo_made_indicator);
        }
        return null;
    }

    private final ImageView getPhotoPreview() {
        ViewGroup photoPreviewContainer = getPhotoPreviewContainer();
        if (photoPreviewContainer != null) {
            return (ImageView) photoPreviewContainer.findViewById(R$id.sns_photo);
        }
        return null;
    }

    private final ViewGroup getPhotoPreviewContainer() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.sns_photo_preview);
        }
        return null;
    }

    private final TextView getRecordTime() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.timer);
        }
        return null;
    }

    private final View getRemoteVideoContainer() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.remote_video);
        }
        return null;
    }

    private final VideoTextureView getRemoteVideoView() {
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null) {
            return remoteVideoContainer.findViewById(R$id.remote_video_view);
        }
        return null;
    }

    private final ImageView getSwitchCamera() {
        View view = getView();
        if (view != null) {
            return (ImageView) view.findViewById(R$id.switchCamera);
        }
        return null;
    }

    private final void handleEnterPhone() {
        getChildFragmentManager().beginTransaction().replace(R$id.phone_verification_fragment, EnterPhoneFragment.INSTANCE.newInstance().forResult(ENTER_PHONE_REQUEST_KEY)).addToBackStack("enter_phone_fragment").commitAllowingStateLoss();
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setDraggable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEnterPhoneResult() {
        hideEnterPhone();
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().handleEnterPhoneResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLanguageSelectionResult(Bundle result) {
        hideLanguageSelection();
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().handleLanguageSelectionResult(result.getString("lang"));
    }

    private final void handleSelectLanguage(SNSViewState.LanguageSelection state) {
        getChildFragmentManager().beginTransaction().replace(R$id.phone_verification_fragment, LanguageSelectionFragment.INSTANCE.getInstance(state).forResult(LANGUAGE_REQUEST_KEY)).addToBackStack("language_fragment").commitAllowingStateLoss();
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setDraggable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleState$lambda$58$lambda$57(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onUploadCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleState$lambda$60$lambda$59(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onTertiaryButtonClick();
    }

    private final boolean hideEnterPhone() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.phone_verification_fragment);
        if (fragmentFindFragmentById != null) {
            if (!(fragmentFindFragmentById instanceof EnterPhoneFragment)) {
                fragmentFindFragmentById = null;
            }
            if (fragmentFindFragmentById != null) {
                getChildFragmentManager().popBackStack();
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean hideLanguageSelection() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.phone_verification_fragment);
        if (fragmentFindFragmentById != null) {
            if (!(fragmentFindFragmentById instanceof LanguageSelectionFragment)) {
                fragmentFindFragmentById = null;
            }
            if (fragmentFindFragmentById != null) {
                getChildFragmentManager().popBackStack();
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hidePhoneVerification() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.phone_verification_fragment);
        if (fragmentFindFragmentById != null) {
            if (!(fragmentFindFragmentById instanceof C32840y) && !(fragmentFindFragmentById instanceof C32730p)) {
                fragmentFindFragmentById = null;
            }
            if (fragmentFindFragmentById != null) {
                getChildFragmentManager().popBackStack();
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private final void listenEnterPhoneResult() {
        getChildFragmentManager().setFragmentResultListener(ENTER_PHONE_REQUEST_KEY, requireActivity(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.t
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                this.f67418a.handleEnterPhoneResult();
            }
        });
    }

    private final void listenPhoneVerificationResult() {
        getChildFragmentManager().setFragmentResultListener(VERIFICATION_REQUEST_KEY, requireActivity(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.s
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                SNSVideoIdentFragment.listenPhoneVerificationResult$lambda$33(this.f67417a, str, bundle);
            }
        });
    }

    private final void listenSelectLanguageResult() {
        getChildFragmentManager().setFragmentResultListener(LANGUAGE_REQUEST_KEY, requireActivity(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.u
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                this.f67419a.handleLanguageSelectionResult(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(SNSVideoIdentFragment sNSVideoIdentFragment, String str, Uri uri) {
        sNSVideoIdentFragment.handleFileSelectedForDocSetType(str, uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$20(final View view, final SNSVideoIdentFragment sNSVideoIdentFragment) {
        if (view.isAttachedToWindow()) {
            try {
                sNSVideoIdentFragment.hidePhoneVerification();
            } catch (Throwable th2) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "hidePhoneVerification failed", th2);
            }
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$onViewCreated$lambda$20$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    try {
                        sNSVideoIdentFragment.hidePhoneVerification();
                    } catch (Throwable th3) {
                        C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "hidePhoneVerification failed", th3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$22(final View view, final SNSVideoIdentFragment sNSVideoIdentFragment) {
        if (view.isAttachedToWindow()) {
            try {
                sNSVideoIdentFragment.showPhoneVerificationFragment();
            } catch (Throwable th2) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "showPhoneVerificationFragment failed", th2);
            }
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$onViewCreated$lambda$22$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    try {
                        sNSVideoIdentFragment.showPhoneVerificationFragment();
                    } catch (Throwable th3) {
                        C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "showPhoneVerificationFragment failed", th3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C28651g permissionHandler$lambda$1(SNSVideoIdentFragment sNSVideoIdentFragment) {
        return sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().getPermissionsController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permissionHandler$lambda$3(SNSVideoIdentFragment sNSVideoIdentFragment) {
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onMediaReady();
        return Unit.INSTANCE;
    }

    private final void populateDocumentList(ViewGroup documentList, List<SNSStepViewItem> documents) {
        boolean z11;
        Spanned spannedM69364a;
        AbstractC32895a.m71366a("populateDocumentList: count=" + documents.size());
        documentList.removeAllViews();
        int i11 = 0;
        for (Object obj : documents) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SNSStepViewItem sNSStepViewItem = (SNSStepViewItem) obj;
            SNSVideoIdentDocumentView sNSVideoIdentDocumentView = new SNSVideoIdentDocumentView(requireContext(), null, 0, 0, 14, null);
            boolean z12 = true;
            if (sNSStepViewItem.getState() != SNSStepViewItem.State.DEFAULT) {
                z11 = true;
            } else {
                z11 = false;
            }
            sNSVideoIdentDocumentView.setSelected(z11);
            if (sNSStepViewItem.getState() != SNSStepViewItem.State.DONE) {
                z12 = false;
            }
            sNSVideoIdentDocumentView.setActivated(z12);
            String icon = sNSStepViewItem.getIcon();
            if (icon != null) {
                sNSVideoIdentDocumentView.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), icon));
            }
            CharSequence title = sNSStepViewItem.getTitle();
            if (title != null) {
                spannedM69364a = AbstractC28462i0.m69364a(title, requireContext());
            } else {
                spannedM69364a = null;
            }
            sNSVideoIdentDocumentView.setTitle(spannedM69364a);
            documentList.addView(sNSVideoIdentDocumentView);
            i11 = i12;
        }
    }

    private final void showExitConfirmationState(SNSViewState.StateWithVideo state) {
        AlertDialog alertDialogCreate;
        final Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", getScreen().getText()));
        SNSViewState.ConfirmExitDialog confirmExitDialog = state.getConfirmExitDialog();
        if (confirmExitDialog != null && (alertDialogCreate = new SNSAlertDialogBuilder(requireContext()).setMessage(confirmExitDialog.getMessage()).setPositiveButton(confirmExitDialog.getButtonPositive(), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SNSVideoIdentFragment.showExitConfirmationState$lambda$69$lambda$66(this.f67420b, mapMapOf, dialogInterface, i11);
            }
        }).setNegativeButton(confirmExitDialog.getButtonNegative(), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SNSVideoIdentFragment.showExitConfirmationState$lambda$69$lambda$67(this.f67422b, mapMapOf, dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SNSVideoIdentFragment.showExitConfirmationState$lambda$69$lambda$68(this.f67425b, dialogInterface);
            }
        }).create()) != null) {
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.z
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    SNSVideoIdentFragment.showExitConfirmationState$lambda$72$lambda$70(this.f67426a, mapMapOf, dialogInterface);
                }
            });
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.a0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SNSVideoIdentFragment.showExitConfirmationState$lambda$72$lambda$71(this.f67374b, mapMapOf, dialogInterface);
                }
            });
        } else {
            alertDialogCreate = null;
        }
        this.exitConfirmationDialog = alertDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmationState$lambda$69$lambda$66(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface, int i11) {
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease;
        dialogInterface.dismiss();
        C28367f analyticsDelegate = sNSVideoIdentFragment.getAnalyticsDelegate();
        Screen screen = sNSVideoIdentFragment.getScreen();
        String idDocSetType = sNSVideoIdentFragment.getF63684h();
        Control control = Control.ConfirmButton;
        Popup popup = Popup.VideoIdentExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69253a(screen, idDocSetType, control, map, popup);
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onBackPressed();
        if (C33048a.f67441D.m71434a() && (appListener$idensic_mobile_sdk_aar_defaultRelease = sNSVideoIdentFragment.getAppListener$idensic_mobile_sdk_aar_defaultRelease()) != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70620a((SNSCompletionResult) SNSCompletionResult.SuccessTermination.INSTANCE, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmationState$lambda$69$lambda$67(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        C28367f analyticsDelegate = sNSVideoIdentFragment.getAnalyticsDelegate();
        Screen screen = sNSVideoIdentFragment.getScreen();
        String idDocSetType = sNSVideoIdentFragment.getF63684h();
        Control control = Control.CancelButton;
        Popup popup = Popup.VideoIdentExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69253a(screen, idDocSetType, control, map, popup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmationState$lambda$72$lambda$70(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface) {
        C28367f analyticsDelegate = sNSVideoIdentFragment.getAnalyticsDelegate();
        Screen screen = sNSVideoIdentFragment.getScreen();
        String idDocSetType = sNSVideoIdentFragment.getF63684h();
        Popup popup = Popup.VideoIdentExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69261b(screen, idDocSetType, map, popup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmationState$lambda$72$lambda$71(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface) {
        C28367f analyticsDelegate = sNSVideoIdentFragment.getAnalyticsDelegate();
        Screen screen = sNSVideoIdentFragment.getScreen();
        String idDocSetType = sNSVideoIdentFragment.getF63684h();
        Popup popup = Popup.VideoIdentExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69254a(screen, idDocSetType, map, popup);
    }

    private final void showPhotoMadeAnimation(final Function0<Unit> finishCallback) {
        View photoMadeIndicator = getPhotoMadeIndicator();
        if (photoMadeIndicator != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$showPhotoMadeAnimation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    View photoMadeIndicator2 = this.this$0.getPhotoMadeIndicator();
                    if (photoMadeIndicator2 != null) {
                        photoMadeIndicator2.setVisibility(8);
                    }
                    finishCallback.invoke();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    View photoMadeIndicator2 = this.this$0.getPhotoMadeIndicator();
                    if (photoMadeIndicator2 != null) {
                        photoMadeIndicator2.setVisibility(0);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }
            });
            photoMadeIndicator.startAnimation(alphaAnimation);
        }
    }

    private final void updateBottomPrimaryButton(Button button, final SNSViewState.StateWithVideo state) {
        int i11;
        if (!state.getShowBottomButton()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        button.setVisibility(i11);
        button.setText(state.getBottomButtonText());
        button.setEnabled(state.getBottomButtonEnabled());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SNSVideoIdentFragment.updateBottomPrimaryButton$lambda$77(state, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBottomPrimaryButton$lambda$77(SNSViewState.StateWithVideo stateWithVideo, SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        ButtonAction bottomButtonAction = stateWithVideo.getBottomButtonAction();
        if (bottomButtonAction != null) {
            if (bottomButtonAction == ButtonAction.START_CALL) {
                C28367f.m69257a(sNSVideoIdentFragment.getAnalyticsDelegate(), Screen.VideoidentScreen, sNSVideoIdentFragment.getF63684h(), Control.StartButton, sNSVideoIdentFragment.getCommonPayload(), 16);
            }
            sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onPrimaryButtonClick(bottomButtonAction);
        }
    }

    private final void updateLanguageSection(SNSViewState.StateWithVideo state) {
        String language;
        String language2;
        String title;
        SNSViewState.StateWithVideo.Companion.LanguageState language3 = state.getLanguage();
        String change = null;
        if (language3 != null) {
            language = language3.getLanguage();
        } else {
            language = null;
        }
        if (language != null) {
            ViewGroup languageSection = getLanguageSection();
            if (languageSection != null) {
                languageSection.setVisibility(0);
            }
            TextView languageSectionTitle = getLanguageSectionTitle();
            if (languageSectionTitle != null) {
                SNSViewState.StateWithVideo.Companion.LanguageState language4 = state.getLanguage();
                if (language4 != null) {
                    title = language4.getTitle();
                } else {
                    title = null;
                }
                AbstractC28458h.m69341a(languageSectionTitle, title);
            }
            TextView language5 = getLanguage();
            if (language5 != null) {
                SNSViewState.StateWithVideo.Companion.LanguageState language6 = state.getLanguage();
                if (language6 != null) {
                    language2 = language6.getLanguage();
                } else {
                    language2 = null;
                }
                AbstractC28458h.m69341a(language5, language2);
            }
            TextView changeLanguage = getChangeLanguage();
            if (changeLanguage != null) {
                SNSViewState.StateWithVideo.Companion.LanguageState language7 = state.getLanguage();
                if (language7 != null) {
                    change = language7.getChange();
                }
                AbstractC28458h.m69341a(changeLanguage, change);
            }
            TextView changeLanguage2 = getChangeLanguage();
            if (changeLanguage2 != null) {
                changeLanguage2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SNSVideoIdentFragment.updateLanguageSection$lambda$65(this.f67392b, view);
                    }
                });
                return;
            }
            return;
        }
        ViewGroup languageSection2 = getLanguageSection();
        if (languageSection2 != null) {
            languageSection2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateLanguageSection$lambda$65(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        C28367f.m69257a(sNSVideoIdentFragment.getAnalyticsDelegate(), sNSVideoIdentFragment.getScreen(), sNSVideoIdentFragment.getF63684h(), Control.ChangeButton, sNSVideoIdentFragment.getCommonPayload(), 16);
        sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onChangeLanguageClick();
    }

    private final void updateRemoteVideoView(RemoteVideoState remoteVideoState) {
        boolean z11;
        CharSequence caption;
        CharSequence caption2;
        int i11;
        Boolean boolValueOf;
        int i12;
        C32917q videoChatController;
        int i13;
        View remoteVideoContainer = getRemoteVideoContainer();
        int i14 = 0;
        if (remoteVideoContainer != null && remoteVideoContainer.getVisibility() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        View remoteVideoContainer2 = getRemoteVideoContainer();
        if (remoteVideoContainer2 != null) {
            if (remoteVideoState != null) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            remoteVideoContainer2.setVisibility(i13);
        }
        VideoTextureView remoteVideoView = getRemoteVideoView();
        View viewFindViewById = null;
        if (remoteVideoView != null) {
            if (remoteVideoState != null) {
                boolValueOf = Boolean.valueOf(remoteVideoState.getShowVideoView());
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            remoteVideoView.setVisibility(i12);
            if (z11 && remoteVideoState != null) {
                applyVideoViewSize(remoteVideoView, remoteVideoState.getAspectRatio());
            }
            SNSVideoChatService service = this.serviceConnection.getService();
            if (service != null && (videoChatController = service.getVideoChatController()) != null) {
                if (remoteVideoState != null && remoteVideoState.getShowVideoView()) {
                    C32921u c32921u = videoChatController.f67335g;
                    if (c32921u.f67357e == remoteVideoView) {
                        AbstractC32895a.m71366a("bindRemoteView: already added ");
                    } else {
                        c32921u.f67357e = remoteVideoView;
                        RemoteVideoTrack remoteVideoTrack = c32921u.f67356d;
                        if (remoteVideoTrack != null) {
                            remoteVideoTrack.addSink(remoteVideoView);
                        }
                    }
                } else {
                    C32921u c32921u2 = videoChatController.f67335g;
                    c32921u2.f67357e = null;
                    RemoteVideoTrack remoteVideoTrack2 = c32921u2.f67356d;
                    if (remoteVideoTrack2 != null) {
                        remoteVideoTrack2.removeSink(remoteVideoView);
                    }
                }
            }
        }
        TextView operatorName = getOperatorName();
        if (operatorName != null) {
            if (remoteVideoState != null) {
                caption2 = remoteVideoState.getCaption();
            } else {
                caption2 = null;
            }
            if (caption2 != null && !StringsKt.isBlank(caption2)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            operatorName.setVisibility(i11);
        }
        TextView operatorName2 = getOperatorName();
        if (operatorName2 != null) {
            if (remoteVideoState != null) {
                caption = remoteVideoState.getCaption();
            } else {
                caption = null;
            }
            operatorName2.setText(caption);
        }
        View remoteVideoContainer3 = getRemoteVideoContainer();
        if (remoteVideoContainer3 != null) {
            viewFindViewById = remoteVideoContainer3.findViewById(R$id.sns_progress_bar);
        }
        if (viewFindViewById != null) {
            if (remoteVideoState == null || !remoteVideoState.getShowLoader()) {
                i14 = 8;
            }
            viewFindViewById.setVisibility(i14);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public Map<String, Object> getClosePayload() {
        return getOpenPayload();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public Map<String, Object> getOpenPayload() {
        return MapsKt.plus(getCommonPayload(), this.permissionHandler.m69525u());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void onCloseButtonClick() {
        AbstractC32895a.m71366a("onCloseButtonClick");
        C28367f.m69257a(getAnalyticsDelegate(), getScreen(), getF63684h(), Control.CloseButton, getCommonPayload(), 16);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && (string2 = savedInstanceState.getString(CALL_STATE)) != null) {
            AnalyticsCallState analyticsCallStateFromString = AnalyticsCallState.INSTANCE.fromString(string2);
            if (analyticsCallStateFromString == null) {
                analyticsCallStateFromString = AnalyticsCallState.PREPARING;
            }
            this.callState = analyticsCallStateFromString;
        }
        C28710y c28710y = new C28710y(requireActivity().getActivityResultRegistry(), getUniqueId(), AbstractC28441c.m69321a(getResources().getString(R$string.sns_videoident_mime_types)), new Function2() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.b0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SNSVideoIdentFragment.onCreate$lambda$6(this.f67377b, (String) obj, (Uri) obj2);
            }
        }, getF63684h());
        if (savedInstanceState != null && (string = savedInstanceState.getString(OBSERVER_ITEM_ID)) != null) {
            c28710y.f58390h = string;
        }
        getLifecycle().addObserver(c28710y);
        this.pickerLifecycleObserver = c28710y;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        C28710y c28710y = this.pickerLifecycleObserver;
        if (c28710y == null) {
            c28710y = null;
        }
        String str = c28710y.f58390h;
        if (str != null) {
            outState.putString(OBSERVER_ITEM_ID, str);
        }
        String str2 = this.currentCameraId;
        if (str2 != null) {
            outState.putString(CAMERA_ID, str2);
        }
        outState.putString(CALL_STATE, this.callState.getValue());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onStart() {
        C32917q videoChatController;
        SNSVideoChatService service;
        C32917q videoChatController2;
        String value;
        C32917q videoChatController3;
        C32917q videoChatController4;
        super.onStart();
        AbstractC32895a.m71366a("onStart");
        this.previousVolumeControlStream = requireActivity().getVolumeControlStream();
        requireActivity().setVolumeControlStream(0);
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().onViewStart();
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 != null && (videoChatController = service2.getVideoChatController()) != null) {
            VideoView localVideoView = getLocalVideoView();
            if (localVideoView != null) {
                SNSVideoChatService service3 = this.serviceConnection.getService();
                if (service3 != null && (videoChatController4 = service3.getVideoChatController()) != null) {
                    videoChatController4.m71378b(localVideoView);
                }
                SNSVideoChatService service4 = this.serviceConnection.getService();
                if (service4 != null && (videoChatController3 = service4.getVideoChatController()) != null) {
                    videoChatController3.m71372a(requireActivity());
                }
                String str = this.currentCameraId;
                if (str != null) {
                    SNSVideoChatController$CameraId sNSVideoChatController$CameraIdM71377b = videoChatController.m71377b();
                    if (sNSVideoChatController$CameraIdM71377b != null) {
                        value = sNSVideoChatController$CameraIdM71377b.getValue();
                    } else {
                        value = null;
                    }
                    if (!Intrinsics.areEqual(value, str)) {
                        switchCameraAndUpdateMirroring();
                    }
                    this.currentCameraId = null;
                }
            }
            VideoTextureView remoteVideoView = getRemoteVideoView();
            if (remoteVideoView != null && (service = this.serviceConnection.getService()) != null && (videoChatController2 = service.getVideoChatController()) != null) {
                C32921u c32921u = videoChatController2.f67335g;
                if (c32921u.f67357e == remoteVideoView) {
                    AbstractC32895a.m71366a("bindRemoteView: already added ");
                    return;
                }
                c32921u.f67357e = remoteVideoView;
                RemoteVideoTrack remoteVideoTrack = c32921u.f67356d;
                if (remoteVideoTrack != null) {
                    remoteVideoTrack.addSink(remoteVideoView);
                }
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onStop() {
        String value;
        SNSVideoChatService service;
        C32917q videoChatController;
        C32917q videoChatController2;
        LocalParticipant localParticipant;
        C32917q videoChatController3;
        C32917q videoChatController4;
        SNSVideoChatController$CameraId sNSVideoChatController$CameraIdM71377b;
        AbstractC32895a.m71366a("onStop");
        requireActivity().setVolumeControlStream(this.previousVolumeControlStream);
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 != null && (videoChatController4 = service2.getVideoChatController()) != null && (sNSVideoChatController$CameraIdM71377b = videoChatController4.m71377b()) != null) {
            value = sNSVideoChatController$CameraIdM71377b.getValue();
        } else {
            value = null;
        }
        this.currentCameraId = value;
        VideoView localVideoView = getLocalVideoView();
        if (localVideoView != null) {
            SNSVideoChatService service3 = this.serviceConnection.getService();
            if (service3 != null && (videoChatController3 = service3.getVideoChatController()) != null) {
                LocalVideoTrack localVideoTrack = videoChatController3.f67338j;
                if (localVideoTrack != null) {
                    localVideoTrack.removeSink(localVideoView);
                }
                LocalVideoTrack localVideoTrack2 = videoChatController3.f67338j;
                if (localVideoTrack2 != null) {
                    localVideoTrack2.enable(false);
                }
            }
            SNSVideoChatService service4 = this.serviceConnection.getService();
            if (service4 != null && (videoChatController2 = service4.getVideoChatController()) != null) {
                AbstractC32895a.m71366a("releaseLocalVideoTrack");
                LocalVideoTrack localVideoTrack3 = videoChatController2.f67338j;
                if (localVideoTrack3 != null && (localParticipant = videoChatController2.f67340l) != null) {
                    localParticipant.unpublishTrack(localVideoTrack3);
                }
                LocalVideoTrack localVideoTrack4 = videoChatController2.f67338j;
                if (localVideoTrack4 != null) {
                    localVideoTrack4.release();
                }
                videoChatController2.f67338j = null;
            }
        }
        VideoTextureView remoteVideoView = getRemoteVideoView();
        if (remoteVideoView != null && (service = this.serviceConnection.getService()) != null && (videoChatController = service.getVideoChatController()) != null) {
            C32921u c32921u = videoChatController.f67335g;
            c32921u.f67357e = null;
            RemoteVideoTrack remoteVideoTrack = c32921u.f67356d;
            if (remoteVideoTrack != null) {
                remoteVideoTrack.removeSink(remoteVideoView);
            }
        }
        AlertDialog alertDialog = this.exitConfirmationDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Drawable drawable;
        AbstractC32895a.m71366a("onViewCreated: docs=" + getDocuments().size());
        super.onViewCreated(view, savedInstanceState);
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().updateVideoChatAdapter(this.videoChatAdapter);
        if (savedInstanceState != null) {
            this.currentCameraId = savedInstanceState.getString(CAMERA_ID);
        }
        ImageView switchCamera = getSwitchCamera();
        if (switchCamera != null && (drawable = switchCamera.getDrawable()) != null) {
            SNSVideoIdentFragmentKt.applyIconLayerTint(drawable, ContextCompat.getColor(requireContext(), R$color.sns_cameraContent));
        }
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            BottomSheetBehavior<ViewGroup> bottomSheetBehaviorFrom = BottomSheetBehavior.from(bottomSheet);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setDraggable(true);
            bottomSheetBehaviorFrom.setPeekHeight(getResources().getDimensionPixelSize(R$dimen.sns_margin_large));
            bottomSheetBehaviorFrom.setFitToContents(false);
            if (bottomSheetBehaviorFrom instanceof SNSCustomBehavior) {
                ((SNSCustomBehavior) bottomSheetBehaviorFrom).setExpandedOffsetCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.o0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(this.f67405b.calculateExpandedOffset((CoordinatorLayout) obj));
                    }
                });
            }
            this.bottomSheetBehavior = bottomSheetBehaviorFrom;
        }
        ViewGroup phoneVerificationBottomSheet = getPhoneVerificationBottomSheet();
        if (phoneVerificationBottomSheet != null) {
            BottomSheetBehavior<ViewGroup> bottomSheetBehaviorFrom2 = BottomSheetBehavior.from(phoneVerificationBottomSheet);
            bottomSheetBehaviorFrom2.setState(3);
            bottomSheetBehaviorFrom2.setHideable(true);
            bottomSheetBehaviorFrom2.setDraggable(true);
            bottomSheetBehaviorFrom2.setFitToContents(false);
            bottomSheetBehaviorFrom2.setExpandedOffset(0);
            bottomSheetBehaviorFrom2.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment$onViewCreated$3$2$1
                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                public void onSlide(View bottomSheet2, float slideOffset) {
                    View viewFindViewById;
                    float fCoerceIn = 1.0f;
                    if (slideOffset >= 0.7f) {
                        fCoerceIn = RangesKt.coerceIn((1.0f - slideOffset) - 0.05f, 0.0f, 1.0f);
                    }
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null && (viewFindViewById = activity.findViewById(R$id.sns_toolbar)) != null) {
                        viewFindViewById.setAlpha(fCoerceIn);
                    }
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                public void onStateChanged(View bottomSheet2, int newState) {
                }
            });
            bottomSheetBehaviorFrom2.setState(5);
            this.phoneVerificationBottomSheetBehavior = bottomSheetBehaviorFrom2;
        }
        VideoView localVideoView = getLocalVideoView();
        if (localVideoView != null) {
            localVideoView.setMirror(true);
        }
        VideoTextureView remoteVideoView = getRemoteVideoView();
        if (remoteVideoView != null) {
            remoteVideoView.setMirror(true);
        }
        final Context applicationContext = requireContext().getApplicationContext();
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().setOnClose(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentFragment.onViewCreated$lambda$17(applicationContext, this, ((Boolean) obj).booleanValue());
            }
        });
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().setOnPickFile(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSVideoIdentFragment.onViewCreated$lambda$18(this.f67404b, (String) obj);
            }
        });
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().setOnCancelPhoneVerification(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.onViewCreated$lambda$20(view, this);
            }
        });
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().setOnStartPhoneVerification(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSVideoIdentFragment.onViewCreated$lambda$22(view, this);
            }
        });
        ImageView switchCamera2 = getSwitchCamera();
        if (switchCamera2 != null) {
            switchCamera2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f67415b.switchCameraAndUpdateMirroring();
                }
            });
        }
        listenEnterPhoneResult();
        listenSelectLanguageResult();
        listenPhoneVerificationResult();
    }
}
