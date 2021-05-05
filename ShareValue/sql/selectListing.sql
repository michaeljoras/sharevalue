SELECT sharevalues.wkn, sharevalues.isin, sharevalues.name, sharevalues.geopakterm, sharevalues.geopak, 
sharevalues.payield, sharevalues.gk, sharevalues.vr, sharelisting.listing, sharevalues.comment
 FROM ShareValue.sharevalues, ShareValue.sharelisting 
 where sharevalues.wkn = sharelisting.wkn and payield > 12 and geopakterm >= 4 and vr <= 4 order by payield desc ;