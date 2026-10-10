package com.kubi.router.utils;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import com.kubi.router.R$id;
import com.kubi.router.core.Router;
import com.kubi.router.exception.RouterException;
import com.kubi.router.model.IRedirect;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: compiled from: RouteEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0005\u001a!\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u001b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b \u0010\u001d\u001a!\u0010!\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001f\u001a%\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%\u001a%\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020&*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(\u001a!\u0010+\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020*¢\u0006\u0004\b+\u0010,\u001a!\u0010.\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020-¢\u0006\u0004\b.\u0010/\u001a\u001d\u00100\u001a\u0004\u0018\u00010\u0003*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b0\u00101\u001a#\u00102\u001a\u00020\u0003*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u0003*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b4\u00105\u001a!\u00106\u001a\u00020\u0003*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b6\u00103\u001a!\u00107\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b7\u00108\u001a\u001d\u00109\u001a\u0004\u0018\u00010\u000b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b9\u0010:\u001a\u0019\u0010;\u001a\u00020\u000b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b;\u0010<\u001a!\u0010=\u001a\u00020\u000b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b=\u0010>\u001a!\u0010?\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b?\u0010@\u001a!\u0010B\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020A¢\u0006\u0004\bB\u0010C\u001a\u001d\u0010D\u001a\u0004\u0018\u00010\u0011*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\bD\u0010E\u001a!\u0010F\u001a\u00020\u0011*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\bF\u0010G\u001a!\u0010H\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\bH\u0010I\u001a\u001d\u0010J\u001a\u0004\u0018\u00010\u0001*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010K\u001a#\u0010L\u001a\u00020\u0001*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\bL\u0010M\u001a\u001b\u0010N\u001a\u0004\u0018\u00010\u0001*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\bN\u0010K\u001a)\u0010P\u001a\n O*\u0004\u0018\u00010\u00010\u0001*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\bP\u0010M\u001a!\u0010Q\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\bQ\u0010R\u001a\u001d\u0010S\u001a\u0004\u0018\u00010\u001b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010U\u001a\u00020\u001b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001bH\u0007¢\u0006\u0004\bU\u0010V\u001a\u0019\u0010W\u001a\u00020\u001b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\bW\u0010X\u001a!\u0010Y\u001a\u00020\u001b*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001b¢\u0006\u0004\bY\u0010V\u001a!\u0010Z\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\bZ\u0010[\u001a!\u0010\\\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020)¢\u0006\u0004\b\\\u0010]\u001a'\u0010^\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b^\u0010_\u001a%\u0010`\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b`\u0010_\u001a!\u0010a\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\"¢\u0006\u0004\ba\u0010b\u001a'\u0010c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020&*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\bc\u0010d\u001a%\u0010e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020&*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\be\u0010d\u001a!\u0010f\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020&¢\u0006\u0004\bf\u0010g\u001a!\u0010i\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020h¢\u0006\u0004\bi\u0010j\u001a\u0011\u0010#\u001a\u00020\u0003*\u00020)¢\u0006\u0004\b#\u0010k\u001a\u0019\u0010m\u001a\u00020)*\u00020)2\u0006\u0010l\u001a\u00020\u0003¢\u0006\u0004\bm\u0010n\u001a\u0013\u0010p\u001a\u0004\u0018\u00010o*\u00020)¢\u0006\u0004\bp\u0010q\u001a\u0019\u0010s\u001a\u00020)*\u00020)2\u0006\u0010r\u001a\u00020o¢\u0006\u0004\bs\u0010t\u001a\u0013\u0010v\u001a\u0004\u0018\u00010u*\u00020)¢\u0006\u0004\bv\u0010w\u001a\u0019\u0010x\u001a\u00020)*\u00020)2\u0006\u0010r\u001a\u00020u¢\u0006\u0004\bx\u0010y\u001a\u0013\u0010z\u001a\u0004\u0018\u00010\u0001*\u00020)¢\u0006\u0004\bz\u0010{\u001a\u0019\u0010}\u001a\u00020)*\u00020)2\u0006\u0010|\u001a\u00020\u0001¢\u0006\u0004\b}\u0010~\u001a1\u0010\u0081\u0001\u001a\u001f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020h0\u007fj\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020h`\u0080\u0001*\u00020)¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001e\u0010\u0083\u0001\u001a\n O*\u0004\u0018\u00010\u00010\u0001*\u00020\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u001e\u0010\u0085\u0001\u001a\n O*\u0004\u0018\u00010\u00010\u0001*\u00020\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001\u001aH\u0010\u0089\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010#*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u001a\u0010\u0088\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0086\u0001¢\u0006\u0003\b\u0087\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a@\u0010\u008b\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010#*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u001a\u0010\u0088\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0086\u0001¢\u0006\u0003\b\u0087\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a#\u0010\u008d\u0001\u001a\u00020)*\u00020)2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0005\b\u008d\u0001\u0010R\u001a\u001e\u0010\u0090\u0001\u001a\u00020)*\u00020)2\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0016\u0010\u0092\u0001\u001a\u00020\u0001*\u00020\"H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\"\u0010\u0094\u0001\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"*\u00020\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0014\u0010\u0096\u0001\u001a\u00020\u0001*\u00020&¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u001e\u0010\u0098\u0001\u001a\u00028\u0000\"\b\b\u0000\u0010#*\u00020&*\u00020\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a3\u0010\u009c\u0001\u001a\u00020\u0000*\u00020\u00002\u001b\u0010\u009b\u0001\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0005\u0012\u00030\u009a\u00010\u0086\u0001¢\u0006\u0003\b\u0087\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a$\u0010 \u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010#*\u00028\u00002\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a$\u0010¤\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010#*\u00028\u00002\b\u0010£\u0001\u001a\u00030¢\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a2\u0010§\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010#*\u00030¦\u00012\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0005\u0012\u00030¦\u0001\u0012\u0004\u0012\u00028\u00000\u0086\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a\u0016\u0010©\u0001\u001a\u00020\u001b*\u0004\u0018\u00010\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001\"\u0019\u0010\u00ad\u0001\u001a\u00020\u0001*\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001¨\u0006®\u0001"}, m90084d2 = {"Landroid/content/Intent;", "", "key", "", "R", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;", "default", "P", "(Landroid/content/Intent;Ljava/lang/String;I)I", "o", CmcdData.Factory.STREAM_TYPE_LIVE, "", "p", "(Landroid/content/Intent;Ljava/lang/String;J)J", "value", "o0", "(Landroid/content/Intent;Ljava/lang/String;J)Landroid/content/Intent;", "", "j", "(Landroid/content/Intent;Ljava/lang/String;D)D", "a0", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;", "w", "x", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "w0", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "K", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;", "M", "(Landroid/content/Intent;Ljava/lang/String;Z)Z", "f", "g", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Ljava/io/Serializable;", "u", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/io/Serializable;", "Landroid/os/Bundle;", "", "i0", "(Landroid/os/Bundle;Ljava/lang/String;B)Landroid/os/Bundle;", "", "v0", "(Landroid/os/Bundle;Ljava/lang/String;S)Landroid/os/Bundle;", ExifInterface.LATITUDE_SOUTH, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "Q", "(Landroid/os/Bundle;Ljava/lang/String;I)I", "m", "(Landroid/os/Bundle;Ljava/lang/String;)I", "n", "l0", "(Landroid/os/Bundle;Ljava/lang/String;I)Landroid/os/Bundle;", "U", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "q", "(Landroid/os/Bundle;Ljava/lang/String;)J", "r", "(Landroid/os/Bundle;Ljava/lang/String;J)J", "p0", "(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;", "", "k0", "(Landroid/os/Bundle;Ljava/lang/String;F)Landroid/os/Bundle;", "O", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "k", "(Landroid/os/Bundle;Ljava/lang/String;D)D", "j0", "(Landroid/os/Bundle;Ljava/lang/String;D)Landroid/os/Bundle;", "b0", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "c0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "y", "kotlin.jvm.PlatformType", "z", "x0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "L", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "N", "(Landroid/os/Bundle;Ljava/lang/String;Z)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/os/Bundle;Ljava/lang/String;)Z", "i", "g0", "(Landroid/os/Bundle;Ljava/lang/String;Z)Landroid/os/Bundle;", "h0", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "t", "q0", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)Landroid/os/Bundle;", "Z", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "v", "u0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)Landroid/os/Bundle;", "", "m0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)Landroid/os/Bundle;", "(Landroid/os/Bundle;)I", "flag", "n0", "(Landroid/os/Bundle;I)Landroid/os/Bundle;", "Lcy/b;", "Y", "(Landroid/os/Bundle;)Lcy/b;", "call", "t0", "(Landroid/os/Bundle;Lcy/b;)Landroid/os/Bundle;", "Lcom/kubi/router/model/IRedirect;", ExifInterface.LONGITUDE_WEST, "(Landroid/os/Bundle;)Lcom/kubi/router/model/IRedirect;", "r0", "(Landroid/os/Bundle;Lcom/kubi/router/model/IRedirect;)Landroid/os/Bundle;", "X", "(Landroid/os/Bundle;)Ljava/lang/String;", "url", "s0", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d0", "(Landroid/os/Bundle;)Ljava/util/HashMap;", "F", "(Ljava/lang/String;)Ljava/lang/String;", "C", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "map", "I", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "J", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "f0", "Landroid/net/Uri;", "uri", "d", "(Landroid/os/Bundle;Landroid/net/Uri;)Landroid/os/Bundle;", "D", "(Landroid/os/Parcelable;)Ljava/lang/String;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/String;)Landroid/os/Parcelable;", ExifInterface.LONGITUDE_EAST, "(Ljava/io/Serializable;)Ljava/lang/String;", "B", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "block", "e", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "Landroid/app/Activity;", "activity", "b", "(Ljava/lang/Object;Landroid/app/Activity;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "fragment", "c", "(Ljava/lang/Object;Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Landroid/os/Parcel;", "e0", "(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "H", "(Ljava/lang/String;)Z", "G", "(Landroid/net/Uri;)Ljava/lang/String;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "RouterSDK_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteEx.kt\ncom/kubi/router/utils/RouteExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RouterIssue.kt\ncom/kubi/router/exception/RouterIssueKt\n*L\n1#1,572:1\n305#1:573\n1#2:574\n1855#3,2:575\n1855#3,2:579\n44#4,2:577\n44#4,2:581\n*S KotlinDebug\n*F\n+ 1 RouteEx.kt\ncom/kubi/router/utils/RouteExKt\n*L\n166#1:573\n330#1:575,2\n380#1:579,2\n363#1:577,2\n384#1:581,2\n*E\n"})
public final class RouteExKt {
    /* JADX INFO: renamed from: A */
    public static final <T extends Parcelable> T m56210A(String str) {
        final byte[] bArrDecode = Base64.decode(str, 0);
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        return (T) m56245e0(parcelObtain, new Function1<Parcel, T>() { // from class: com.kubi.router.utils.RouteExKt$decodeToParcelable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;)TT; */
            @Override // p852kotlin.jvm.functions.Function1
            @Nullable
            public final Parcelable invoke(@NotNull Parcel it) {
                Intrinsics.checkNotNullParameter(it, "it");
                byte[] bArr = bArrDecode;
                it.unmarshall(bArr, 0, bArr.length);
                it.setDataPosition(0);
                return it.readParcelable(Router.class.getClassLoader());
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final <T extends Serializable> T m56211B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                CloseableKt.closeFinally(objectInputStream, null);
                CloseableKt.closeFinally(byteArrayInputStream, null);
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of com.kubi.router.utils.RouteExKt.decodeToSerializable");
                return (T) object;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static final String m56212C(String str) {
        return URLDecoder.decode(str, "UTF-8");
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public static final String m56214E(@NotNull Serializable serializable) {
        Intrinsics.checkNotNullParameter(serializable, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "use(...)");
                return strEncodeToString;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static final String m56215F(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static final String m56216G(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return uri.getAuthority() + uri.getPath();
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m56217H(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C44128b.m97259c("router", "路由跳转->" + str);
        return Router.f46192a.m56184f(str).m4048k();
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static final <T> T m56219J(@NotNull Bundle bundle, @NotNull String key, @NotNull Function1<? super String, ? extends T> map) {
        Object objM103844constructorimpl;
        T tInvoke;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(map, "map");
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = bundle.getString(key);
            if (string != null) {
                Intrinsics.checkNotNull(string);
                tInvoke = map.invoke(string);
            } else {
                tInvoke = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(tInvoke);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return (T) objM103844constructorimpl;
    }

    @Deprecated(message = "请使用兼容原生optBoolean方法", replaceWith = @ReplaceWith(expression = "optBoolean()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: K */
    public static final Boolean m56220K(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return m56221L(extras, key);
        }
        return null;
    }

    @Deprecated(message = "请使用兼容原生compatBoolean方法", replaceWith = @ReplaceWith(expression = "compatBoolean()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: L */
    public static final Boolean m56221L(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) m56219J(bundle, key, new Function1<String, Boolean>() { // from class: com.kubi.router.utils.RouteExKt$optBoolean$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Boolean.valueOf(Boolean.parseBoolean(opt));
            }
        });
    }

    @Deprecated(message = "请使用兼容原生optBoolean方法", replaceWith = @ReplaceWith(expression = "optBoolean()", imports = {}))
    /* JADX INFO: renamed from: M */
    public static final boolean m56222M(@NotNull Intent intent, @NotNull String key, boolean z11) {
        Boolean boolM56221L;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return (extras == null || (boolM56221L = m56221L(extras, key)) == null) ? z11 : boolM56221L.booleanValue();
    }

    @Deprecated(message = "请使用兼容原生compatBoolean方法", replaceWith = @ReplaceWith(expression = "compatBoolean()", imports = {}))
    /* JADX INFO: renamed from: N */
    public static final boolean m56223N(@NotNull Bundle bundle, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) m56218I(bundle, key, Boolean.valueOf(z11), new Function1<String, Boolean>() { // from class: com.kubi.router.utils.RouteExKt$optBoolean$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Boolean.valueOf(Boolean.parseBoolean(opt));
            }
        })).booleanValue();
    }

    @Deprecated(message = "请使用兼容原生compatDouble方法", replaceWith = @ReplaceWith(expression = "compatDouble()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: O */
    public static final Double m56224O(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Double) m56219J(bundle, key, new Function1<String, Double>() { // from class: com.kubi.router.utils.RouteExKt$optDouble$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Double invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Double.valueOf(Double.parseDouble(opt));
            }
        });
    }

    @Deprecated(message = "请使用兼容原生compatInt方法", replaceWith = @ReplaceWith(expression = "compatInt()", imports = {}))
    /* JADX INFO: renamed from: P */
    public static final int m56225P(@NotNull Intent intent, @NotNull String key, int i11) {
        Integer numM56228S;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return (extras == null || (numM56228S = m56228S(extras, key)) == null) ? i11 : numM56228S.intValue();
    }

    @Deprecated(message = "请使用兼容原生compatInt方法", replaceWith = @ReplaceWith(expression = "compatInt()", imports = {}))
    /* JADX INFO: renamed from: Q */
    public static final int m56226Q(@NotNull Bundle bundle, @NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Number) m56218I(bundle, key, Integer.valueOf(i11), new Function1<String, Integer>() { // from class: com.kubi.router.utils.RouteExKt$optInt$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Integer.valueOf(Integer.parseInt(opt));
            }
        })).intValue();
    }

    @Deprecated(message = "请使用兼容原生compatInt方法", replaceWith = @ReplaceWith(expression = "compatInt()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: R */
    public static final Integer m56227R(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return m56228S(extras, key);
        }
        return null;
    }

    @Deprecated(message = "请使用兼容原生compatInt方法", replaceWith = @ReplaceWith(expression = "compatInt()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: S */
    public static final Integer m56228S(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Integer) m56219J(bundle, key, new Function1<String, Integer>() { // from class: com.kubi.router.utils.RouteExKt$optInt$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Integer.valueOf(Integer.parseInt(opt));
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static final int m56229T(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return m56226Q(bundle, "launch_flag", 0);
    }

    @Deprecated(message = "请使用兼容原生compatLong方法", replaceWith = @ReplaceWith(expression = "compatLong()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: U */
    public static final Long m56230U(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) m56219J(bundle, key, new Function1<String, Long>() { // from class: com.kubi.router.utils.RouteExKt$optLong$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Long invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return Long.valueOf(Long.parseLong(opt));
            }
        });
    }

    @Deprecated(message = "请使用兼容原生compatParcelable方法", replaceWith = @ReplaceWith(expression = "compatParcelable()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: V */
    public static final <T extends Parcelable> T m56231V(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m56219J(bundle, key, new Function1<String, T>() { // from class: com.kubi.router.utils.RouteExKt$optParcelable$1
            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
            @Override // p852kotlin.jvm.functions.Function1
            @Nullable
            public final Parcelable invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return RouteExKt.m56210A(opt);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public static final IRedirect m56232W(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Integer numM56228S = m56228S(bundle, "redirect_call");
        if (numM56228S == null) {
            return null;
        }
        return (IRedirect) C23638d.f46219a.m56299b(numM56228S.intValue());
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public static final String m56233X(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String strM56239b0 = m56239b0(bundle, "redirect_uri");
        if (strM56239b0 != null) {
            return m56212C(strM56239b0);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public static final InterfaceC36555b m56234Y(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Integer numM56228S = m56228S(bundle, "result_call");
        if (numM56228S == null) {
            return null;
        }
        return (InterfaceC36555b) C23638d.f46219a.m56299b(numM56228S.intValue());
    }

    @Deprecated(message = "请使用兼容原生compatSerializable方法", replaceWith = @ReplaceWith(expression = "compatSerializable()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: Z */
    public static final <T extends Serializable> T m56235Z(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m56219J(bundle, key, new Function1<String, T>() { // from class: com.kubi.router.utils.RouteExKt$optSerializable$1
            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Serializable invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return RouteExKt.m56211B(opt);
            }
        });
    }

    @Deprecated(message = "请使用兼容原生compatString方法", replaceWith = @ReplaceWith(expression = "compatString()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: a0 */
    public static final String m56237a0(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return m56239b0(extras, key);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final <T> T m56238b(T t11, @NotNull Activity activity) {
        Object tag;
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById != null) {
            int i11 = R$id.route_activity_result;
            tag = viewFindViewById.getTag(i11);
            if (tag == null) {
                tag = new ArrayList();
                viewFindViewById.setTag(i11, tag);
            }
        } else {
            tag = null;
        }
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.collections.MutableList<T of com.kubi.router.utils.RouteExKt.addTo>");
        TypeIntrinsics.asMutableList(tag).add(t11);
        return t11;
    }

    @Deprecated(message = "请使用兼容原生compatString方法", replaceWith = @ReplaceWith(expression = "compatString()", imports = {}))
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public static final String m56239b0(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) m56219J(bundle, key, new Function1<String, String>() { // from class: com.kubi.router.utils.RouteExKt$optString$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return opt.toString();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final <T> T m56240c(T t11, @NotNull Fragment fragment) {
        Object arrayList;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        View view = fragment.getView();
        if (view != null) {
            int i11 = R$id.route_fragment_result;
            arrayList = view.getTag(i11);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(i11, arrayList);
            }
        } else {
            arrayList = new ArrayList();
        }
        TypeIntrinsics.asMutableList(arrayList).add(t11);
        return t11;
    }

    @Deprecated(message = "请使用兼容原生compatString方法", replaceWith = @ReplaceWith(expression = "compatString()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final String m56241c0(@NotNull Bundle bundle, @NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        return (String) m56218I(bundle, key, str, new Function1<String, String>() { // from class: com.kubi.router.utils.RouteExKt$optString$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String opt) {
                Intrinsics.checkNotNullParameter(opt, "$this$opt");
                return opt.toString();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Bundle m56242d(@NotNull Bundle bundle, @NotNull Uri uri) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            for (String str : queryParameterNames) {
                bundle.putString(str, uri.getQueryParameter(str));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new RouterException(thM103847exceptionOrNullimpl, "Router", false, null, 8, null), null, 2, null);
        }
        return bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final HashMap<String, Object> m56243d0(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        HashMap<String, Object> map = new HashMap<>();
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static final Intent m56244e(Intent intent, Function1<? super Bundle, Unit> function1) {
        Bundle bundle = new Bundle();
        function1.invoke(bundle);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: e0 */
    public static final <T> T m56245e0(@NotNull Parcel parcel, @NotNull Function1<? super Parcel, ? extends T> block) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(parcel);
        } finally {
            parcel.recycle();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Boolean m56246f(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return Boolean.valueOf(m56250h(extras, key));
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public static final Bundle m56247f0(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putString(key, value);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m56248g(@NotNull Intent intent, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return extras != null ? m56252i(extras, key, z11) : z11;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public static final Bundle m56249g0(@NotNull Bundle bundle, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf(z11));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m56250h(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean boolM56221L = m56221L(bundle, key);
        return boolM56221L != null ? boolM56221L.booleanValue() : bundle.getBoolean(key);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public static final Bundle m56251h0(@NotNull Bundle bundle, @NotNull String key, @NotNull Bundle value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m56247f0(bundle, key, m56213D(value));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m56252i(@NotNull Bundle bundle, @NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean boolM56221L = m56221L(bundle, key);
        return boolM56221L != null ? boolM56221L.booleanValue() : bundle.getBoolean(key, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static final Bundle m56253i0(@NotNull Bundle bundle, @NotNull String key, byte b11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56283x0(bundle, key, String.valueOf((int) b11));
    }

    /* JADX INFO: renamed from: j */
    public static final double m56254j(@NotNull Intent intent, @NotNull String key, double d11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return extras != null ? m56256k(extras, key, d11) : d11;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public static final Bundle m56255j0(@NotNull Bundle bundle, @NotNull String key, double d11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf(d11));
    }

    /* JADX INFO: renamed from: k */
    public static final double m56256k(@NotNull Bundle bundle, @NotNull String key, double d11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Double dM56224O = m56224O(bundle, key);
        return dM56224O != null ? dM56224O.doubleValue() : bundle.getDouble(key, d11);
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public static final Bundle m56257k0(@NotNull Bundle bundle, @NotNull String key, float f11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf(f11));
    }

    /* JADX INFO: renamed from: l */
    public static final int m56258l(@NotNull Intent intent, @NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return extras != null ? m56262n(extras, key, i11) : i11;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public static final Bundle m56259l0(@NotNull Bundle bundle, @NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf(i11));
    }

    /* JADX INFO: renamed from: m */
    public static final int m56260m(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Integer numM56228S = m56228S(bundle, key);
        return numM56228S != null ? numM56228S.intValue() : bundle.getInt(key);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public static final Bundle m56261m0(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String json = new Gson().toJson(value);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return m56247f0(bundle, key, json);
    }

    /* JADX INFO: renamed from: n */
    public static final int m56262n(@NotNull Bundle bundle, @NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Integer numM56228S = m56228S(bundle, key);
        return numM56228S != null ? numM56228S.intValue() : bundle.getInt(key, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public static final Bundle m56263n0(@NotNull Bundle bundle, int i11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return m56259l0(bundle, "launch_flag", i11 | m56229T(bundle));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final Integer m56264o(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return Integer.valueOf(m56260m(extras, key));
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static final Intent m56265o0(@NotNull Intent intent, @NotNull final String key, final long j11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56244e(intent, new Function1<Bundle, Unit>() { // from class: com.kubi.router.utils.RouteExKt$withLong$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
                invoke2(bundle);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Bundle checkExtras) {
                Intrinsics.checkNotNullParameter(checkExtras, "$this$checkExtras");
                RouteExKt.m56267p0(checkExtras, key, j11);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final long m56266p(@NotNull Intent intent, @NotNull String key, long j11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        return extras != null ? m56270r(extras, key, j11) : j11;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public static final Bundle m56267p0(@NotNull Bundle bundle, @NotNull String key, long j11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf(j11));
    }

    /* JADX INFO: renamed from: q */
    public static final long m56268q(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Long lM56230U = m56230U(bundle, key);
        return lM56230U != null ? lM56230U.longValue() : bundle.getLong(key);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public static final Bundle m56269q0(@NotNull Bundle bundle, @NotNull String key, @NotNull Parcelable value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m56247f0(bundle, key, m56213D(value));
    }

    /* JADX INFO: renamed from: r */
    public static final long m56270r(@NotNull Bundle bundle, @NotNull String key, long j11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Long lM56230U = m56230U(bundle, key);
        return lM56230U != null ? lM56230U.longValue() : bundle.getLong(key, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public static final Bundle m56271r0(@NotNull Bundle bundle, @NotNull IRedirect call) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(call, "call");
        Bundle bundleM56259l0 = m56259l0(bundle, "redirect_call", System.identityHashCode(call));
        C23638d.f46219a.m56298a(call);
        return bundleM56259l0;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static final <T extends Parcelable> T m56272s(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (T) m56274t(extras, key);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public static final Bundle m56273s0(@NotNull Bundle bundle, @NotNull String url) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        String strM56215F = m56215F(url);
        Intrinsics.checkNotNullExpressionValue(strM56215F, "encodeUrl(...)");
        return m56283x0(bundle, "redirect_uri", strM56215F);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static final <T extends Parcelable> T m56274t(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t11 = (T) m56231V(bundle, key);
        return t11 == null ? (T) bundle.getParcelable(key) : t11;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public static final Bundle m56275t0(@NotNull Bundle bundle, @NotNull InterfaceC36555b call) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(call, "call");
        Bundle bundleM56259l0 = m56259l0(bundle, "result_call", System.identityHashCode(call));
        C23638d.f46219a.m56298a(call);
        return bundleM56259l0;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final <T extends Serializable> T m56276u(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (T) m56278v(extras, key);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public static final Bundle m56277u0(@NotNull Bundle bundle, @NotNull String key, @NotNull Serializable value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m56247f0(bundle, key, m56214E(value));
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static final <T extends Serializable> T m56278v(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t11 = (T) m56235Z(bundle, key);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) bundle.getSerializable(key);
        if (t12 instanceof Serializable) {
            return t12;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public static final Bundle m56279v0(@NotNull Bundle bundle, @NotNull String key, short s11) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return m56247f0(bundle, key, String.valueOf((int) s11));
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static final String m56280w(@NotNull Intent intent, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return m56284y(extras, key);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public static final Intent m56281w0(@NotNull Intent intent, @NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m56244e(intent, new Function1<Bundle, Unit>() { // from class: com.kubi.router.utils.RouteExKt$withString$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
                invoke2(bundle);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Bundle checkExtras) {
                Intrinsics.checkNotNullParameter(checkExtras, "$this$checkExtras");
                RouteExKt.m56283x0(checkExtras, key, value);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m56282x(@NotNull Intent intent, @NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        Bundle extras = intent.getExtras();
        String strM56285z = extras != null ? m56285z(extras, key, str) : null;
        return strM56285z == null ? str : strM56285z;
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public static final Bundle m56283x0(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return m56247f0(bundle, key, value);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public static final String m56284y(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String strM56239b0 = m56239b0(bundle, key);
        return strM56239b0 == null ? bundle.getString(key) : strM56239b0;
    }

    /* JADX INFO: renamed from: z */
    public static final String m56285z(@NotNull Bundle bundle, @NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String strM56239b0 = m56239b0(bundle, key);
        return strM56239b0 == null ? bundle.getString(key, str) : strM56239b0;
    }

    /* JADX INFO: renamed from: D */
    public static final String m56213D(final Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        Object objM56245e0 = m56245e0(parcelObtain, new Function1<Parcel, String>() { // from class: com.kubi.router.utils.RouteExKt$encodeToString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final String invoke(@NotNull Parcel it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.writeParcelable(parcelable, 0);
                return Base64.encodeToString(it.marshall(), 0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objM56245e0, "use(...)");
        return (String) objM56245e0;
    }

    /* JADX INFO: renamed from: I */
    public static final <T> T m56218I(Bundle bundle, String str, T t11, Function1<? super String, ? extends T> function1) {
        T t12 = (T) m56219J(bundle, str, function1);
        if (t12 == null) {
            return t11;
        }
        return t12;
    }
}
