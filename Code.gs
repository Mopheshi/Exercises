var ss = SpreadsheetApp.openByUrl("");

var sheetLaptop = ss.getSheetByName('Laptop');
var sheetDesktop = ss.getSheetByName('Desktop');
var sheetPrinter = ss.getSheetByName('Printer');
var sheetPDA = ss.getSheetByName('PDA');
var sheetTablet = ss.getSheetByName('Tablet');
var sheetUPS = ss.getSheetByName('UPS');
var sheetRelease = ss.getSheetByName('Release Database');
var sheetReturn = ss.getSheetByName('Return Database');
var sheetID = ss.getSheetByName('IDs');
var sheetSerial = ss.getSheetByName('Serials');

function doPost(e) {
  var action = e.parameter.action;

  if (action == 'Laptop') {
    return addLaptop(e);
  }

  if (action == 'Desktop') {
    return addDesktop(e);
  }

  if (action == 'Printer') {
    return addPrinter(e);
  }

  if (action == 'PDA') {
    return addPDA(e);
  }

  if (action == 'Tablet') {
    return addTablet(e);
  }
  if (action == 'UPS') {
    return addUPS(e);
  }

  if (action == 'Release') {
    return addRelease(e);
  }

  if (action == 'Return') {
    return addReturn(e);
  }

  if (action == 'updateLaptop') {
    return updateLaptop(e);
  }

  if (action == 'updateDesktop') {
    return updateDesktop(e);
  }

  if (action == 'updatePrinter') {
    return updatePrinter(e);
  }

  if (action == 'updateTablet') {
    return updateTablet(e);
  }

  if (action == 'updatePDA') {
    return updatePDA(e);
  }

  if (action == 'updateUPS') {
    return updateUPS(e);
  }
}

function doGet(e) {
  var action = e.parameter.action;
  if (action == 'getIDs') {
    return getIDs(e);
  }

  if (action == 'getSerials') {
    return getSerials(e);
  }

  if (action == 'getLaptop') {
    return getLaptop(e);
  }

  if (action == 'getDesktop') {
    return getDesktop(e);
  }

  if (action == 'getPrinter') {
    return getPrinter(e);
  }

  if (action == 'getPDA') {
    return getPDA(e);
  }

  if (action == 'getTablet') {
    return getTablet(e);
  }

  if (action == 'getUPS') {
    return getUPS(e);
  }
}

function addLaptop(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetLaptop.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetLaptop.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('Laptop successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addDesktop(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetDesktop.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetDesktop.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('Desktop successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addPrinter(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetPrinter.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetPrinter.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('Printer successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addPDA(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetPDA.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetPDA.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('PDA successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addTablet(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetTablet.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetTablet.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('Tablet successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addUPS(e) {
  var date = new Date();
  var id = e.parameter.ID + sheetUPS.getLastRow();
  var serialNumber = e.parameter.SerialNumber;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  sheetUPS.appendRow([id, serialNumber, staffName, staffID, deviceType, placeAllocated, department, date, state]);
  sheetID.appendRow([id]);
  sheetSerial.appendRow([serialNumber]);
  return ContentService.createTextOutput('UPS successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addRelease(e) {
  var date = new Date();
  var npcCode = e.parameter.NPCCode;
  var receiversName = e.parameter.ReceiversName;
  var receiversID = e.parameter.ReceiversID;
  var allocatorName = e.parameter.AllocatorName;
  var allocatorID = e.parameter.AllocatorID;
  var at = e.parameter.AllocatedAt;
  sheetRelease.appendRow([npcCode, receiversName, receiversID, allocatorName, allocatorID, date, at]);
  return ContentService.createTextOutput('Dispatched item successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function addReturn(e) {
  var date = new Date();
  var id = e.parameter.NPCCode;
  var retrieversName = e.parameter.RetrieversName;
  var retrieversID = e.parameter.RetrieversID;
  var returnersName = e.parameter.ReturnersName;
  var returnersID = e.parameter.ReturnersID;
  var officeAt = e.parameter.ReturningAt;
  var condition = e.parameter.Condition;
  sheetReturn.appendRow([id, retrieversName, retrieversID, returnersName, returnersID, officeAt, condition, date]);
  return ContentService.createTextOutput('Returned item successfully synchronized to cloud!').setMimeType(ContentService.MimeType.TEXT);
}

function updateLaptop(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetLaptop.getLastRow(); i++) {
    var sn = sheetLaptop.getRange(i, 1).getValue();
    if (sn == id) {
      sheetLaptop.getRange(i, 3).setValue(staffName);
      sheetLaptop.getRange(i, 4).setValue(staffID);
      sheetLaptop.getRange(i, 5).setValue(deviceType);
      sheetLaptop.getRange(i, 6).setValue(placeAllocated);
      sheetLaptop.getRange(i, 7).setValue(department);
      sheetLaptop.getRange(i, 8).setValue(date);
      sheetLaptop.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "Laptop updated successfully!";
  } else {
    var result = "Unable to update laptop...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function updateDesktop(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetLaptop.getLastRow(); i++) {
    var sn = sheetLaptop.getRange(i, 1).getValue();
    if (sn == id) {
      sheetLaptop.getRange(i, 3).setValue(staffName);
      sheetLaptop.getRange(i, 4).setValue(staffID);
      sheetLaptop.getRange(i, 5).setValue(deviceType);
      sheetLaptop.getRange(i, 6).setValue(placeAllocated);
      sheetLaptop.getRange(i, 7).setValue(department);
      sheetLaptop.getRange(i, 8).setValue(date);
      sheetLaptop.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "Desktop updated successfully!";
  } else {
    var result = "Unable to update desktop...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function updatePrinter(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetPrinter.getLastRow(); i++) {
    var sn = sheetPrinter.getRange(i, 1).getValue();
    if (sn == id) {
      sheetPrinter.getRange(i, 3).setValue(staffName);
      sheetPrinter.getRange(i, 4).setValue(staffID);
      sheetPrinter.getRange(i, 5).setValue(deviceType);
      sheetPrinter.getRange(i, 6).setValue(placeAllocated);
      sheetPrinter.getRange(i, 7).setValue(department);
      sheetPrinter.getRange(i, 8).setValue(date);
      sheetPrinter.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "Printer updated successfully!";
  } else {
    var result = "Unable to update printer...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function updatePDA(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetPDA.getLastRow(); i++) {
    var sn = sheetPDA.getRange(i, 1).getValue();
    if (sn == id) {
      sheetPDA.getRange(i, 3).setValue(staffName);
      sheetPDA.getRange(i, 4).setValue(staffID);
      sheetPDA.getRange(i, 5).setValue(deviceType);
      sheetPDA.getRange(i, 6).setValue(placeAllocated);
      sheetPDA.getRange(i, 7).setValue(department);
      sheetPDA.getRange(i, 8).setValue(date);
      sheetPDA.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "PDA updated successfully!";
  } else {
    var result = "Unable to update PDA...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function updateTablet(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetTablet.getLastRow(); i++) {
    var sn = sheetTablet.getRange(i, 1).getValue();
    if (sn == id) {
      sheetTablet.getRange(i, 3).setValue(staffName);
      sheetTablet.getRange(i, 4).setValue(staffID);
      sheetTablet.getRange(i, 5).setValue(deviceType);
      sheetTablet.getRange(i, 6).setValue(placeAllocated);
      sheetTablet.getRange(i, 7).setValue(department);
      sheetTablet.getRange(i, 8).setValue(date);
      sheetTablet.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "Tablet updated successfully!";
  } else {
    var result = "Unable to update tablet...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function updateUPS(e) {
  var date = new Date();
  var id = e.parameter.ID;
  var staffName = e.parameter.StaffName;
  var staffID = e.parameter.StaffID;
  var deviceType = e.parameter.DeviceType;
  var placeAllocated = e.parameter.PlaceAllocated;
  var department = e.parameter.Department;
  var state = e.parameter.State;
  var flag = 0;

  for (var i = 1; i <= sheetUPS.getLastRow(); i++) {
    var sn = sheetUPS.getRange(i, 1).getValue();
    if (sn == id) {
      sheetUPS.getRange(i, 3).setValue(staffName);
      sheetUPS.getRange(i, 4).setValue(staffID);
      sheetUPS.getRange(i, 5).setValue(deviceType);
      sheetUPS.getRange(i, 6).setValue(placeAllocated);
      sheetUPS.getRange(i, 7).setValue(department);
      sheetUPS.getRange(i, 8).setValue(date);
      sheetUPS.getRange(i, 9).setValue(state);
      flag = 1;
    }
  }

  if (flag == 1) {
    var result = "Laptop updated successfully!";
  } else {
    var result = "Unable to update laptop...";
  }

  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
}

function getIDs(e) {
  var records = {}

  // var rowsLaptop = sheetLaptop.getRange(2, 1, sheetLaptop.getLastRow() - 1, sheetLaptop.getLastColumn()).getValues();
  // var rowsDesktop = sheetDesktop.getRange(2, 1, sheetDesktop.getLastRow() - 1, sheetDesktop.getLastColumn()).getValues();
  // var rowsPrinter = sheetPrinter.getRange(2, 1, sheetPrinter.getLastRow() - 1, sheetPrinter.getLastColumn()).getValues();
  // var rowsPDA = sheetPDA.getRange(2, 1, sheetPDA.getLastRow() - 1, sheetPDA.getLastColumn()).getValues();
  // var rowsTablet = sheetTablet.getRange(2, 1, sheetTablet.getLastRow() - 1, sheetTablet.getLastColumn()).getValues();
  // var rowsRelease = sheetRelease.getRange(2, 1, sheetRelease.getLastRow() - 1, sheetRelease.getLastColumn()).getValues();
  // var rowsReturn = sheetReturn.getRange(2, 1, sheetReturn.getLastRow() - 1, sheetReturn.getLastColumn()).getValues();

  var rowsID = sheetID.getRange(2, 1, sheetID.getLastRow() - 1, sheetID.getLastColumn()).getValues();

  var data = []

  // for (var i = 0; i < rowsLaptop.length; i++) {
  //   var record = {};
  //   var rowLaptop = rowsLaptop[i];
  //   record["laptopID"] = rowLaptop[0];
  //   for (var j = 0; j < rowsDesktop.length; j++) {
  //     var rowDesktop = rowsDesktop[j];
  //     record["desktopID"] = rowDesktop[0];
  //     for (var k = 0; k < rowsPrinter.length; k++) {
  //       var rowPrinter = rowsPrinter[k];
  //       record["printerID"] = rowPrinter[0];
  //       for (var l = 0; l < rowsPDA.length; l++) {
  //         var rowPDA = rowsPDA[l];
  //         record["pdaID"] = rowPDA[0];
  //         for (var m = 0; m < rowsTablet.length; m++) {
  //           var rowTablet = rowsTablet[m];
  //           record["tabletID"] = rowTablet[0];
  //           for (var n = 0; n < rowsRelease.length; n++) {
  //             var rowRelease = rowsRelease[n];
  //             record["releaseID"] = rowRelease[0];
  //             for (var o = 0; o < rowsReturn.length; o++) {
  //               var rowReturn = rowsReturn[o];
  //               record["returnID"] = rowReturn[0];
  //             }
  //           }
  //         }
  //       }
  //     }
  //   }

  for (var i = 0; i < rowsID.length; i++) {
    var record = {};
    var rowID = rowsID[i];
    record["ID"] = rowID[0];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getSerials(e) {
  var records = {};

  var rowsSerial = sheetSerial.getRange(2, 1, sheetSerial.getLastRow() - 1, sheetSerial.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsSerial.length; i++) {
    var record = {};
    var rowSerial = rowsSerial[i];
    record["SN"] = rowSerial[0];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getLaptop(e) {
  var records = {};

  var rowsLaptop = sheetLaptop.getRange(2, 1, sheetLaptop.getLastRow() - 1, sheetLaptop.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsLaptop.length; i++) {
    var record = {};
    var rowLaptop = rowsLaptop[i];
    record["ID"] = rowLaptop[0];
    record["staffName"] = rowLaptop[2];
    record["staffID"] = rowLaptop[3];
    record["deviceType"] = rowLaptop[4];
    record["placeAllocated"] = rowLaptop[5];
    record["department"] = rowLaptop[6];
    record["state"] = rowLaptop[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getDesktop(e) {
  var records = {};

  var rowsDesktop = sheetDesktop.getRange(2, 1, sheetDesktop.getLastRow() - 1, sheetDesktop.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsDesktop.length; i++) {
    var record = {};
    var rowDesktop = rowsDesktop[i];
    record["ID"] = rowDesktop[0];
    record["staffName"] = rowDesktop[2];
    record["staffID"] = rowDesktop[3];
    record["deviceType"] = rowDesktop[4];
    record["placeAllocated"] = rowDesktop[5];
    record["department"] = rowDesktop[6];
    record["state"] = rowDesktop[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getPrinter(e) {
  var records = {};

  var rowsPrinter = sheetPrinter.getRange(2, 1, sheetPrinter.getLastRow() - 1, sheetPrinter.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsPrinter.length; i++) {
    var record = {};
    var rowPrinter = rowsPrinter[i];
    record["ID"] = rowPrinter[0];
    record["staffName"] = rowPrinter[2];
    record["staffID"] = rowPrinter[3];
    record["deviceType"] = rowPrinter[4];
    record["placeAllocated"] = rowPrinter[5];
    record["department"] = rowPrinter[6];
    record["state"] = rowPrinter[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getPDA(e) {
  var records = {};

  var rowsPDA = sheetPDA.getRange(2, 1, sheetPDA.getLastRow() - 1, sheetPDA.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsPDA.length; i++) {
    var record = {};
    var rowPDA = rowsPDA[i];
    record["ID"] = rowPDA[0];
    record["staffName"] = rowPDA[2];
    record["staffID"] = rowPDA[3];
    record["deviceType"] = rowPDA[4];
    record["placeAllocated"] = rowPDA[5];
    record["department"] = rowPDA[6];
    record["state"] = rowPDA[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getTablet(e) {
  var records = {};

  var rowsTablet = sheetTablet.getRange(2, 1, sheetTablet.getLastRow() - 1, sheetTablet.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsTablet.length; i++) {
    var record = {};
    var rowTablet = rowsTablet[i];
    record["ID"] = rowTablet[0];
    record["staffName"] = rowTablet[2];
    record["staffID"] = rowTablet[3];
    record["deviceType"] = rowTablet[4];
    record["placeAllocated"] = rowTablet[5];
    record["department"] = rowTablet[6];
    record["state"] = rowTablet[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}

function getUPS(e) {
  var records = {};

  var rowsUPS = sheetUPS.getRange(2, 1, sheetUPS.getLastRow() - 1, sheetUPS.getLastColumn()).getValues();

  var data = []

  for (var i = 0; i < rowsUPS.length; i++) {
    var record = {};
    var rowUPS = rowsUPS[i];
    record["ID"] = rowUPS[0];
    record["staffName"] = rowUPS[2];
    record["staffID"] = rowUPS[3];
    record["deviceType"] = rowUPS[4];
    record["placeAllocated"] = rowUPS[5];
    record["department"] = rowUPS[6];
    record["state"] = rowUPS[8];

    data.push(record);
  }

  records.items = data;
  var result = JSON.stringify(records);
  return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.JSON);
}