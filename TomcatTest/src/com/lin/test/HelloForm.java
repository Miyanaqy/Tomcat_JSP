p a c k a g e   c o m . l i n . t e s t ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 / * *  
   *   S e r v l e t   i m p l e m e n t a t i o n   c l a s s   H e l l o F o r m  
   * /  
 @ W e b S e r v l e t ( " / H e l l o F o r m " )  
 p u b l i c   c l a s s   H e l l o F o r m   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
                
         / * *  
           *   @ s e e   H t t p S e r v l e t # H t t p S e r v l e t ( )  
           * /  
         p u b l i c   H e l l o F o r m ( )   {  
                 s u p e r ( ) ;  
                 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
         }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 r e s p o n s e . s e t C o n t e n t T y p e ( " t e x t / h t m l ; c h a r s e t = U T F - 8 " ) ;  
 	 	  
 	 	 P r i n t W r i t e r   o u t   =   r e s p o n s e . g e t W r i t e r ( ) ;  
 	 	 S t r i n g   t i t l e   =   " O(u  g e t �e�l���Sh�USpenc" ;  
 	 	 S t r i n g   n a m e   = n e w   S t r i n g ( r e q u e s t . g e t P a r a m e t e r ( " n a m e " ) . g e t B y t e s ( " I S O 8 8 5 9 - 1 " ) , " U T F - 8 " ) ;  
 	 	 S t r i n g   d o c T y p e   =   " < ! D O C T Y P E   h t m l >   \ n " ;  
 	 	 o u t . p r i n t l n ( d o c T y p e   +    
 	 	 	 	 " < h t m l > \ n "   +    
 	 	 	 	 " < h e a d > < t i t l e > "   +   t i t l e   +   " < / t i t l e > < / h e a d > \ n "   +  
 	 	 	         " < b o d y   b g c o l o r = \ " # f 0 f 0 f 0 \ " > \ n "   +  
 	 	 	         " < h 1   a l i g n = \ " c e n t e r \ " > "   +   t i t l e   +   " < / h 1 > \ n "   +  
 	 	 	         " < u l > \ n "   +  
 	 	 	         "     < l i > < b > �z�pT< / b > �"  
 	 	 	         +   n a m e   +   " \ n "   +  
 	 	 	         "     < l i > < b > Q@W< / b > �"  
 	 	 	         +   r e q u e s t . g e t P a r a m e t e r ( " u r l " )   +   " \ n "   +  
 	 	 	         " < / u l > \ n "   +  
 	 	 	         " < / b o d y > < / h t m l > " ) ;  
 	 }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 d o G e t ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
 }  
 