# Recovered resource class

`R.java` was repaired deterministically from the JADX fallback output. The 22 remaining JADX errors were all generated private constructors for resource-holder classes (`R.anim`, `R.drawable`, `R.layout`, etc.), not application/business methods.

Resource IDs were preserved exactly. The authoritative low-level resource classes remain under `smali_classes18/com/kubi/kucoin/R$*.smali`, and the decoded resource table is `res/values/public.xml`.
