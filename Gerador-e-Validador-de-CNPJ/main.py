import cnpj

usuario = ' '
while usuario not in 'GV':
       usuario = input('\nPra gerar um CNPJ digite "G" pra validar "V": ').strip().upper()[0]
       
if usuario == 'V':
    usuario_cnpj = input('Digite o CNPJ: ')
    if cnpj.valida(usuario_cnpj):
        print(f'{usuario_cnpj} é VÁLIDO')
    else:
        print(f'{usuario_cnpj} é INVÁLIDO')
else:
    novo_cnpj = cnpj.gera()
    formatado = cnpj.formata(novo_cnpj)
    print(formatado)
