package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public class Asset {
	@Syscall("Neo.Asset.GetAssetId")
	public native byte[] assetId();

	@Syscall("Neo.Asset.GetAssetType")
	public native byte assetType();

	@Syscall("Neo.Asset.GetAmount")
	public native long amount();

	@Syscall("Neo.Asset.GetAvailable")
	public native long available();

	@Syscall("Neo.Asset.GetPrecision")
	public native byte precision();

	@Syscall("Neo.Asset.GetOwner")
	public native byte[] owner();

	@Syscall("Neo.Asset.GetAdmin")
	public native byte[] admin();

	@Syscall("Neo.Asset.GetIssuer")
	public native byte[] issuer();

	@Syscall("Neo.Asset.Create")
	public native static Asset create(byte asset_type, String name, long amount, byte precision, byte[] owner,
			byte[] admin, byte[] issuer);

	@Syscall("Neo.Asset.Renew")
	public native int renew(byte years);
}
