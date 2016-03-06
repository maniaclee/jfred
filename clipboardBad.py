__author__ = 'lipeng'



from AppKit import *

def getFromClipboard():
    pb = NSPasteboard.generalPasteboard()
    pbstring = pb.stringForType_(NSStringPboardType)
    return pbstring
    # return u"Pastboard string: %s".encode("utf-8") % repr(pbstring)

print getFromClipboard()