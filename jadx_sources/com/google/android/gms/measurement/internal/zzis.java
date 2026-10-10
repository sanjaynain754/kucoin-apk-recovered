package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzis implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjc zzc;

    public zzis(zzjc zzjcVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x044a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0460 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x046b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0471 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5 A[Catch: all -> 0x007b, SecurityException -> 0x0213, TryCatch #0 {SecurityException -> 0x0213, blocks: (B:60:0x01ed, B:62:0x01f5, B:64:0x01fb), top: B:128:0x01ed, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0220 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0245 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x025e A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0262 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0290 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028a->B:87:0x0290, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x032b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x034c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x038a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e8 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpf zzpfVar;
        String strZzc;
        zzpf zzpfVar2;
        List listZzn;
        Iterator it;
        zzpm zzpmVar;
        com.google.android.gms.internal.measurement.zziu[] zziuVarArr;
        int i11;
        zzpf zzpfVar3;
        zzib zzibVar;
        Bundle bundle;
        String str;
        String str2;
        zzbc zzbcVarZzf;
        zzpf zzpfVar4;
        Bundle bundle2;
        String str3;
        Object obj;
        boolean z11;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        zzbc zzbcVarZza;
        long j11;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzk;
        zzbe zzbeVar;
        zzbd zzbdVar;
        long jZzp;
        long jZzn;
        String strZzh;
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn;
        Object objZza;
        byte[] bArr2;
        zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        zzlo zzloVarZzn = zzjcVar.zzL().zzn();
        zzloVarZzn.zzg();
        zzib zzibVar2 = zzloVarZzn.zzu;
        zzib.zzL();
        zzbg zzbgVar = this.zza;
        Preconditions.checkNotNull(zzbgVar);
        String str4 = this.zzb;
        Preconditions.checkNotEmpty(str4);
        String str5 = zzbgVar.zza;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            zzloVarZzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        zzpf zzpfVar5 = zzloVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpfVar5.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpfVar5.zzj().zzu(str4);
            if (zzhVarZzu == null) {
                zzloVarZzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str4);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjk zzjkVarZzB = zzloVarZzn.zzg.zzB(str4);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzibVar2.zzB() && zzloVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjkVarZzB.zzo(zzjj.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjkVarZzB.zzk());
                    if (zzjkVarZzB.zzo(zzjj.AD_STORAGE) && zzhVarZzu.zzac()) {
                        Pair pairZzc = zzpfVar5.zzq().zzc(zzhVarZzu.zzc(), zzjkVarZzB);
                        if (!zzhVarZzu.zzac() || TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                            zzib zzibVar3 = zzloVarZzn.zzu;
                            zzibVar3.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzibVar3.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzibVar3.zzu().zzb());
                            zzicVarZzaE.zzH(zzibVar3.zzu().zzc());
                            if (zzjkVarZzB.zzo(zzjj.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlo.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpfVar2 = zzloVarZzn.zzg;
                            listZzn = zzpfVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpmVar = null;
                                    break;
                                }
                                zzpmVar = (zzpm) it.next();
                            } while (!"_lte".equals(zzpmVar.zzc));
                            if (zzpmVar != null) {
                                zzpm zzpmVar2 = new zzpm(strZzc, "auto", "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar2);
                                zzpfVar2.zzj().zzl(zzpmVar2);
                            } else {
                                zzpm zzpmVar3 = new zzpm(strZzc, "auto", "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar3);
                                zzpfVar2.zzj().zzl(zzpmVar3);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i11 = 0; i11 < listZzn.size(); i11++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpm) listZzn.get(i11)).zzc);
                                zzitVarZzm.zza(((zzpm) listZzn.get(i11)).zzd);
                                zzpfVar2.zzp().zzc(zzitVarZzm, ((zzpm) listZzn.get(i11)).zze);
                                zziuVarArr[i11] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpfVar3 = zzloVarZzn.zzg;
                            zzpfVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpfVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgu zzguVarZza = zzgu.zza(zzbgVar);
                            zzibVar = zzloVarZzn.zzu;
                            zzpo zzpoVarZzk = zzibVar.zzk();
                            bundle = zzguVarZza.zzd;
                            zzpoVarZzk.zzI(bundle, zzpfVar2.zzj().zzW(str4));
                            zzibVar.zzk().zzG(zzguVarZza, zzibVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzibVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzibVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzibVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzibVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj = zzpfVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpfVar4 = zzpfVar3;
                                obj = null;
                                z11 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j11 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpfVar4 = zzpfVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z11 = true;
                                zzhzVar = zzhzVarZzh;
                                long j12 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j11 = j12;
                            }
                            zzbc zzbcVar = zzbcVarZza;
                            zzpfVar2.zzj().zzh(zzbcVar);
                            zzpf zzpfVar6 = zzpfVar4;
                            boolean z12 = z11;
                            zzbb zzbbVar = new zzbb(zzloVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j11, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar.zzd);
                            zzhrVarZzk.zzl(zzbbVar.zzb);
                            zzhrVarZzk.zzq(zzbbVar.zze);
                            zzbeVar = zzbbVar.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                objZza = zzbeVar.zza(next);
                                if (objZza != null) {
                                    zzpfVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza.zzb(zzbcVar.zzc);
                            zzhtVarZza.zza(str2);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(zzpfVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzqu.zza();
                            if (zzibVar.zzc().zzp(str4, zzfx.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzibVar.zzc().zzi();
                            zzicVarZzaE.zzO(130000L);
                            zzicVarZzaE.zzs(zzibVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z12);
                            zzpfVar6.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpfVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpfVar2.zzj().zzc();
                            zzpfVar2.zzj().zzd();
                            return zzpfVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                        }
                        try {
                            zzicVarZzaE.zzQ(zzlo.zzc((String) pairZzc.first, Long.toString(zzbgVar.zzd)));
                            Object obj2 = pairZzc.second;
                            if (obj2 != null) {
                                zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                            }
                            zzib zzibVar4 = zzloVarZzn.zzu;
                            zzibVar4.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzibVar4.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzibVar4.zzu().zzb());
                            zzicVarZzaE.zzH(zzibVar4.zzu().zzc());
                            if (zzjkVarZzB.zzo(zzjj.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlo.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpfVar2 = zzloVarZzn.zzg;
                            listZzn = zzpfVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpmVar = null;
                                    break;
                                }
                                zzpmVar = (zzpm) it.next();
                            } while (!"_lte".equals(zzpmVar.zzc));
                            if (zzpmVar != null) {
                                zzpm zzpmVar4 = new zzpm(strZzc, "auto", "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar4);
                                zzpfVar2.zzj().zzl(zzpmVar4);
                            } else {
                                zzpm zzpmVar5 = new zzpm(strZzc, "auto", "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar5);
                                zzpfVar2.zzj().zzl(zzpmVar5);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i11 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm2.zzb(((zzpm) listZzn.get(i11)).zzc);
                                zzitVarZzm2.zza(((zzpm) listZzn.get(i11)).zzd);
                                zzpfVar2.zzp().zzc(zzitVarZzm2, ((zzpm) listZzn.get(i11)).zze);
                                zziuVarArr[i11] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm2.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpfVar3 = zzloVarZzn.zzg;
                            zzpfVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpfVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgu zzguVarZza2 = zzgu.zza(zzbgVar);
                            zzibVar = zzloVarZzn.zzu;
                            zzpo zzpoVarZzk2 = zzibVar.zzk();
                            bundle = zzguVarZza2.zzd;
                            zzpoVarZzk2.zzI(bundle, zzpfVar2.zzj().zzW(str4));
                            zzibVar.zzk().zzG(zzguVarZza2, zzibVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzibVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzibVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzibVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzibVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj2 = zzpfVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj2.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpfVar4 = zzpfVar3;
                                obj = null;
                                z11 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j11 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpfVar4 = zzpfVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z11 = true;
                                zzhzVar = zzhzVarZzh;
                                long j13 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j11 = j13;
                            }
                            zzbc zzbcVar2 = zzbcVarZza;
                            zzpfVar2.zzj().zzh(zzbcVar2);
                            zzpf zzpfVar7 = zzpfVar4;
                            boolean z13 = z11;
                            zzbb zzbbVar2 = new zzbb(zzloVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j11, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar2.zzd);
                            zzhrVarZzk.zzl(zzbbVar2.zzb);
                            zzhrVarZzk.zzq(zzbbVar2.zze);
                            zzbeVar = zzbbVar2.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next2 = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next2);
                                objZza = zzbeVar.zza(next2);
                                if (objZza != null) {
                                    zzpfVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbcVar2.zzc);
                            zzhtVarZza2.zza(str2);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVarZzaE.zzap(zzieVarZza2);
                            zzicVarZzaE.zzaf(zzpfVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzqu.zza();
                            if (zzibVar.zzc().zzp(str4, zzfx.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzibVar.zzc().zzi();
                            zzicVarZzaE.zzO(130000L);
                            zzicVarZzaE.zzs(zzibVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z13);
                            zzpfVar7.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpfVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpfVar2.zzj().zzc();
                            zzpfVar2.zzj().zzd();
                            return zzpfVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                        } catch (SecurityException e11) {
                            zzloVarZzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e11.getMessage());
                            bArr = new byte[0];
                            zzpfVar = zzloVarZzn.zzg;
                        }
                    } else {
                        zzib zzibVar5 = zzloVarZzn.zzu;
                        zzibVar5.zzu().zzw();
                        zzicVarZzaE.zzF(Build.MODEL);
                        zzibVar5.zzu().zzw();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) zzibVar5.zzu().zzb());
                        zzicVarZzaE.zzH(zzibVar5.zzu().zzc());
                        try {
                            if (zzjkVarZzB.zzo(zzjj.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlo.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpfVar2 = zzloVarZzn.zzg;
                            listZzn = zzpfVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpmVar = null;
                                    break;
                                }
                                zzpmVar = (zzpm) it.next();
                            } while (!"_lte".equals(zzpmVar.zzc));
                            if (zzpmVar != null || zzpmVar.zze == null) {
                                zzpm zzpmVar6 = new zzpm(strZzc, "auto", "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar6);
                                zzpfVar2.zzj().zzl(zzpmVar6);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i11 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm3 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm3.zzb(((zzpm) listZzn.get(i11)).zzc);
                                zzitVarZzm3.zza(((zzpm) listZzn.get(i11)).zzd);
                                zzpfVar2.zzp().zzc(zzitVarZzm3, ((zzpm) listZzn.get(i11)).zze);
                                zziuVarArr[i11] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm3.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpfVar3 = zzloVarZzn.zzg;
                            zzpfVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpfVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgu zzguVarZza3 = zzgu.zza(zzbgVar);
                            zzibVar = zzloVarZzn.zzu;
                            zzpo zzpoVarZzk3 = zzibVar.zzk();
                            bundle = zzguVarZza3.zzd;
                            zzpoVarZzk3.zzI(bundle, zzpfVar2.zzj().zzW(str4));
                            zzibVar.zzk().zzG(zzguVarZza3, zzibVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzibVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzibVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzibVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzibVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj3 = zzpfVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj3.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpfVar4 = zzpfVar3;
                                obj = null;
                                z11 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j11 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpfVar4 = zzpfVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z11 = true;
                                zzhzVar = zzhzVarZzh;
                                long j14 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j11 = j14;
                            }
                            zzbc zzbcVar3 = zzbcVarZza;
                            zzpfVar2.zzj().zzh(zzbcVar3);
                            zzpf zzpfVar8 = zzpfVar4;
                            boolean z14 = z11;
                            zzbb zzbbVar3 = new zzbb(zzloVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j11, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar3.zzd);
                            zzhrVarZzk.zzl(zzbbVar3.zzb);
                            zzhrVarZzk.zzq(zzbbVar3.zze);
                            zzbeVar = zzbbVar3.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next3 = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next3);
                                objZza = zzbeVar.zza(next3);
                                if (objZza != null) {
                                    zzpfVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza3 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza3 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza3.zzb(zzbcVar3.zzc);
                            zzhtVarZza3.zza(str2);
                            zzieVarZza3.zza(zzhtVarZza3);
                            zzicVarZzaE.zzap(zzieVarZza3);
                            zzicVarZzaE.zzaf(zzpfVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzqu.zza();
                            if (zzibVar.zzc().zzp(str4, zzfx.zzaM) && strZzh != null) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzibVar.zzc().zzi();
                            zzicVarZzaE.zzO(130000L);
                            zzicVarZzaE.zzs(zzibVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z14);
                            zzpfVar8.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpfVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpfVar2.zzj().zzc();
                            zzpfVar2.zzj().zzd();
                            try {
                                return zzpfVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e12) {
                                zzloVarZzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgt.zzl(str4), e12);
                                return obj;
                            }
                        } catch (SecurityException e13) {
                            zzloVarZzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e13.getMessage());
                            bArr = new byte[0];
                            zzpfVar = zzloVarZzn.zzg;
                        }
                    }
                    zzpfVar.zzj().zzd();
                    return bArr;
                }
                zzloVarZzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str4);
                bArr2 = new byte[0];
            }
            zzpfVar5.zzj().zzd();
            return bArr2;
        } catch (Throwable th2) {
            zzloVarZzn.zzg.zzj().zzd();
            throw th2;
        }
    }
}
