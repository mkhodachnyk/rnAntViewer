using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Ant.Weaver.RNAntWeaver
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAntWeaverModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAntWeaverModule"/>.
        /// </summary>
        internal RNAntWeaverModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAntWeaver";
            }
        }
    }
}
