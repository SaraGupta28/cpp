/*

        /////////     /////        ////      ////
        //           //   //      //   //  // //
        //////      //    //     //     //   //
            //     // /// //    //          //
      ////////    //      //   //          //
*/

#include<bits/stdc++.h>
#include<assert.h>
using namespace std;
typedef long long int ll;
typedef unsigned long long ull;
#define Fast ios_base::sync_with_stdio(false); cin.tie(NULL);
#define fo(i,s,n) for(int i=s;i<n;i++)
#define mod 1000000007


int main()
{
    Fast
    ll n,q;
    cin>>n>>q;
    ll a[n];
    fo(i,0,n)
    {
        cin>>a[i];
    }
    while(q--)
    {
        int b,e;
        cin>>b>>e;
        set<ll>s;
        for(int mask=0;mask<(1<<n);mask++)
        {
            ll sum=0;
            for(int i=0;i<n;i++)
            {
                if(mask&(1<<i))
                {
                    sum+=a[i];
                }
            }
            if(sum>=b&&sum<=e)
                    s.insert(sum);
        }
        cout<<s.size()<<endl;
        s.clear();
    }
   
    return 0;
}